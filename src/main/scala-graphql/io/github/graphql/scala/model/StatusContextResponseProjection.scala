package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for StatusContext
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class StatusContextResponseProjection extends GraphQLResponseProjection {

    override def all$(): StatusContextResponseProjection = all$(3)

    override def all$(maxDepth: Int): StatusContextResponseProjection = {
        this.avatarUrl()
        if (projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusContextResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.context()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusContextResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0) + 1)
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.description()
        this.id()
        this.state()
        this.targetUrl()
        this.typename()
        this
    }

    def avatarUrl(): StatusContextResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: StatusContextAvatarUrlParametrizedInput): StatusContextResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: StatusContextAvatarUrlParametrizedInput ): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def commit(subProjection: CommitResponseProjection): StatusContextResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def context(): StatusContextResponseProjection = {
        context(null.asInstanceOf[String])
    }

    def context(alias: String): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("context").alias(alias))
        this
    }

    def createdAt(): StatusContextResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def creator(subProjection: ActorResponseProjection): StatusContextResponseProjection = {
        creator(null.asInstanceOf[String], subProjection)
    }

    def creator(alias: String, subProjection: ActorResponseProjection): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection))
        this
    }

    def description(): StatusContextResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def id(): StatusContextResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def state(): StatusContextResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def targetUrl(): StatusContextResponseProjection = {
        targetUrl(null.asInstanceOf[String])
    }

    def targetUrl(alias: String): StatusContextResponseProjection = {
        fields.add(new GraphQLResponseField("targetUrl").alias(alias))
        this
    }

    def typename(): StatusContextResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): StatusContextResponseProjection = {
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
        val that = obj.asInstanceOf[StatusContextResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
