package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedPullRequestOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CreatedPullRequestOrRestrictedContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedPullRequestOrRestrictedContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedPullRequestOrRestrictedContributionResponseProjection = {
        this.typename()
        this
    }

    def onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection = {
        onRestrictedContribution(null.asInstanceOf[String], subProjection)
    }

    def onRestrictedContribution(alias: String, subProjection: RestrictedContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedPullRequestContribution(subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection = {
        onCreatedPullRequestContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedPullRequestContribution(alias: String, subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedPullRequestContribution").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedPullRequestOrRestrictedContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedPullRequestOrRestrictedContributionResponseProjection = {
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
        val that = obj.asInstanceOf[CreatedPullRequestOrRestrictedContributionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
