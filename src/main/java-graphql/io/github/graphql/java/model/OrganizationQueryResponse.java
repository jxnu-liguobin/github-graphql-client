package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationQueryResponse extends GraphQLResult<Map<String, OrganizationTO>> {

    private static final String OPERATION_NAME = "organization";

    public OrganizationQueryResponse() {
    }

    public OrganizationTO organization() {
        Map<String, OrganizationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
