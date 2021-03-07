package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedRepositoryOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CreatedRepositoryOrRestrictedContributionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
