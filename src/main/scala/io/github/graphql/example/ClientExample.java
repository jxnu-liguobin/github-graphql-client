package io.github.graphql.example;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.github.graphql.ServerConfig;
import io.github.graphql.client.GitHubJavaClient;
import io.github.graphql.j.model.CodeOfConductQueryRequest;
import io.github.graphql.j.model.CodeOfConductResponseProjection;
import io.github.graphql.j.resolver.QueryResolver;

import java.util.Collections;

public class ClientExample {
    public static void main(String[] args) throws Exception {

        GraphQLResponseProjection codeOfConductResponseProjection = new CodeOfConductResponseProjection().all$();

        QueryResolver queryResolver = GitHubJavaClient.newBuilder()
                .setConfig(ServerConfig.apply("https://api.github.com/graphql", Collections.singletonMap("Authorization", ""), 3))
                .setProjection(codeOfConductResponseProjection)
                .setRequest(CodeOfConductQueryRequest.class)
                .build(QueryResolver.class);

        queryResolver.codeOfConduct("hello");
    }
}
