package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryOwnerQueryResponse extends GraphQLResult<Map<String, RepositoryOwnerTO>> {

    private static final String OPERATION_NAME = "repositoryOwner";

    public RepositoryOwnerQueryResponse() {
    }

    public RepositoryOwnerTO repositoryOwner() {
        Map<String, RepositoryOwnerTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
