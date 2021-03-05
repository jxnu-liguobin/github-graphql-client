package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RequestedReviewer
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RequestedReviewerResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RequestedReviewerResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RequestedReviewerResponseProjection {
        this.typename()
        return this
    }

    fun onUser(subProjection: UserResponseProjection): RequestedReviewerResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): RequestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onMannequin(subProjection: MannequinResponseProjection): RequestedReviewerResponseProjection = onMannequin(null, subProjection)

    fun onMannequin(alias: String?, subProjection: MannequinResponseProjection): RequestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): RequestedReviewerResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): RequestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RequestedReviewerResponseProjection = typename(null)

    fun typename(alias: String?): RequestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
