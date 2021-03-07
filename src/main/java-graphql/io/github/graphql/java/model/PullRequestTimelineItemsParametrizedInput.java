package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field timelineItems in type PullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestTimelineItemsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    @javax.validation.constraints.NotNull
    private java.util.List<PullRequestTimelineItemsItemTypeTO> itemTypes;
    private Integer last;
    private String since;
    private Integer skip;

    public PullRequestTimelineItemsParametrizedInput() {
    }

    public PullRequestTimelineItemsParametrizedInput(String after, String before, Integer first, java.util.List<PullRequestTimelineItemsItemTypeTO> itemTypes, Integer last, String since, Integer skip) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.itemTypes = itemTypes;
        this.last = last;
        this.since = since;
        this.skip = skip;
    }

    public PullRequestTimelineItemsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public PullRequestTimelineItemsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public PullRequestTimelineItemsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public PullRequestTimelineItemsParametrizedInput itemTypes(java.util.List<PullRequestTimelineItemsItemTypeTO> itemTypes) {
        this.itemTypes = itemTypes;
        return this;
    }

    public PullRequestTimelineItemsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public PullRequestTimelineItemsParametrizedInput since(String since) {
        this.since = since;
        return this;
    }

    public PullRequestTimelineItemsParametrizedInput skip(Integer skip) {
        this.skip = skip;
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
        final PullRequestTimelineItemsParametrizedInput that = (PullRequestTimelineItemsParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(itemTypes, that.itemTypes)
            && Objects.equals(last, that.last)
            && Objects.equals(since, that.since)
            && Objects.equals(skip, that.skip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, itemTypes, last, since, skip);
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
        if (itemTypes != null) {
            joiner.add("itemTypes: " + GraphQLRequestSerializer.getEntry(itemTypes));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since));
        }
        if (skip != null) {
            joiner.add("skip: " + GraphQLRequestSerializer.getEntry(skip));
        }
        return joiner.toString();
    }

}
