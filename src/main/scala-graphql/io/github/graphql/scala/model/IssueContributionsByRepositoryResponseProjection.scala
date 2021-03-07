package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueContributionsByRepository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class IssueContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueContributionsByRepositoryResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueContributionsByRepositoryResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0) + 1)
            this.contributions(new CreatedIssueContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def contributions(subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], subProjection)
    }

    def contributions(alias: String, subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        this
    }

    def contributions(input: IssueContributionsByRepositoryContributionsParametrizedInput,subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], input, subProjection)
    }

    def contributions(alias: String, input: IssueContributionsByRepositoryContributionsParametrizedInput , subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): IssueContributionsByRepositoryResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): IssueContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueContributionsByRepositoryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueContributionsByRepositoryResponseProjection = {
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
        val that = obj.asInstanceOf[IssueContributionsByRepositoryResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
