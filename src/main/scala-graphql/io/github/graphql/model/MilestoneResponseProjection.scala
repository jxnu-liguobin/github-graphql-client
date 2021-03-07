package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Milestone
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class MilestoneResponseProjection extends GraphQLResponseProjection {

    override def all$(): MilestoneResponseProjection = all$(3)

    override def all$(maxDepth: Int): MilestoneResponseProjection = {
        this.closed()
        this.closedAt()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0) + 1)
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.description()
        this.dueOn()
        this.id()
        this.issuePrioritiesDebug()
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1)
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        this.number()
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1)
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        this.title()
        this.updatedAt()
        this.url()
        this.typename()
        this
    }

    def closed(): MilestoneResponseProjection = {
        closed(null.asInstanceOf[String])
    }

    def closed(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("closed").alias(alias))
        this
    }

    def closedAt(): MilestoneResponseProjection = {
        closedAt(null.asInstanceOf[String])
    }

    def closedAt(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("closedAt").alias(alias))
        this
    }

    def createdAt(): MilestoneResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def creator(subProjection: ActorResponseProjection): MilestoneResponseProjection = {
        creator(null.asInstanceOf[String], subProjection)
    }

    def creator(alias: String, subProjection: ActorResponseProjection): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection))
        this
    }

    def description(): MilestoneResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def dueOn(): MilestoneResponseProjection = {
        dueOn(null.asInstanceOf[String])
    }

    def dueOn(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("dueOn").alias(alias))
        this
    }

    def id(): MilestoneResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def issuePrioritiesDebug(): MilestoneResponseProjection = {
        issuePrioritiesDebug(null.asInstanceOf[String])
    }

    def issuePrioritiesDebug(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("issuePrioritiesDebug").alias(alias))
        this
    }

    def issues(subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection = {
        issues(null.asInstanceOf[String], subProjection)
    }

    def issues(alias: String, subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection))
        this
    }

    def issues(input: MilestoneIssuesParametrizedInput,subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection = {
        issues(null.asInstanceOf[String], input, subProjection)
    }

    def issues(alias: String, input: MilestoneIssuesParametrizedInput , subProjection: IssueConnectionResponseProjection): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def number(): MilestoneResponseProjection = {
        number(null.asInstanceOf[String])
    }

    def number(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("number").alias(alias))
        this
    }

    def pullRequests(subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection = {
        pullRequests(null.asInstanceOf[String], subProjection)
    }

    def pullRequests(alias: String, subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        this
    }

    def pullRequests(input: MilestonePullRequestsParametrizedInput,subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection = {
        pullRequests(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequests(alias: String, input: MilestonePullRequestsParametrizedInput , subProjection: PullRequestConnectionResponseProjection): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): MilestoneResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): MilestoneResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def state(): MilestoneResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def title(): MilestoneResponseProjection = {
        title(null.asInstanceOf[String])
    }

    def title(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("title").alias(alias))
        this
    }

    def updatedAt(): MilestoneResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): MilestoneResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): MilestoneResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MilestoneResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
