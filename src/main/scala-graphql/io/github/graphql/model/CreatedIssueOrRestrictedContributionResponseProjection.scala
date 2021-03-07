package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedIssueOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedIssueOrRestrictedContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedIssueOrRestrictedContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedIssueOrRestrictedContributionResponseProjection = {
        this.typename()
        this
    }

    def onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection = {
        onRestrictedContribution(null.asInstanceOf[String], subProjection)
    }

    def onRestrictedContribution(alias: String, subProjection: RestrictedContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedIssueContribution(subProjection: CreatedIssueContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection = {
        onCreatedIssueContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedIssueContribution(alias: String, subProjection: CreatedIssueContributionResponseProjection): CreatedIssueOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedIssueContribution").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedIssueOrRestrictedContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedIssueOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
