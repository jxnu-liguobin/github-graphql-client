package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateTopicsPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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


}
