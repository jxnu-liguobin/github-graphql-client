package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewDismissalAllowanceActor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ReviewDismissalAllowanceActorResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewDismissalAllowanceActorResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewDismissalAllowanceActorResponseProjection {
        this.typename()
        return this
    }

    fun onUser(subProjection: UserResponseProjection): ReviewDismissalAllowanceActorResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): ReviewDismissalAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): ReviewDismissalAllowanceActorResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): ReviewDismissalAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReviewDismissalAllowanceActorResponseProjection = typename(null)

    fun typename(alias: String?): ReviewDismissalAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
