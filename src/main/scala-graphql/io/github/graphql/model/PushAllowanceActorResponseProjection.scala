package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PushAllowanceActor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PushAllowanceActorResponseProjection extends GraphQLResponseProjection {

    override def all$(): PushAllowanceActorResponseProjection = all$(3)

    override def all$(maxDepth: Int): PushAllowanceActorResponseProjection = {
        this.typename()
        this
    }

    def onUser(subProjection: UserResponseProjection): PushAllowanceActorResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): PushAllowanceActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onTeam(subProjection: TeamResponseProjection): PushAllowanceActorResponseProjection = {
        onTeam(null.asInstanceOf[String], subProjection)
    }

    def onTeam(alias: String, subProjection: TeamResponseProjection): PushAllowanceActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        this
    }

    def typename(): PushAllowanceActorResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PushAllowanceActorResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
