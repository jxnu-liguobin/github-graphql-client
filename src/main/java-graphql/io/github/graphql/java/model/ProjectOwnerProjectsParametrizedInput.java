package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field projects in type ProjectOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProjectOwnerProjectsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private ProjectOrderTO orderBy;
    private String search;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectStateTO> states;

    public ProjectOwnerProjectsParametrizedInput() {
    }

    public ProjectOwnerProjectsParametrizedInput(String after, String before, Integer first, Integer last, ProjectOrderTO orderBy, String search, java.util.List<ProjectStateTO> states) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.search = search;
        this.states = states;
    }

    public ProjectOwnerProjectsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ProjectOwnerProjectsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ProjectOwnerProjectsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ProjectOwnerProjectsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public ProjectOwnerProjectsParametrizedInput orderBy(ProjectOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ProjectOwnerProjectsParametrizedInput search(String search) {
        this.search = search;
        return this;
    }

    public ProjectOwnerProjectsParametrizedInput states(java.util.List<ProjectStateTO> states) {
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
        final ProjectOwnerProjectsParametrizedInput that = (ProjectOwnerProjectsParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy)
            && Objects.equals(search, that.search)
            && Objects.equals(states, that.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, last, orderBy, search, states);
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
        if (search != null) {
            joiner.add("search: " + GraphQLRequestSerializer.getEntry(search));
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states));
        }
        return joiner.toString();
    }

}
