package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field object in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
