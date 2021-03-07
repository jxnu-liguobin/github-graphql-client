package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PublicKeyTO(
    val accessedAt: String?,
    val createdAt: String?,
    val fingerprint: String,
    override
    val id: String,
    val isReadOnly: Boolean?,
    val key: String,
    val updatedAt: String?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (accessedAt != null) {
            joiner.add("accessedAt: " + GraphQLRequestSerializer.getEntry(accessedAt))
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        }
        joiner.add("fingerprint: " + GraphQLRequestSerializer.getEntry(fingerprint))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (isReadOnly != null) {
            joiner.add("isReadOnly: " + GraphQLRequestSerializer.getEntry(isReadOnly))
        }
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        }
        return joiner.toString()
    }

    class Builder {

        private var accessedAt: String? = null
        private var createdAt: String? = null
        private lateinit var fingerprint: String
        private lateinit var id: String
        private var isReadOnly: Boolean? = null
        private lateinit var key: String
        private var updatedAt: String? = null

        fun setAccessedAt(accessedAt: String?): Builder {
            this.accessedAt = accessedAt
            return this
        }

        fun setCreatedAt(createdAt: String?): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setFingerprint(fingerprint: String): Builder {
            this.fingerprint = fingerprint
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsReadOnly(isReadOnly: Boolean?): Builder {
            this.isReadOnly = isReadOnly
            return this
        }

        fun setKey(key: String): Builder {
            this.key = key
            return this
        }

        fun setUpdatedAt(updatedAt: String?): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun build(): PublicKeyTO {
            return PublicKeyTO(accessedAt, createdAt, fingerprint, id, isReadOnly, key, updatedAt)
        }
    }
}
