package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field issues in type Milestone
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MilestoneIssuesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private IssueFiltersTO filterBy;
    private Integer first;
    @javax.validation.constraints.NotNull
    private java.util.List<String> labels;
    private Integer last;
    private IssueOrderTO orderBy;
    @javax.validation.constraints.NotNull
    private java.util.List<IssueStateTO> states;

    public MilestoneIssuesParametrizedInput() {
    }

    public MilestoneIssuesParametrizedInput(String after, String before, IssueFiltersTO filterBy, Integer first, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<IssueStateTO> states) {
        this.after = after;
        this.before = before;
        this.filterBy = filterBy;
        this.first = first;
        this.labels = labels;
        this.last = last;
        this.orderBy = orderBy;
        this.states = states;
    }

    public MilestoneIssuesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public MilestoneIssuesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public MilestoneIssuesParametrizedInput filterBy(IssueFiltersTO filterBy) {
        this.filterBy = filterBy;
        return this;
    }

    public MilestoneIssuesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public MilestoneIssuesParametrizedInput labels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }

    public MilestoneIssuesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public MilestoneIssuesParametrizedInput orderBy(IssueOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public MilestoneIssuesParametrizedInput states(java.util.List<IssueStateTO> states) {
        this.states = states;
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
        if (filterBy != null) {
            joiner.add("filterBy: " + GraphQLRequestSerializer.getEntry(filterBy));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
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
