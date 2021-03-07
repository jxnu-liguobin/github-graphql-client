package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UpdateTopicsPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UpdateTopicsPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateTopicsPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateTopicsPayloadResponseProjection {
        this.clientMutationId()
        this.invalidTopicNames()
        if (projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateTopicsPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateTopicsPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun invalidTopicNames(): UpdateTopicsPayloadResponseProjection = invalidTopicNames(null)

    fun invalidTopicNames(alias: String?): UpdateTopicsPayloadResponseProjection {
        fields.add(GraphQLResponseField("invalidTopicNames").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): UpdateTopicsPayloadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): UpdateTopicsPayloadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateTopicsPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateTopicsPayloadResponseProjection {
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
        val that = other as UpdateTopicsPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
