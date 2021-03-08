package io.github.graphql.common;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface Execution {

    default Object executeGraphQL(ServerConfig config, boolean isCollection, String entityClassName, GraphQLOperationRequest request, GraphQLResponseProjection projection) {
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        Future<Object> resultFuture;
        Object ret = null;
        try {
            resultFuture = OkHttp.runQuery(config, isCollection, graphQLRequest, entityClassName);
            ret = Await.result(resultFuture, Duration.apply(10, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
        return ret;
    }
}