# GitHub GraphQL client

[![Scala CI](https://github.com/jxnu-liguobin/github-graphql-client/actions/workflows/scala.yml/badge.svg)](https://github.com/jxnu-liguobin/github-graphql-client/actions/workflows/scala.yml)

GitHub GraphQL client implement by proxy, mainly for
testing [graphql-java-codegen](https://github.com/kobylynskyi/graphql-java-codegen). Support Java, Kotlin, Scala.

[A Chinese SDK Example which does not use jdk proxy](https://github.com/growingio/growingio-graphql-javasdk)

There are many classes in the three languages, which will lead to slow compilation and large memory requirement.
Therefore, a single language should be used for testing, and you should enable parallel compilation.

# Environment

- Java 1.8
- Scala 2.13.5
- Kotlin 1.4.0
- graphql-java-codegen 4.1.5

## Source code description

- `src/main/resources` It contains github graphql schema file and code generation configuration of the three languages.
- `src/main/scala` It is mainly implemented by Scala, which provides Scala proxy client by Scala reflection and Java
  reflection, and Java proxy client by Java reflection.
- `src/main/kotlin` It is implemented by Kotlin, which provides Kotlin proxy client by Java reflection.

# Java

1. Execute gradle task to generate Java codes `gradle graphqlCodegenJavaService`
2. Use `GitHubJavaClient` to build resolver client.

```java
public class JavaClientExample {
    public static void main(String[] args) throws Exception {

        // 1. Use projection to select the preset returned.
        UserResponseProjection userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath();

        QueryResolver queryResolver = GitHubJavaClient.newBuilder()
                // 2. Set the service endpoint.
                .setConfig(ServerConfig.apply("https://api.github.com/graphql", Collections.singletonMap("Authorization", "Bearer xx")))
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

```
{id: "MDQ6VXNlcjI5NDk2ODcz",isBountyHunter: false,isCampusExpert: false,isDeveloperProgramMember: false,isEmployee: false,isHireable: false,isSiteAdmin: false,isViewer: false,login: "jxnu-liguobin",pinnedItemsRemaining: 0,resourcePath: "/jxnu-liguobin",viewerCanChangePinnedItems: false,viewerCanCreateProjects: false,viewerCanFollow: false,viewerIsFollowing: false}
```

# Kotlin

1. Execute gradle task to generate Kotlin codes `gradle graphqlCodegenKotlinService`
2. Use `GitHubKotlinClient` to build resolver client.

```kotlin
object KotlinClientExample {

  @JvmStatic
  fun main(args: Array<String>) {
    // Since Kotlin has a mandatory non-null for fields, a field-less interface test is used here.
    val rateLimitResponseProjection = RateLimitResponseProjection().`all$`(1)
    val queryResolver = GithubKotlinClient.newBuilder()
      .setConfig(
        ServerConfigAdapter(
          "https://api.github.com/graphql",
          mapOf(Pair("Authorization", "Bearer xx"))
        )
      )
      .setProjection(rateLimitResponseProjection).build<QueryResolver, RateLimitQueryRequest>()

    val rateLimit = queryResolver.rateLimit(true)
    println(rateLimit.toString())
  }
}
```

**Result**

```
{ cost: 1, limit: 5000, nodeCount: 0, remaining: 4991, resetAt: "2021-03-12T03:44:44Z" }
```

If there is a serialization error, it means that the Jackson configuration needs to be added. Please
see [options](https://github.com/kobylynskyi/graphql-java-codegen/blob/develop/docs/codegen-options.md) and
[jackson example](https://github.com/kobylynskyi/graphql-java-codegen/blob/de7335adc28529055cadacdc38af99c19f3e4c55/plugins/gradle/example-client/build.gradle#L87)
.