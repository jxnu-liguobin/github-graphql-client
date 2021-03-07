package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class LicenseQueryResponse extends GraphQLResult<Map<String, LicenseTO>> {

    private static final String OPERATION_NAME = "license";

    public LicenseQueryResponse() {
    }

    public LicenseTO license() {
        Map<String, LicenseTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
