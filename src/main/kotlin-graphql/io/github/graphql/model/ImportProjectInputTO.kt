package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ImportProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val columnImports: List<ProjectColumnImportTO>,
    val name: String,
    val ownerName: String,
    val public: Boolean? = false
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
        joiner.add("columnImports: " + GraphQLRequestSerializer.getEntry(columnImports))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("ownerName: " + GraphQLRequestSerializer.getEntry(ownerName))
        if (public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(public))
        }
        return joiner.toString()
    }

    class Builder {

        private var body: String? = null
        private var clientMutationId: String? = null
        private lateinit var columnImports: List<ProjectColumnImportTO>
        private lateinit var name: String
        private lateinit var ownerName: String
        private var public: Boolean? = false

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setColumnImports(columnImports: List<ProjectColumnImportTO>): Builder {
            this.columnImports = columnImports
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setOwnerName(ownerName: String): Builder {
            this.ownerName = ownerName
            return this
        }

        fun setPublic(public: Boolean?): Builder {
            this.public = public
            return this
        }

        fun build(): ImportProjectInputTO {
            return ImportProjectInputTO(body, clientMutationId, columnImports, name, ownerName, public)
        }
    }
}
