package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedRepositoryOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatedRepositoryOrRestrictedContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedRepositoryOrRestrictedContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedRepositoryOrRestrictedContributionResponseProjection {
        this.typename()
        return this
    }

    fun onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection = onRestrictedContribution(null, subProjection)

    fun onRestrictedContribution(alias: String?, subProjection: RestrictedContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        return this
    }

    fun onCreatedRepositoryContribution(subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection = onCreatedRepositoryContribution(null, subProjection)

    fun onCreatedRepositoryContribution(alias: String?, subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("...on CreatedRepositoryContribution").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedRepositoryOrRestrictedContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedRepositoryOrRestrictedContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
