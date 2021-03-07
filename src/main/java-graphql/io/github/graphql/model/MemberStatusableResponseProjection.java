package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MemberStatusable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MemberStatusableResponseProjection extends GraphQLResponseProjection {

    public MemberStatusableResponseProjection() {
    }

    @Override
    public MemberStatusableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MemberStatusableResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1);
            this.memberStatuses(new UserStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)));
        }
        this.typename();
        return this;
    }

    public MemberStatusableResponseProjection memberStatuses(UserStatusConnectionResponseProjection subProjection) {
        return memberStatuses((String)null, subProjection);
    }

    public MemberStatusableResponseProjection memberStatuses(String alias, UserStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection));
        return this;
    }

    public MemberStatusableResponseProjection memberStatuses(MemberStatusableMemberStatusesParametrizedInput input, UserStatusConnectionResponseProjection subProjection) {
        return memberStatuses(null, input, subProjection);
    }

    public MemberStatusableResponseProjection memberStatuses(String alias, MemberStatusableMemberStatusesParametrizedInput input, UserStatusConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public MemberStatusableResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public MemberStatusableResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public MemberStatusableResponseProjection onTeam(TeamResponseProjection subProjection) {
        return onTeam(null, subProjection);
    }

    public MemberStatusableResponseProjection onTeam(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection));
        return this;
    }

    public MemberStatusableResponseProjection typename() {
        return typename(null);
    }

    public MemberStatusableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
