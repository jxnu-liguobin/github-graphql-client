package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field associatedPullRequests in type Ref
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RefAssociatedPullRequestsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String baseRefName;
    private String before;
    private Integer first;
    private String headRefName;
    @javax.validation.constraints.NotNull
    private java.util.List<String> labels;
    private Integer last;
    private IssueOrderTO orderBy;
    @javax.validation.constraints.NotNull
    private java.util.List<PullRequestStateTO> states;

    public RefAssociatedPullRequestsParametrizedInput() {
    }

    public RefAssociatedPullRequestsParametrizedInput(String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) {
        this.after = after;
        this.baseRefName = baseRefName;
        this.before = before;
        this.first = first;
        this.headRefName = headRefName;
        this.labels = labels;
        this.last = last;
        this.orderBy = orderBy;
        this.states = states;
    }

    public RefAssociatedPullRequestsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput baseRefName(String baseRefName) {
        this.baseRefName = baseRefName;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput headRefName(String headRefName) {
        this.headRefName = headRefName;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput labels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput orderBy(IssueOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public RefAssociatedPullRequestsParametrizedInput states(java.util.List<PullRequestStateTO> states) {
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
        final RefAssociatedPullRequestsParametrizedInput that = (RefAssociatedPullRequestsParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(baseRefName, that.baseRefName)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(headRefName, that.headRefName)
            && Objects.equals(labels, that.labels)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy)
            && Objects.equals(states, that.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, baseRefName, before, first, headRefName, labels, last, orderBy, states);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (baseRefName != null) {
            joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (headRefName != null) {
            joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName));
        }
        if (labels != null) {
            joiner.add("labels: " + GraphQLRequestSerializer.getEntry(labels));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states));
        }
        return joiner.toString();
    }

}
