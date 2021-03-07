package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RemoveOutsideCollaboratorMutationResponse extends GraphQLResult<Map<String, RemoveOutsideCollaboratorPayloadTO>> {

    private static final String OPERATION_NAME = "removeOutsideCollaborator";

    public RemoveOutsideCollaboratorMutationResponse() {
    }

    public RemoveOutsideCollaboratorPayloadTO removeOutsideCollaborator() {
        Map<String, RemoveOutsideCollaboratorPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
