package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field logoUrl in type App
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class AppLogoUrlParametrizedInput implements GraphQLParametrizedInput {

    private Integer size;

    public AppLogoUrlParametrizedInput() {
    }

    public AppLogoUrlParametrizedInput(Integer size) {
        this.size = size;
    }

    public AppLogoUrlParametrizedInput size(Integer size) {
        this.size = size;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        return joiner.toString();
    }

}
