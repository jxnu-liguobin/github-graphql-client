package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnlockLockablePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnlockLockablePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnlockLockablePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnlockLockablePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0) + 1)
            this.unlockedRecord(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UnlockLockablePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UnlockLockablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def unlockedRecord(subProjection: LockableResponseProjection): UnlockLockablePayloadResponseProjection = {
        unlockedRecord(null.asInstanceOf[String], subProjection)
    }

    def unlockedRecord(alias: String, subProjection: LockableResponseProjection): UnlockLockablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("unlockedRecord").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnlockLockablePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnlockLockablePayloadResponseProjection = {
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
        val that = obj.asInstanceOf[UnlockLockablePayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
