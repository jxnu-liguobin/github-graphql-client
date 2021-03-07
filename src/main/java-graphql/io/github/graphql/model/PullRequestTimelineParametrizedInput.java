package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field timeline in type PullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
