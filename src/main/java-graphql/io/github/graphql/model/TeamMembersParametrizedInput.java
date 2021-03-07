package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field members in type Team
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class TeamMembersParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private TeamMembershipTypeTO membership = TeamMembershipTypeTO.ALL;
    private TeamMemberOrderTO orderBy;
    private String query;
    private TeamMemberRoleTO role;

    public TeamMembersParametrizedInput() {
    }

    public TeamMembersParametrizedInput(String after, String before, Integer first, Integer last, TeamMembershipTypeTO membership, TeamMemberOrderTO orderBy, String query, TeamMemberRoleTO role) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.membership = membership;
        this.orderBy = orderBy;
        this.query = query;
        this.role = role;
    }

    public TeamMembersParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public TeamMembersParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public TeamMembersParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public TeamMembersParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public TeamMembersParametrizedInput membership(TeamMembershipTypeTO membership) {
        this.membership = membership;
        return this;
    }

    public TeamMembersParametrizedInput orderBy(TeamMemberOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public TeamMembersParametrizedInput query(String query) {
        this.query = query;
        return this;
    }

    public TeamMembersParametrizedInput role(TeamMemberRoleTO role) {
        this.role = role;
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
        if (membership != null) {
            joiner.add("membership: " + GraphQLRequestSerializer.getEntry(membership));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        return joiner.toString();
    }

}
