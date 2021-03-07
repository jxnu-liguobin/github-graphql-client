package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field childTeams in type Team
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class TeamChildTeamsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Boolean immediateOnly = true;
    private Integer last;
    private TeamOrderTO orderBy;
    @javax.validation.constraints.NotNull
    private java.util.List<String> userLogins;

    public TeamChildTeamsParametrizedInput() {
    }

    public TeamChildTeamsParametrizedInput(String after, String before, Integer first, Boolean immediateOnly, Integer last, TeamOrderTO orderBy, java.util.List<String> userLogins) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.immediateOnly = immediateOnly;
        this.last = last;
        this.orderBy = orderBy;
        this.userLogins = userLogins;
    }

    public TeamChildTeamsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public TeamChildTeamsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public TeamChildTeamsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public TeamChildTeamsParametrizedInput immediateOnly(Boolean immediateOnly) {
        this.immediateOnly = immediateOnly;
        return this;
    }

    public TeamChildTeamsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public TeamChildTeamsParametrizedInput orderBy(TeamOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public TeamChildTeamsParametrizedInput userLogins(java.util.List<String> userLogins) {
        this.userLogins = userLogins;
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
        if (immediateOnly != null) {
            joiner.add("immediateOnly: " + GraphQLRequestSerializer.getEntry(immediateOnly));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (userLogins != null) {
            joiner.add("userLogins: " + GraphQLRequestSerializer.getEntry(userLogins));
        }
        return joiner.toString();
    }

}
