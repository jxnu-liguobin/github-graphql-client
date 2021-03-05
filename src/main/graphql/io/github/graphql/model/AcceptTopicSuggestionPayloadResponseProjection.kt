package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AcceptTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
