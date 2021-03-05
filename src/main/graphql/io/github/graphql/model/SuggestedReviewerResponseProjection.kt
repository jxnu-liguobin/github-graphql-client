package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SuggestedReviewer
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SuggestedReviewerResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SuggestedReviewerResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SuggestedReviewerResponseProjection {
        this.isAuthor()
        this.isCommenter()
        if (projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0) <= maxDepth) {
            projectionDepthOnFields["SuggestedReviewerResponseProjection.UserResponseProjection.reviewer"] = projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0) + 1
            this.reviewer(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0)))
        }
        this.typename()
        return this
    }

    fun isAuthor(): SuggestedReviewerResponseProjection = isAuthor(null)

    fun isAuthor(alias: String?): SuggestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("isAuthor").alias(alias))
        return this
    }

    fun isCommenter(): SuggestedReviewerResponseProjection = isCommenter(null)

    fun isCommenter(alias: String?): SuggestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("isCommenter").alias(alias))
        return this
    }

    fun reviewer(subProjection: UserResponseProjection): SuggestedReviewerResponseProjection = reviewer(null, subProjection)

    fun reviewer(alias: String?, subProjection: UserResponseProjection): SuggestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("reviewer").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SuggestedReviewerResponseProjection = typename(null)

    fun typename(alias: String?): SuggestedReviewerResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
