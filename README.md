DOING

GitHub graphql API of three languages contains Java, Kotlin, Scala, mainly for
testing [graphql-java-codegen]( https://github.com/kobylynskyi/graphql-java-codegen).

# Environment

- Java 1.8
- Scala 2.13.5
- Kotlin 1.4.31

# Java


1. Execute gradle task to generate Java codes `gradle graphqlCodegenJavaService`
2. Use `GitHubJavaClient` to build resolver client.
```java
public class ClientExample {
    public static void main(String[] args) throws Exception {

        // 1. Use projection to select the preset returned.
        UserResponseProjection userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath();

        QueryResolver queryResolver = GitHubJavaClient.newBuilder()
                // 2. Set the service endpoint.
                .setConfig(ServerConfig.apply("https://api.github.com/graphql", Collections.singletonMap("Authorization", "Bearer xx"), 3))
                .setProjection(userResponseProjection)
                // 3. Set the request corresponding to the resolver.
                .setRequest(UserQueryRequest.class)
                // 4. Set the resolver that needs a proxy.
                .build(QueryResolver.class);

        // 5. Use resolver to create a call.
        UserTO userTO = queryResolver.user("jxnu-liguobin"); // projection and request must correspond to the return type of the user method.
        System.out.println(userTO.toString());
    }
}
```
**Result**
```
MDQ6VXNlcjI5NDk2ODcz
```

# Scala


1. Execute gradle task to generate Scala codes `gradle graphqlCodegenScalaService`
2. Use `GitHubScalaClient` to build resolver client.
```scala

object ScalaClientExample extends App {

  val userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val config = ServerConfig("https://api.github.com/graphql", Map("Authorization" -> "Bearer xx"))
  val queryResolver = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    buildV1[QueryResolver, UserQueryRequest]

  val userTO = queryResolver.user("jxnu-liguobin")
  println(userTO.id) //tostring failed, because jackson use java Deserializer 


  // Use scalaDeserialize with ScalaObjectMapper, but ScalaObjectMapper will not be available in scala3.
  // Use Scala reflection instead of java reflection
  val userResponseProjection1 = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val queryResolver1 = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    buildV2[QueryResolver, UserQueryRequest, UserTO]

  val userTO1 = queryResolver1.user("jxnu-liguobin")
  println(userTO.toString())

}
```
**Result**
```json
{id: "MDQ6VXNlcjI5NDk2ODcz",isBountyHunter: false,isCampusExpert: false,isDeveloperProgramMember: false,isEmployee: false,isHireable: false,isSiteAdmin: false,isViewer: false,login: "jxnu-liguobin",pinnedItemsRemaining: 0,resourcePath: "/jxnu-liguobin",viewerCanChangePinnedItems: false,viewerCanCreateProjects: false,viewerCanFollow: false,viewerIsFollowing: false}
```


If there is a serialization error, it means that the Jackson configuration needs to be added. Please see [options](https://github.com/kobylynskyi/graphql-java-codegen/blob/develop/docs/codegen-options.md) and 
[jackson example](https://github.com/kobylynskyi/graphql-java-codegen/blob/de7335adc28529055cadacdc38af99c19f3e4c55/plugins/gradle/example-client/build.gradle#L87).