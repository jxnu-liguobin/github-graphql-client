package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field projects in type Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationProjectsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private ProjectOrderTO orderBy;
    private String search;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectStateTO> states;

    public OrganizationProjectsParametrizedInput() {
    }

    public OrganizationProjectsParametrizedInput(String after, String before, Integer first, Integer last, ProjectOrderTO orderBy, String search, java.util.List<ProjectStateTO> states) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
        this.search = search;
        this.states = states;
    }

    public OrganizationProjectsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public OrganizationProjectsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public OrganizationProjectsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrganizationProjectsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public OrganizationProjectsParametrizedInput orderBy(ProjectOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public OrganizationProjectsParametrizedInput search(String search) {
        this.search = search;
        return this;
    }

    public OrganizationProjectsParametrizedInput states(java.util.List<ProjectStateTO> states) {
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
        if (search != null) {
            joiner.add("search: " + GraphQLRequestSerializer.getEntry(search));
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states));
        }
        return joiner.toString();
    }

}
