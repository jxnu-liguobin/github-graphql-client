package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LicensesQueryResponse extends GraphQLResult<Map<String, java.util.List<LicenseTO>>> {

    private static final String OPERATION_NAME = "licenses";

    public LicensesQueryResponse() {
    }

    public java.util.List<LicenseTO> licenses() {
        Map<String, java.util.List<LicenseTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
