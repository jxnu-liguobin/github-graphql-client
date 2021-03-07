package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ChangeUserStatusPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ChangeUserStatusPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): ChangeUserStatusPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): ChangeUserStatusPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0) + 1)
            this.status(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): ChangeUserStatusPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): ChangeUserStatusPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def status(subProjection: UserStatusResponseProjection): ChangeUserStatusPayloadResponseProjection = {
        status(null.asInstanceOf[String], subProjection)
    }

    def status(alias: String, subProjection: UserStatusResponseProjection): ChangeUserStatusPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("status").alias(alias).projection(subProjection))
        this
    }

    def typename(): ChangeUserStatusPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ChangeUserStatusPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[ChangeUserStatusPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
