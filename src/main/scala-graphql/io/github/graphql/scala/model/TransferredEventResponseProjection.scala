package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for TransferredEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TransferredEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): TransferredEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): TransferredEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransferredEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0) + 1)
            this.fromRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransferredEventResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0) + 1)
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): TransferredEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): TransferredEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): TransferredEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): TransferredEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def fromRepository(subProjection: RepositoryResponseProjection): TransferredEventResponseProjection = {
        fromRepository(null.asInstanceOf[String], subProjection)
    }

    def fromRepository(alias: String, subProjection: RepositoryResponseProjection): TransferredEventResponseProjection = {
        fields.add(new GraphQLResponseField("fromRepository").alias(alias).projection(subProjection))
        this
    }

    def id(): TransferredEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): TransferredEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def issue(subProjection: IssueResponseProjection): TransferredEventResponseProjection = {
        issue(null.asInstanceOf[String], subProjection)
    }

    def issue(alias: String, subProjection: IssueResponseProjection): TransferredEventResponseProjection = {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection))
        this
    }

    def typename(): TransferredEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TransferredEventResponseProjection = {
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
        val that = obj.asInstanceOf[TransferredEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
