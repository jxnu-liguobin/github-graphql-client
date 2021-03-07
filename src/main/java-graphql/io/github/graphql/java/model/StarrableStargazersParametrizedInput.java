package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field stargazers in type Starrable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class StarrableStargazersParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private StarOrderTO orderBy;

    public StarrableStargazersParametrizedInput() {
    }

    public StarrableStargazersParametrizedInput(String after, String before, Integer first, Integer last, StarOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public StarrableStargazersParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public StarrableStargazersParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public StarrableStargazersParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public StarrableStargazersParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public StarrableStargazersParametrizedInput orderBy(StarOrderTO orderBy) {
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
        final StarrableStargazersParametrizedInput that = (StarrableStargazersParametrizedInput) obj;
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
