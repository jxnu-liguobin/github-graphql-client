package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CodeOfConductQueryResponse extends GraphQLResult<Map<String, CodeOfConductTO>> {

    private static final String OPERATION_NAME = "codeOfConduct";

    public CodeOfConductQueryResponse() {
    }

    public CodeOfConductTO codeOfConduct() {
        Map<String, CodeOfConductTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
