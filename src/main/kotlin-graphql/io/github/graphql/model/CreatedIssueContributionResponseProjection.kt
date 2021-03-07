package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedIssueContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatedIssueContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedIssueContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedIssueContributionResponseProjection {
        this.isRestricted()
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedIssueContributionResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.occurredAt()
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedIssueContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun isRestricted(): CreatedIssueContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): CreatedIssueContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): CreatedIssueContributionResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): CreatedIssueContributionResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun occurredAt(): CreatedIssueContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): CreatedIssueContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun resourcePath(): CreatedIssueContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CreatedIssueContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): CreatedIssueContributionResponseProjection = url(null)

    fun url(alias: String?): CreatedIssueContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): CreatedIssueContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): CreatedIssueContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedIssueContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedIssueContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
