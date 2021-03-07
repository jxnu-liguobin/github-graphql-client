package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field releases in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryReleasesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private ReleaseOrderTO orderBy;

    public RepositoryReleasesParametrizedInput() {
    }

    public RepositoryReleasesParametrizedInput(String after, String before, Integer first, Integer last, ReleaseOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public RepositoryReleasesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RepositoryReleasesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RepositoryReleasesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RepositoryReleasesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RepositoryReleasesParametrizedInput orderBy(ReleaseOrderTO orderBy) {
        this.orderBy = orderBy;
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
        final RepositoryReleasesParametrizedInput that = (RepositoryReleasesParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, last, orderBy);
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
