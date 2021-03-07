package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Label
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LabelResponseProjection extends GraphQLResponseProjection {

    override def all$(): LabelResponseProjection = all$(3)

    override def all$(maxDepth: Int): LabelResponseProjection = {
        this.color()
        this.createdAt()
        this.description()
        this.id()
        this.isDefault()
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelResponseProjection.IssueConnectionResponseProjection.issues", projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0) + 1)
            this.issues(new IssueConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.IssueConnectionResponseProjection.issues", 0)))
        }
        this.name()
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0) + 1)
            this.pullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.PullRequestConnectionResponseProjection.pullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.updatedAt()
        this.url()
        this.typename()
        this
    }

    def color(): LabelResponseProjection = {
        color(null.asInstanceOf[String])
    }

    def color(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("color").alias(alias))
        this
    }

    def createdAt(): LabelResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def description(): LabelResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def id(): LabelResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isDefault(): LabelResponseProjection = {
        isDefault(null.asInstanceOf[String])
    }

    def isDefault(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("isDefault").alias(alias))
        this
    }

    def issues(subProjection: IssueConnectionResponseProjection): LabelResponseProjection = {
        issues(null.asInstanceOf[String], subProjection)
    }

    def issues(alias: String, subProjection: IssueConnectionResponseProjection): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).projection(subProjection))
        this
    }

    def issues(input: LabelIssuesParametrizedInput,subProjection: IssueConnectionResponseProjection): LabelResponseProjection = {
        issues(null.asInstanceOf[String], input, subProjection)
    }

    def issues(alias: String, input: LabelIssuesParametrizedInput , subProjection: IssueConnectionResponseProjection): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("issues").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def name(): LabelResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def pullRequests(subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection = {
        pullRequests(null.asInstanceOf[String], subProjection)
    }

    def pullRequests(alias: String, subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).projection(subProjection))
        this
    }

    def pullRequests(input: LabelPullRequestsParametrizedInput,subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection = {
        pullRequests(null.asInstanceOf[String], input, subProjection)
    }

    def pullRequests(alias: String, input: LabelPullRequestsParametrizedInput , subProjection: PullRequestConnectionResponseProjection): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequests").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): LabelResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): LabelResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def updatedAt(): LabelResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): LabelResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): LabelResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): LabelResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LabelResponseProjection = {
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
        val that = obj.asInstanceOf[LabelResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
