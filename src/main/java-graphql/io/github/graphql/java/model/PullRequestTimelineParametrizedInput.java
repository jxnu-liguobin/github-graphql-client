package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field timeline in type PullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestTimelineParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private String since;

    public PullRequestTimelineParametrizedInput() {
    }

    public PullRequestTimelineParametrizedInput(String after, String before, Integer first, Integer last, String since) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.since = since;
    }

    public PullRequestTimelineParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public PullRequestTimelineParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public PullRequestTimelineParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public PullRequestTimelineParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public PullRequestTimelineParametrizedInput since(String since) {
        this.since = since;
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
        final PullRequestTimelineParametrizedInput that = (PullRequestTimelineParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(since, that.since);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, last, since);
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
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since));
        }
        return joiner.toString();
    }

}
