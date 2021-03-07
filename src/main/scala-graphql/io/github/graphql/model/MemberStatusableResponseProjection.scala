package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MemberStatusable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class MemberStatusableResponseProjection extends GraphQLResponseProjection {

    override def all$(): MemberStatusableResponseProjection = all$(3)

    override def all$(maxDepth: Int): MemberStatusableResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1)
            this.memberStatuses(new UserStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)))
        }
        this.typename()
        this
    }

    def memberStatuses(subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection = {
        memberStatuses(null.asInstanceOf[String], subProjection)
    }

    def memberStatuses(alias: String, subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection = {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection))
        this
    }

    def memberStatuses(input: MemberStatusableMemberStatusesParametrizedInput,subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection = {
        memberStatuses(null.asInstanceOf[String], input, subProjection)
    }

    def memberStatuses(alias: String, input: MemberStatusableMemberStatusesParametrizedInput , subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection = {
        fields.add(new GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): MemberStatusableResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): MemberStatusableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onTeam(subProjection: TeamResponseProjection): MemberStatusableResponseProjection = {
        onTeam(null.asInstanceOf[String], subProjection)
    }

    def onTeam(alias: String, subProjection: TeamResponseProjection): MemberStatusableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        this
    }

    def typename(): MemberStatusableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MemberStatusableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
