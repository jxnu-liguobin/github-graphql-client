package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewDismissalAllowanceActor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReviewDismissalAllowanceActorResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewDismissalAllowanceActorResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewDismissalAllowanceActorResponseProjection = {
        this.typename()
        this
    }

    def onUser(subProjection: UserResponseProjection): ReviewDismissalAllowanceActorResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): ReviewDismissalAllowanceActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onTeam(subProjection: TeamResponseProjection): ReviewDismissalAllowanceActorResponseProjection = {
        onTeam(null.asInstanceOf[String], subProjection)
    }

    def onTeam(alias: String, subProjection: TeamResponseProjection): ReviewDismissalAllowanceActorResponseProjection = {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReviewDismissalAllowanceActorResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewDismissalAllowanceActorResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
