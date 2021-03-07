package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AcceptTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AcceptTopicSuggestionPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AcceptTopicSuggestionPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AcceptTopicSuggestionPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) + 1)
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AcceptTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AcceptTopicSuggestionPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AcceptTopicSuggestionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def topic(subProjection: TopicResponseProjection): AcceptTopicSuggestionPayloadResponseProjection = {
        topic(null.asInstanceOf[String], subProjection)
    }

    def topic(alias: String, subProjection: TopicResponseProjection): AcceptTopicSuggestionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection))
        this
    }

    def typename(): AcceptTopicSuggestionPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AcceptTopicSuggestionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
