package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Assignee
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AssigneeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AssigneeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AssigneeResponseProjection {
        this.typename()
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): AssigneeResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): AssigneeResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): AssigneeResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): AssigneeResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onMannequin(subProjection: MannequinResponseProjection): AssigneeResponseProjection = onMannequin(null, subProjection)

    fun onMannequin(alias: String?, subProjection: MannequinResponseProjection): AssigneeResponseProjection {
        fields.add(GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        return this
    }

    fun onBot(subProjection: BotResponseProjection): AssigneeResponseProjection = onBot(null, subProjection)

    fun onBot(alias: String?, subProjection: BotResponseProjection): AssigneeResponseProjection {
        fields.add(GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AssigneeResponseProjection = typename(null)

    fun typename(alias: String?): AssigneeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
