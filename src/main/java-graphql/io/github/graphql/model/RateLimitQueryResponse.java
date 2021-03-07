package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RateLimitQueryResponse extends GraphQLResult<Map<String, RateLimitTO>> {

    private static final String OPERATION_NAME = "rateLimit";

    public RateLimitQueryResponse() {
    }

    public RateLimitTO rateLimit() {
        Map<String, RateLimitTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
