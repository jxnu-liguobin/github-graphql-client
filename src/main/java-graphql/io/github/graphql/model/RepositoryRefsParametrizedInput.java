package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field refs in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryRefsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private OrderDirectionTO direction;
    private Integer first;
    private Integer last;
    private RefOrderTO orderBy;
    @javax.validation.constraints.NotNull
    private String refPrefix;

    public RepositoryRefsParametrizedInput() {
    }

    public RepositoryRefsParametrizedInput(String after, String before, OrderDirectionTO direction, Integer first, Integer last, RefOrderTO orderBy, String refPrefix) {
        this.after = after;
        this.before = before;
        this.direction = direction;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.refPrefix = refPrefix;
    }

    public RepositoryRefsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RepositoryRefsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RepositoryRefsParametrizedInput direction(OrderDirectionTO direction) {
        this.direction = direction;
        return this;
    }

    public RepositoryRefsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RepositoryRefsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RepositoryRefsParametrizedInput orderBy(RefOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public RepositoryRefsParametrizedInput refPrefix(String refPrefix) {
        this.refPrefix = refPrefix;
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
        if (direction != null) {
            joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction));
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
        if (refPrefix != null) {
            joiner.add("refPrefix: " + GraphQLRequestSerializer.getEntry(refPrefix));
        }
        return joiner.toString();
    }

}
