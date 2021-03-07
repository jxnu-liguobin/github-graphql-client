package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestCommitCommentThread
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestCommitCommentThreadResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestCommitCommentThreadResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestCommitCommentThreadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.id()
        this.path()
        this.position()
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def comments(subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: PullRequestCommitCommentThreadCommentsParametrizedInput,subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: PullRequestCommitCommentThreadCommentsParametrizedInput , subProjection: CommitCommentConnectionResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def commit(subProjection: CommitResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def id(): PullRequestCommitCommentThreadResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def path(): PullRequestCommitCommentThreadResponseProjection = {
        path(null.asInstanceOf[String])
    }

    def path(alias: String): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("path").alias(alias))
        this
    }

    def position(): PullRequestCommitCommentThreadResponseProjection = {
        position(null.asInstanceOf[String])
    }

    def position(alias: String): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("position").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): PullRequestCommitCommentThreadResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestCommitCommentThreadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestCommitCommentThreadResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestCommitCommentThreadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
