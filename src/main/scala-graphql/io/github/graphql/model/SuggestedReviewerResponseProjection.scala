package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SuggestedReviewer
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SuggestedReviewerResponseProjection extends GraphQLResponseProjection {

    override def all$(): SuggestedReviewerResponseProjection = all$(3)

    override def all$(maxDepth: Int): SuggestedReviewerResponseProjection = {
        this.isAuthor()
        this.isCommenter()
        if (projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0) + 1)
            this.reviewer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0)))
        }
        this.typename()
        this
    }

    def isAuthor(): SuggestedReviewerResponseProjection = {
        isAuthor(null.asInstanceOf[String])
    }

    def isAuthor(alias: String): SuggestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("isAuthor").alias(alias))
        this
    }

    def isCommenter(): SuggestedReviewerResponseProjection = {
        isCommenter(null.asInstanceOf[String])
    }

    def isCommenter(alias: String): SuggestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("isCommenter").alias(alias))
        this
    }

    def reviewer(subProjection: UserResponseProjection): SuggestedReviewerResponseProjection = {
        reviewer(null.asInstanceOf[String], subProjection)
    }

    def reviewer(alias: String, subProjection: UserResponseProjection): SuggestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("reviewer").alias(alias).projection(subProjection))
        this
    }

    def typename(): SuggestedReviewerResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SuggestedReviewerResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
