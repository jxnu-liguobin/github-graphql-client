package io.github.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface Execution {

    default Object executeGraphQL(ServerConfig config, boolean isCollection, String entityClassName,
                                  GraphQLOperationRequest request, GraphQLResponseProjection projection) {
        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        Future<Object> resultFuture;
        Object ret;
        try {
            resultFuture = OkHttp.runQuery(config, isCollection, graphQLRequest, entityClassName);
            ret = Await.result(resultFuture, Duration.apply(10, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException e) {
            throw new ExecuteException("execute failed: ", e.getLocalizedMessage(), e);
        }
        return ret;
    }
}