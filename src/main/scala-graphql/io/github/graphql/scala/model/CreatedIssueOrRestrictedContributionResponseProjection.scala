package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedIssueOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CreatedIssueOrRestrictedContributionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
