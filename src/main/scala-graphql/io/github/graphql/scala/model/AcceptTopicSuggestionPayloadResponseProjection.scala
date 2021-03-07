package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AcceptTopicSuggestionPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AcceptTopicSuggestionPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
