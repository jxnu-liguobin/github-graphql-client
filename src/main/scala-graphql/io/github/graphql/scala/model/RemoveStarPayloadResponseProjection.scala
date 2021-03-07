package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RemoveStarPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RemoveStarPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): RemoveStarPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): RemoveStarPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) + 1)
            this.starrable(new StarrableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): RemoveStarPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): RemoveStarPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def starrable(subProjection: StarrableResponseProjection): RemoveStarPayloadResponseProjection = {
        starrable(null.asInstanceOf[String], subProjection)
    }

    def starrable(alias: String, subProjection: StarrableResponseProjection): RemoveStarPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("starrable").alias(alias).projection(subProjection))
        this
    }

    def typename(): RemoveStarPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RemoveStarPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[RemoveStarPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
