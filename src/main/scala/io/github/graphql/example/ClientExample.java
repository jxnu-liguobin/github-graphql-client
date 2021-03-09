package io.github.graphql.example;

import io.github.graphql.ServerConfig;
import io.github.graphql.client.GitHubJavaClient;
import io.github.graphql.j.model.UserQueryRequest;
import io.github.graphql.j.model.UserResponseProjection;
import io.github.graphql.j.model.UserTO;
import io.github.graphql.j.resolver.QueryResolver;

import java.util.Collections;

public class ClientExample {
    public static void main(String[] args) throws Exception {

        // 1. Use projection to select the preset returned.
        UserResponseProjection userResponseProjection = new UserResponseProjection().id().avatarUrl().login().resourcePath();

        QueryResolver queryResolver = GitHubJavaClient.newBuilder()
                // 2. Set the service endpoint.
                .setConfig(ServerConfig.apply("https://api.github.com/graphql", Collections.singletonMap("Authorization", "Bearer 5b64d19cff5d7eec10d99a9e4a3bf1bb0dc7491b"), 3))
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
