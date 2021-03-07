package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field reactions in type PullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestReactionsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private ReactionContentTO content;
    private Integer first;
    private Integer last;
    private ReactionOrderTO orderBy;

    public PullRequestReactionsParametrizedInput() {
    }

    public PullRequestReactionsParametrizedInput(String after, String before, ReactionContentTO content, Integer first, Integer last, ReactionOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.content = content;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public PullRequestReactionsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public PullRequestReactionsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public PullRequestReactionsParametrizedInput content(ReactionContentTO content) {
        this.content = content;
        return this;
    }

    public PullRequestReactionsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public PullRequestReactionsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public PullRequestReactionsParametrizedInput orderBy(ReactionOrderTO orderBy) {
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
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content));
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
