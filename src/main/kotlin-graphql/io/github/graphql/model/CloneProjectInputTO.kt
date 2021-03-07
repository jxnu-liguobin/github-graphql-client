package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CloneProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val includeWorkflows: Boolean,
    val name: String,
    val public: Boolean?,
    val sourceId: String,
    val targetOwnerId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("includeWorkflows: " + GraphQLRequestSerializer.getEntry(includeWorkflows))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(public))
        }
        joiner.add("sourceId: " + GraphQLRequestSerializer.getEntry(sourceId))
        joiner.add("targetOwnerId: " + GraphQLRequestSerializer.getEntry(targetOwnerId))
        return joiner.toString()
    }

    class Builder {

        private var body: String? = null
        private var clientMutationId: String? = null
        private var includeWorkflows: Boolean = false
        private lateinit var name: String
        private var public: Boolean? = null
        private lateinit var sourceId: String
        private lateinit var targetOwnerId: String

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setIncludeWorkflows(includeWorkflows: Boolean): Builder {
            this.includeWorkflows = includeWorkflows
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setPublic(public: Boolean?): Builder {
            this.public = public
            return this
        }

        fun setSourceId(sourceId: String): Builder {
            this.sourceId = sourceId
            return this
        }

        fun setTargetOwnerId(targetOwnerId: String): Builder {
            this.targetOwnerId = targetOwnerId
            return this
        }

        fun build(): CloneProjectInputTO {
            return CloneProjectInputTO(body, clientMutationId, includeWorkflows, name, public, sourceId, targetOwnerId)
        }
    }
}
