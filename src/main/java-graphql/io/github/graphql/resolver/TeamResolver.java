package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Team
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface TeamResolver {

    @javax.validation.constraints.NotNull
    TeamConnectionTO ancestors(TeamTO teamTO, String after, String before, Integer first, Integer last) throws Exception;

    String avatarUrl(TeamTO teamTO, Integer size) throws Exception;

    @javax.validation.constraints.NotNull
    TeamConnectionTO childTeams(TeamTO teamTO, String after, String before, Integer first, Boolean immediateOnly, Integer last, TeamOrderTO orderBy, java.util.List<String> userLogins) throws Exception;

    OrganizationInvitationConnectionTO invitations(TeamTO teamTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    UserStatusConnectionTO memberStatuses(TeamTO teamTO, String after, String before, Integer first, Integer last, UserStatusOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    TeamMemberConnectionTO members(TeamTO teamTO, String after, String before, Integer first, Integer last, TeamMembershipTypeTO membership, TeamMemberOrderTO orderBy, String query, TeamMemberRoleTO role) throws Exception;

    @javax.validation.constraints.NotNull
    TeamRepositoryConnectionTO repositories(TeamTO teamTO, String after, String before, Integer first, Integer last, TeamRepositoryOrderTO orderBy, String query) throws Exception;

}
