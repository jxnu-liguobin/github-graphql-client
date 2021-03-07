package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateSubscriptionMutationResponse extends GraphQLResult<Map<String, UpdateSubscriptionPayloadTO>> {

    private static final String OPERATION_NAME = "updateSubscription";

    public UpdateSubscriptionMutationResponse() {
    }

    public UpdateSubscriptionPayloadTO updateSubscription() {
        Map<String, UpdateSubscriptionPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
