package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeclineTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeclineTopicSuggestionPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeclineTopicSuggestionPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeclineTopicSuggestionPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields["DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic"] = projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) + 1
            this.topic(TopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): DeclineTopicSuggestionPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeclineTopicSuggestionPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun topic(subProjection: TopicResponseProjection): DeclineTopicSuggestionPayloadResponseProjection = topic(null, subProjection)

    fun topic(alias: String?, subProjection: TopicResponseProjection): DeclineTopicSuggestionPayloadResponseProjection {
        fields.add(GraphQLResponseField("topic").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeclineTopicSuggestionPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeclineTopicSuggestionPayloadResponseProjection {
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
        val that = other as DeclineTopicSuggestionPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
