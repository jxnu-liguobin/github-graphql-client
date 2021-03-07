package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreateProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val name: String,
    val ownerId: String,
    val repositoryIds: List<String>?,
    val template: ProjectTemplateTO?
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
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId))
        if (repositoryIds != null) {
            joiner.add("repositoryIds: " + GraphQLRequestSerializer.getEntry(repositoryIds))
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template))
        }
        return joiner.toString()
    }

    class Builder {

        private var body: String? = null
        private var clientMutationId: String? = null
        private lateinit var name: String
        private lateinit var ownerId: String
        private var repositoryIds: List<String>? = null
        private var template: ProjectTemplateTO? = null

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setOwnerId(ownerId: String): Builder {
            this.ownerId = ownerId
            return this
        }

        fun setRepositoryIds(repositoryIds: List<String>?): Builder {
            this.repositoryIds = repositoryIds
            return this
        }

        fun setTemplate(template: ProjectTemplateTO?): Builder {
            this.template = template
            return this
        }

        fun build(): CreateProjectInputTO {
            return CreateProjectInputTO(body, clientMutationId, name, ownerId, repositoryIds, template)
        }
    }
}
