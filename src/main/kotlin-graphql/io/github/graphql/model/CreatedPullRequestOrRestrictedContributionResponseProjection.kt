package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatedPullRequestOrRestrictedContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedPullRequestOrRestrictedContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedPullRequestOrRestrictedContributionResponseProjection {
        this.typename()
        return this
    }

    fun onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection = onRestrictedContribution(null, subProjection)

    fun onRestrictedContribution(alias: String?, subProjection: RestrictedContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedPullRequestContribution(subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection = onCreatedPullRequestContribution(null, subProjection)

    fun onCreatedPullRequestContribution(alias: String?, subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedPullRequestContribution").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedPullRequestOrRestrictedContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedPullRequestOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
