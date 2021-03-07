package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field search in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QuerySearchParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    @javax.validation.constraints.NotNull
    private String query;
    @javax.validation.constraints.NotNull
    private SearchTypeTO type;

    public QuerySearchParametrizedInput() {
    }

    public QuerySearchParametrizedInput(String after, String before, Integer first, Integer last, String query, SearchTypeTO type) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.query = query;
        this.type = type;
    }

    public QuerySearchParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public QuerySearchParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public QuerySearchParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public QuerySearchParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public QuerySearchParametrizedInput query(String query) {
        this.query = query;
        return this;
    }

    public QuerySearchParametrizedInput type(SearchTypeTO type) {
        this.type = type;
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
        final QuerySearchParametrizedInput that = (QuerySearchParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(query, that.query)
            && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, last, query, type);
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
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

}
