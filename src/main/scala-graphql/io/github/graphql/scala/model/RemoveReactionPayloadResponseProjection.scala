package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RemoveReactionPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RemoveReactionPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): RemoveReactionPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): RemoveReactionPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) + 1)
            this.reaction(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) + 1)
            this.subject(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): RemoveReactionPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): RemoveReactionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def reaction(subProjection: ReactionResponseProjection): RemoveReactionPayloadResponseProjection = {
        reaction(null.asInstanceOf[String], subProjection)
    }

    def reaction(alias: String, subProjection: ReactionResponseProjection): RemoveReactionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("reaction").alias(alias).projection(subProjection))
        this
    }

    def subject(subProjection: ReactableResponseProjection): RemoveReactionPayloadResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: ReactableResponseProjection): RemoveReactionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def typename(): RemoveReactionPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RemoveReactionPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[RemoveReactionPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
