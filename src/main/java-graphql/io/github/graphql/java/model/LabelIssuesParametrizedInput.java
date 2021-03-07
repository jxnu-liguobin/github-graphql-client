package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field issues in type Label
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LabelIssuesParametrizedInput implements GraphQLParametrizedInput {

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

    public LabelIssuesParametrizedInput() {
    }

    public LabelIssuesParametrizedInput(String after, String before, IssueFiltersTO filterBy, Integer first, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<IssueStateTO> states) {
        this.after = after;
        this.before = before;
        this.filterBy = filterBy;
        this.first = first;
        this.labels = labels;
        this.last = last;
        this.orderBy = orderBy;
        this.states = states;
    }

    public LabelIssuesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public LabelIssuesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public LabelIssuesParametrizedInput filterBy(IssueFiltersTO filterBy) {
        this.filterBy = filterBy;
        return this;
    }

    public LabelIssuesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public LabelIssuesParametrizedInput labels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }

    public LabelIssuesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public LabelIssuesParametrizedInput orderBy(IssueOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public LabelIssuesParametrizedInput states(java.util.List<IssueStateTO> states) {
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
        final LabelIssuesParametrizedInput that = (LabelIssuesParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(filterBy, that.filterBy)
            && Objects.equals(first, that.first)
            && Objects.equals(labels, that.labels)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy)
            && Objects.equals(states, that.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, filterBy, first, labels, last, orderBy, states);
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
