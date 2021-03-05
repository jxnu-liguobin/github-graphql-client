package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Label
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LabelResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LabelResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LabelResponseProjection {
        this.color()
        this.createdAt()
        this.description()
        this.id()
        this.isDefault()
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields["LabelResponseProjection.IssueConnectionResponseProjection.issues"] = projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1
            this.issues(IssueConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        this.name()
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields["LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests"] = projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1
            this.pullRequests(PullRequestConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["LabelResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun color(): LabelResponseProjection = color(null)

    fun color(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("color").alias(alias))
        return this
    }

    fun createdAt(): LabelResponseProjection = createdAt(null)

    fun createdAt(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun description(): LabelResponseProjection = description(null)

    fun description(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun id(): LabelResponseProjection = id(null)

    fun id(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isDefault(): LabelResponseProjection = isDefault(null)

    fun isDefault(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("isDefault").alias(alias))
        return this
    }

    fun issues(subProjection: IssueConnectionResponseProjection): LabelResponseProjection = issues(null, subProjection)

    fun issues(alias: String?, subProjection: IssueConnectionResponseProjection): LabelResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).projection(subProjection))
        return this
    }

    fun issues(input: LabelIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): LabelResponseProjection = issues(null, input, subProjection)

    fun issues(alias: String?, input: LabelIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): LabelResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun name(): LabelResponseProjection = name(null)

    fun name(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun pullRequests(subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection = pullRequests(null, subProjection)

    fun pullRequests(alias: String?, subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequests(input: LabelPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection = pullRequests(null, input, subProjection)

    fun pullRequests(alias: String?, input: LabelPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): LabelResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): LabelResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): LabelResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun updatedAt(): LabelResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): LabelResponseProjection = url(null)

    fun url(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): LabelResponseProjection = typename(null)

    fun typename(alias: String?): LabelResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
