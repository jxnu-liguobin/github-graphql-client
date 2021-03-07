package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MergedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MergedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): MergedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): MergedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.RefResponseProjection.mergeRef", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0) + 1)
            this.mergeRef(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.RefResponseProjection.mergeRef", 0)))
        }
        this.mergeRefName()
        if (projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): MergedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def commit(subProjection: CommitResponseProjection): MergedEventResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): MergedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): MergedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def mergeRef(subProjection: RefResponseProjection): MergedEventResponseProjection = {
        mergeRef(null.asInstanceOf[String], subProjection)
    }

    def mergeRef(alias: String, subProjection: RefResponseProjection): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("mergeRef").alias(alias).projection(subProjection))
        this
    }

    def mergeRefName(): MergedEventResponseProjection = {
        mergeRefName(null.asInstanceOf[String])
    }

    def mergeRefName(alias: String): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("mergeRefName").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): MergedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): MergedEventResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): MergedEventResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): MergedEventResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): MergedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MergedEventResponseProjection = {
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
        val that = obj.asInstanceOf[MergedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
