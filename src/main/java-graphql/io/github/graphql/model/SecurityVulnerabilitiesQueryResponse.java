package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SecurityVulnerabilitiesQueryResponse extends GraphQLResult<Map<String, SecurityVulnerabilityConnectionTO>> {

    private static final String OPERATION_NAME = "securityVulnerabilities";

    public SecurityVulnerabilitiesQueryResponse() {
    }

    public SecurityVulnerabilityConnectionTO securityVulnerabilities() {
        Map<String, SecurityVulnerabilityConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
