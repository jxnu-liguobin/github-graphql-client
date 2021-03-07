package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field labels in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryLabelsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private String query;

    public RepositoryLabelsParametrizedInput() {
    }

    public RepositoryLabelsParametrizedInput(String after, String before, Integer first, Integer last, String query) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.query = query;
    }

    public RepositoryLabelsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RepositoryLabelsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RepositoryLabelsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RepositoryLabelsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RepositoryLabelsParametrizedInput query(String query) {
        this.query = query;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query));
        }
        return joiner.toString();
    }

}
