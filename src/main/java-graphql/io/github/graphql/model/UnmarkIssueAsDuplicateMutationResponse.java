package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnmarkIssueAsDuplicateMutationResponse extends GraphQLResult<Map<String, UnmarkIssueAsDuplicatePayloadTO>> {

    private static final String OPERATION_NAME = "unmarkIssueAsDuplicate";

    public UnmarkIssueAsDuplicateMutationResponse() {
    }

    public UnmarkIssueAsDuplicatePayloadTO unmarkIssueAsDuplicate() {
        Map<String, UnmarkIssueAsDuplicatePayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
