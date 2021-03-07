package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RequestedReviewer
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RequestedReviewerResponseProjection extends GraphQLResponseProjection {

    override def all$(): RequestedReviewerResponseProjection = all$(3)

    override def all$(maxDepth: Int): RequestedReviewerResponseProjection = {
        this.typename()
        this
    }

    def onUser(subProjection: UserResponseProjection): RequestedReviewerResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): RequestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onMannequin(subProjection: MannequinResponseProjection): RequestedReviewerResponseProjection = {
        onMannequin(null.asInstanceOf[String], subProjection)
    }

    def onMannequin(alias: String, subProjection: MannequinResponseProjection): RequestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        this
    }

    def onTeam(subProjection: TeamResponseProjection): RequestedReviewerResponseProjection = {
        onTeam(null.asInstanceOf[String], subProjection)
    }

    def onTeam(alias: String, subProjection: TeamResponseProjection): RequestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        this
    }

    def typename(): RequestedReviewerResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RequestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
