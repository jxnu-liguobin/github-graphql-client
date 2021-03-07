package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UpdateProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val name: String?,
    val projectId: String,
    val public: Boolean?,
    val state: ProjectStateTO?
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId))
        if (public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(public))
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdateProjectInputTO
        return Objects.equals(body, that.body)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(name, that.name)
                && Objects.equals(projectId, that.projectId)
                && Objects.equals(public, that.public)
                && Objects.equals(state, that.state)

    }

    override fun hashCode(): Int = {
        return Objects.hash(body, clientMutationId, name, projectId, public, state)
    }

    class Builder {

        private var body: String? = null
        private var clientMutationId: String? = null
        private var name: String? = null
        private lateinit var projectId: String
        private var public: Boolean? = null
        private var state: ProjectStateTO? = null

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setName(name: String?): Builder {
            this.name = name
            return this
        }

        fun setProjectId(projectId: String): Builder {
            this.projectId = projectId
            return this
        }

        fun setPublic(public: Boolean?): Builder {
            this.public = public
            return this
        }

        fun setState(state: ProjectStateTO?): Builder {
            this.state = state
            return this
        }

        fun build(): UpdateProjectInputTO {
            return UpdateProjectInputTO(body, clientMutationId, name, projectId, public, state)
        }
    }
}
