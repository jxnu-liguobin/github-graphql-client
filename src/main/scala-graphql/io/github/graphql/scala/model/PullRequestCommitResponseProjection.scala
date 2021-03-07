package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestCommit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestCommitResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestCommitResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestCommitResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def commit(subProjection: CommitResponseProjection): PullRequestCommitResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): PullRequestCommitResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def id(): PullRequestCommitResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PullRequestCommitResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): PullRequestCommitResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): PullRequestCommitResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): PullRequestCommitResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): PullRequestCommitResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): PullRequestCommitResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): PullRequestCommitResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): PullRequestCommitResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestCommitResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestCommitResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
