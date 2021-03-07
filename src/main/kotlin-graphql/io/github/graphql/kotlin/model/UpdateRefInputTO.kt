package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UpdateRefInputTO(
    val clientMutationId: String?,
    val force: Boolean? = false,
    val oid: String,
    val refId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (force != null) {
            joiner.add("force: " + GraphQLRequestSerializer.getEntry(force))
        }
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("refId: " + GraphQLRequestSerializer.getEntry(refId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdateRefInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(force, that.force)
                && Objects.equals(oid, that.oid)
                && Objects.equals(refId, that.refId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, force, oid, refId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var force: Boolean? = false
        private lateinit var oid: String
        private lateinit var refId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setForce(force: Boolean?): Builder {
            this.force = force
            return this
        }

        fun setOid(oid: String): Builder {
            this.oid = oid
            return this
        }

        fun setRefId(refId: String): Builder {
            this.refId = refId
            return this
        }

        fun build(): UpdateRefInputTO {
            return UpdateRefInputTO(clientMutationId, force, oid, refId)
        }
    }
}
