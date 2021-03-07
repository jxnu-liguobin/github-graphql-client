package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field teams in type Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationTeamsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private Boolean ldapMapped;
    private TeamOrderTO orderBy;
    private TeamPrivacyTO privacy;
    private String query;
    private TeamRoleTO role;
    private Boolean rootTeamsOnly = false;
    @javax.validation.constraints.NotNull
    private java.util.List<String> userLogins;

    public OrganizationTeamsParametrizedInput() {
    }

    public OrganizationTeamsParametrizedInput(String after, String before, Integer first, Integer last, Boolean ldapMapped, TeamOrderTO orderBy, TeamPrivacyTO privacy, String query, TeamRoleTO role, Boolean rootTeamsOnly, java.util.List<String> userLogins) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.ldapMapped = ldapMapped;
        this.orderBy = orderBy;
        this.privacy = privacy;
        this.query = query;
        this.role = role;
        this.rootTeamsOnly = rootTeamsOnly;
        this.userLogins = userLogins;
    }

    public OrganizationTeamsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public OrganizationTeamsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public OrganizationTeamsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrganizationTeamsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public OrganizationTeamsParametrizedInput ldapMapped(Boolean ldapMapped) {
        this.ldapMapped = ldapMapped;
        return this;
    }

    public OrganizationTeamsParametrizedInput orderBy(TeamOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public OrganizationTeamsParametrizedInput privacy(TeamPrivacyTO privacy) {
        this.privacy = privacy;
        return this;
    }

    public OrganizationTeamsParametrizedInput query(String query) {
        this.query = query;
        return this;
    }

    public OrganizationTeamsParametrizedInput role(TeamRoleTO role) {
        this.role = role;
        return this;
    }

    public OrganizationTeamsParametrizedInput rootTeamsOnly(Boolean rootTeamsOnly) {
        this.rootTeamsOnly = rootTeamsOnly;
        return this;
    }

    public OrganizationTeamsParametrizedInput userLogins(java.util.List<String> userLogins) {
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
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (ldapMapped != null) {
            joiner.add("ldapMapped: " + GraphQLRequestSerializer.getEntry(ldapMapped));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (privacy != null) {
            joiner.add("privacy: " + GraphQLRequestSerializer.getEntry(privacy));
        }
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (rootTeamsOnly != null) {
            joiner.add("rootTeamsOnly: " + GraphQLRequestSerializer.getEntry(rootTeamsOnly));
        }
        if (userLogins != null) {
            joiner.add("userLogins: " + GraphQLRequestSerializer.getEntry(userLogins));
        }
        return joiner.toString();
    }

}
