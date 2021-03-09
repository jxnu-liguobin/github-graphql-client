DOING

GitHub graphql API of three languages contains Java, kotlin, Scala, mainly for
testing [graphql-java-codegen]( https://github.com/kobylynskyi/graphql-java-codegen).

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

# Scala


1. Execute gradle task to generate Java codes `gradle graphqlCodegenScalaService`
2. Use `GitHubScalaClient` to build resolver client.
```scala
object ScalaClientExample extends App {

  val userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath()
  val config = ServerConfig("https://api.github.com/graphql", Map("Authorization" -> "Bearer x"))
  val queryResolver = GithubScalaClient.newBuilder.setConfig(config).
    setProjection(userResponseProjection).
    build[QueryResolver, UserQueryRequest]

  val userTO = queryResolver.user("jxnu-liguobin")
  println(userTO.id) //TODO request tostring has bug.

}
```


If there is a serialization error, it means that the Jackson configuration needs to be added. Please see [options](https://github.com/kobylynskyi/graphql-java-codegen/blob/develop/docs/codegen-options.md) and 
[jackson example](https://github.com/kobylynskyi/graphql-java-codegen/blob/de7335adc28529055cadacdc38af99c19f3e4c55/plugins/gradle/example-client/build.gradle#L87).