package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field reviews in type PullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestReviewsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String author;
    private String before;
    private Integer first;
    private Integer last;
    @javax.validation.constraints.NotNull
    private java.util.List<PullRequestReviewStateTO> states;

    public PullRequestReviewsParametrizedInput() {
    }

    public PullRequestReviewsParametrizedInput(String after, String author, String before, Integer first, Integer last, java.util.List<PullRequestReviewStateTO> states) {
        this.after = after;
        this.author = author;
        this.before = before;
        this.first = first;
        this.last = last;
        this.states = states;
    }

    public PullRequestReviewsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public PullRequestReviewsParametrizedInput author(String author) {
        this.author = author;
        return this;
    }

    public PullRequestReviewsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public PullRequestReviewsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public PullRequestReviewsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public PullRequestReviewsParametrizedInput states(java.util.List<PullRequestReviewStateTO> states) {
        this.states = states;
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
        final PullRequestReviewsParametrizedInput that = (PullRequestReviewsParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(author, that.author)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(states, that.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, author, before, first, last, states);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
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
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states));
        }
        return joiner.toString();
    }

}
