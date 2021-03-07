package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class LinkRepositoryToProjectMutationResponse extends GraphQLResult<Map<String, LinkRepositoryToProjectPayloadTO>> {

    private static final String OPERATION_NAME = "linkRepositoryToProject";

    public LinkRepositoryToProjectMutationResponse() {
    }

    public LinkRepositoryToProjectPayloadTO linkRepositoryToProject() {
        Map<String, LinkRepositoryToProjectPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
