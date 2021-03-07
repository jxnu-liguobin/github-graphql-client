package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReopenIssueMutationResponse extends GraphQLResult<Map<String, ReopenIssuePayloadTO>> {

    private static final String OPERATION_NAME = "reopenIssue";

    public ReopenIssueMutationResponse() {
    }

    public ReopenIssuePayloadTO reopenIssue() {
        Map<String, ReopenIssuePayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
