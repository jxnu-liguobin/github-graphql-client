package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewDismissalAllowanceActor
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReviewDismissalAllowanceActorResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
