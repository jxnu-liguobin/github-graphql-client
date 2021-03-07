package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field milestones in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryMilestonesParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private MilestoneOrderTO orderBy;
    @javax.validation.constraints.NotNull
    private java.util.List<MilestoneStateTO> states;

    public RepositoryMilestonesParametrizedInput() {
    }

    public RepositoryMilestonesParametrizedInput(String after, String before, Integer first, Integer last, MilestoneOrderTO orderBy, java.util.List<MilestoneStateTO> states) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.states = states;
    }

    public RepositoryMilestonesParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RepositoryMilestonesParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RepositoryMilestonesParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RepositoryMilestonesParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RepositoryMilestonesParametrizedInput orderBy(MilestoneOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public RepositoryMilestonesParametrizedInput states(java.util.List<MilestoneStateTO> states) {
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
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
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
