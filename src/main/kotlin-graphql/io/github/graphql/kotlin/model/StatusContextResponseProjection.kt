package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for StatusContext
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class StatusContextResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): StatusContextResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): StatusContextResponseProjection {
        this.avatarUrl()
        if (projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["StatusContextResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.context()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields["StatusContextResponseProjection.ActorResponseProjection.creator"] = projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0) + 1
            this.creator(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.description()
        this.id()
        this.state()
        this.targetUrl()
        this.typename()
        return this
    }

    fun avatarUrl(): StatusContextResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: StatusContextAvatarUrlParametrizedInput): StatusContextResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: StatusContextAvatarUrlParametrizedInput): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): StatusContextResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun context(): StatusContextResponseProjection = context(null)

    fun context(alias: String?): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("context").alias(alias))
        return this
    }

    fun createdAt(): StatusContextResponseProjection = createdAt(null)

    fun createdAt(alias: String?): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun creator(subProjection: ActorResponseProjection): StatusContextResponseProjection = creator(null, subProjection)

    fun creator(alias: String?, subProjection: ActorResponseProjection): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("creator").alias(alias).projection(subProjection))
        return this
    }

    fun description(): StatusContextResponseProjection = description(null)

    fun description(alias: String?): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun id(): StatusContextResponseProjection = id(null)

    fun id(alias: String?): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun state(): StatusContextResponseProjection = state(null)

    fun state(alias: String?): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun targetUrl(): StatusContextResponseProjection = targetUrl(null)

    fun targetUrl(alias: String?): StatusContextResponseProjection {
        fields.add(GraphQLResponseField("targetUrl").alias(alias))
        return this
    }

    fun typename(): StatusContextResponseProjection = typename(null)

    fun typename(alias: String?): StatusContextResponseProjection {
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
        val that = other as StatusContextResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
