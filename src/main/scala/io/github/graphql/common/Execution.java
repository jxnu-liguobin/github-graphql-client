package io.github.graphql.common;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.github.graphql.common.OkHttp;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeoutException;

public interface Execution {

    default Object executeHttp(String entityClazzName, GraphQLOperationRequest request, GraphQLResponseProjection projection) {
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        Future<Object> resultFuture;
        Object ret = null;
        try {
            resultFuture = OkHttp.runQuery(graphQLRequest, entityClazzName);
            ret = Await.result(resultFuture, Duration.Inf());
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
        return ret;
    }
}