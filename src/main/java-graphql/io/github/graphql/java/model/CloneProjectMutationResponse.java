package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CloneProjectMutationResponse extends GraphQLResult<Map<String, CloneProjectPayloadTO>> {

    private static final String OPERATION_NAME = "cloneProject";

    public CloneProjectMutationResponse() {
    }

    public CloneProjectPayloadTO cloneProject() {
        Map<String, CloneProjectPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
