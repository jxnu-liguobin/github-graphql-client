package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Milestone
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MilestoneResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MilestoneResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MilestoneResponseProjection {
        this.closed()
        this.closedAt()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneResponseProjection.ActorResponseProjection.creator"] = projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0) + 1
            this.creator(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.description()
        this.dueOn()
        this.id()
        this.issuePrioritiesDebug()
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneResponseProjection.IssueConnectionResponseProjection.issues"] = projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1
            this.issues(IssueConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        this.number()
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests"] = projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1
            this.pullRequests(PullRequestConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["MilestoneResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        this.title()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun closed(): MilestoneResponseProjection = closed(null)

    fun closed(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("closed").alias(alias))
        return this
    }

    fun closedAt(): MilestoneResponseProjection = closedAt(null)

    fun closedAt(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("closedAt").alias(alias))
        return this
    }

    fun createdAt(): MilestoneResponseProjection = createdAt(null)

    fun createdAt(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun creator(subProjection: ActorResponseProjection): MilestoneResponseProjection = creator(null, subProjection)

    fun creator(alias: String?, subProjection: ActorResponseProjection): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("creator").alias(alias).projection(subProjection))
        return this
    }

    fun description(): MilestoneResponseProjection = description(null)

    fun description(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun dueOn(): MilestoneResponseProjection = dueOn(null)

    fun dueOn(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("dueOn").alias(alias))
        return this
    }

    fun id(): MilestoneResponseProjection = id(null)

    fun id(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun issuePrioritiesDebug(): MilestoneResponseProjection = issuePrioritiesDebug(null)

    fun issuePrioritiesDebug(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("issuePrioritiesDebug").alias(alias))
        return this
    }

    fun issues(subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection = issues(null, subProjection)

    fun issues(alias: String?, subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).projection(subProjection))
        return this
    }

    fun issues(input: MilestoneIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection = issues(null, input, subProjection)

    fun issues(alias: String?, input: MilestoneIssuesParametrizedInput, subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun number(): MilestoneResponseProjection = number(null)

    fun number(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("number").alias(alias))
        return this
    }

    fun pullRequests(subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection = pullRequests(null, subProjection)

    fun pullRequests(alias: String?, subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequests(input: MilestonePullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection = pullRequests(null, input, subProjection)

    fun pullRequests(alias: String?, input: MilestonePullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): MilestoneResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): MilestoneResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun state(): MilestoneResponseProjection = state(null)

    fun state(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun title(): MilestoneResponseProjection = title(null)

    fun title(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("title").alias(alias))
        return this
    }

    fun updatedAt(): MilestoneResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): MilestoneResponseProjection = url(null)

    fun url(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): MilestoneResponseProjection = typename(null)

    fun typename(alias: String?): MilestoneResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
