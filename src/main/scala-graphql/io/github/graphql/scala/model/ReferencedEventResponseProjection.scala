package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReferencedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReferencedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReferencedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReferencedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0) + 1)
            this.commitRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0)))
        }
        this.createdAt()
        this.id()
        this.isCrossRepository()
        this.isDirectReference()
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0) + 1)
            this.subject(new ReferencedSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): ReferencedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def commit(subProjection: CommitResponseProjection): ReferencedEventResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def commitRepository(subProjection: RepositoryResponseProjection): ReferencedEventResponseProjection = {
        commitRepository(null.asInstanceOf[String], subProjection)
    }

    def commitRepository(alias: String, subProjection: RepositoryResponseProjection): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("commitRepository").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ReferencedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): ReferencedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isCrossRepository(): ReferencedEventResponseProjection = {
        isCrossRepository(null.asInstanceOf[String])
    }

    def isCrossRepository(alias: String): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("isCrossRepository").alias(alias))
        this
    }

    def isDirectReference(): ReferencedEventResponseProjection = {
        isDirectReference(null.asInstanceOf[String])
    }

    def isDirectReference(alias: String): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("isDirectReference").alias(alias))
        this
    }

    def subject(subProjection: ReferencedSubjectResponseProjection): ReferencedEventResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: ReferencedSubjectResponseProjection): ReferencedEventResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReferencedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReferencedEventResponseProjection = {
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
        val that = obj.asInstanceOf[ReferencedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
