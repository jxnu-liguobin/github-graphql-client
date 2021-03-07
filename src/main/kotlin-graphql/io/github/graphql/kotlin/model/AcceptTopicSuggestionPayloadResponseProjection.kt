package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AcceptTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AcceptTopicSuggestionPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AcceptTopicSuggestionPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AcceptTopicSuggestionPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields["AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic"] = projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) + 1
            this.topic(TopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AcceptTopicSuggestionPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AcceptTopicSuggestionPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun topic(subProjection: TopicResponseProjection): AcceptTopicSuggestionPayloadResponseProjection = topic(null, subProjection)

    fun topic(alias: String?, subProjection: TopicResponseProjection): AcceptTopicSuggestionPayloadResponseProjection {
        fields.add(GraphQLResponseField("topic").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AcceptTopicSuggestionPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AcceptTopicSuggestionPayloadResponseProjection {
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
        val that = other as AcceptTopicSuggestionPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
