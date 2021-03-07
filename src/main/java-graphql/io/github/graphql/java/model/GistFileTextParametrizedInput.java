package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field text in type GistFile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GistFileTextParametrizedInput that = (GistFileTextParametrizedInput) obj;
        return Objects.equals(truncate, that.truncate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(truncate);
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
