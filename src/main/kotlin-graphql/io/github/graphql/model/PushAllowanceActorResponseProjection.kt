package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PushAllowanceActor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class PushAllowanceActorResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PushAllowanceActorResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PushAllowanceActorResponseProjection {
        this.typename()
        return this
    }

    fun onUser(subProjection: UserResponseProjection): PushAllowanceActorResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): PushAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): PushAllowanceActorResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): PushAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PushAllowanceActorResponseProjection = typename(null)

    fun typename(alias: String?): PushAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
