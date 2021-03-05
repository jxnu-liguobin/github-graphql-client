package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MemberStatusable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MemberStatusableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MemberStatusableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MemberStatusableResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) <= maxDepth) {
            projectionDepthOnFields["MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses"] = projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0) + 1
            this.memberStatuses(UserStatusConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MemberStatusableResponseProjection.UserStatusConnectionResponseProjection.memberStatuses", 0)))
        }
        this.typename()
        return this
    }

    fun memberStatuses(subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection = memberStatuses(null, subProjection)

    fun memberStatuses(alias: String?, subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection {
        fields.add(GraphQLResponseField("memberStatuses").alias(alias).projection(subProjection))
        return this
    }

    fun memberStatuses(input: MemberStatusableMemberStatusesParametrizedInput, subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection = memberStatuses(null, input, subProjection)

    fun memberStatuses(alias: String?, input: MemberStatusableMemberStatusesParametrizedInput, subProjection: UserStatusConnectionResponseProjection): MemberStatusableResponseProjection {
        fields.add(GraphQLResponseField("memberStatuses").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): MemberStatusableResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): MemberStatusableResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): MemberStatusableResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): MemberStatusableResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MemberStatusableResponseProjection = typename(null)

    fun typename(alias: String?): MemberStatusableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
