package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeclineTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeclineTopicSuggestionPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeclineTopicSuggestionPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeclineTopicSuggestionPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0) + 1)
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeclineTopicSuggestionPayloadResponseProjection.TopicResponseProjection.topic", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): DeclineTopicSuggestionPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeclineTopicSuggestionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def topic(subProjection: TopicResponseProjection): DeclineTopicSuggestionPayloadResponseProjection = {
        topic(null.asInstanceOf[String], subProjection)
    }

    def topic(alias: String, subProjection: TopicResponseProjection): DeclineTopicSuggestionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeclineTopicSuggestionPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeclineTopicSuggestionPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[DeclineTopicSuggestionPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
