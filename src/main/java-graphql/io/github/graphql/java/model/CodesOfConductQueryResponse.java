package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CodesOfConductQueryResponse extends GraphQLResult<Map<String, java.util.List<CodeOfConductTO>>> {

    private static final String OPERATION_NAME = "codesOfConduct";

    public CodesOfConductQueryResponse() {
    }

    public java.util.List<CodeOfConductTO> codesOfConduct() {
        Map<String, java.util.List<CodeOfConductTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
