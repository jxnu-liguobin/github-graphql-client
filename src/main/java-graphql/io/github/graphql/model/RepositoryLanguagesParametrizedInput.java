package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field languages in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryLanguagesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private LanguageOrderTO orderBy;

    public RepositoryLanguagesParametrizedInput() {
    }

    public RepositoryLanguagesParametrizedInput(String after, String before, Integer first, Integer last, LanguageOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public RepositoryLanguagesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RepositoryLanguagesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RepositoryLanguagesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RepositoryLanguagesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RepositoryLanguagesParametrizedInput orderBy(LanguageOrderTO orderBy) {
        this.orderBy = orderBy;
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
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        return joiner.toString();
    }

}
