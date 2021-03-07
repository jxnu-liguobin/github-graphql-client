package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for TransferredEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class TransferredEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TransferredEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TransferredEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["TransferredEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0) <= maxDepth) {
            projectionDepthOnFields["TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository"] = projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0) + 1
            this.fromRepository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0)))
        }
        this.id()
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["TransferredEventResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): TransferredEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): TransferredEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): TransferredEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): TransferredEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun fromRepository(subProjection: RepositoryResponseProjection): TransferredEventResponseProjection = fromRepository(null, subProjection)

    fun fromRepository(alias: String?, subProjection: RepositoryResponseProjection): TransferredEventResponseProjection {
        fields.add(GraphQLResponseField("fromRepository").alias(alias).projection(subProjection))
        return this
    }

    fun id(): TransferredEventResponseProjection = id(null)

    fun id(alias: String?): TransferredEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): TransferredEventResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): TransferredEventResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): TransferredEventResponseProjection = typename(null)

    fun typename(alias: String?): TransferredEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TransferredEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
