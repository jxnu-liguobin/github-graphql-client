package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field text in type GistFile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class GistFileTextParametrizedInput implements GraphQLParametrizedInput {

    private Integer truncate;

    public GistFileTextParametrizedInput() {
    }

    public GistFileTextParametrizedInput(Integer truncate) {
        this.truncate = truncate;
    }

    public GistFileTextParametrizedInput truncate(Integer truncate) {
        this.truncate = truncate;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (truncate != null) {
            joiner.add("truncate: " + GraphQLRequestSerializer.getEntry(truncate));
        }
        return joiner.toString();
    }

}
