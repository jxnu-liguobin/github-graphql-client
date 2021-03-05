package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedIssueOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatedIssueOrRestrictedContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedIssueOrRestrictedContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedIssueOrRestrictedContributionResponseProjection {
        this.typename()
        return this
    }

    fun onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection = onRestrictedContribution(null, subProjection)

    fun onRestrictedContribution(alias: String?, subProjection: RestrictedContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedIssueContribution(subProjection: CreatedIssueContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection = onCreatedIssueContribution(null, subProjection)

    fun onCreatedIssueContribution(alias: String?, subProjection: CreatedIssueContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedIssueContribution").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedIssueOrRestrictedContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedIssueOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
