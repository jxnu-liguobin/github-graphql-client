package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateRepositoryMutationResponse extends GraphQLResult<Map<String, UpdateRepositoryPayloadTO>> {

    private static final String OPERATION_NAME = "updateRepository";

    public UpdateRepositoryMutationResponse() {
    }

    public UpdateRepositoryPayloadTO updateRepository() {
        Map<String, UpdateRepositoryPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
