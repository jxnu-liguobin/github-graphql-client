package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SecurityAdvisoriesQueryResponse extends GraphQLResult<Map<String, SecurityAdvisoryConnectionTO>> {

    private static final String OPERATION_NAME = "securityAdvisories";

    public SecurityAdvisoriesQueryResponse() {
    }

    public SecurityAdvisoryConnectionTO securityAdvisories() {
        Map<String, SecurityAdvisoryConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
