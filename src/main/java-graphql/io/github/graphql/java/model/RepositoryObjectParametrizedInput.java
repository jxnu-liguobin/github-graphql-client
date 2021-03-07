package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field object in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryObjectParametrizedInput implements GraphQLParametrizedInput {

    private String expression;
    private String oid;

    public RepositoryObjectParametrizedInput() {
    }

    public RepositoryObjectParametrizedInput(String expression, String oid) {
        this.expression = expression;
        this.oid = oid;
    }

    public RepositoryObjectParametrizedInput expression(String expression) {
        this.expression = expression;
        return this;
    }

    public RepositoryObjectParametrizedInput oid(String oid) {
        this.oid = oid;
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
        final RepositoryObjectParametrizedInput that = (RepositoryObjectParametrizedInput) obj;
        return Objects.equals(expression, that.expression)
            && Objects.equals(oid, that.oid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, oid);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression));
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        return joiner.toString();
    }

}
