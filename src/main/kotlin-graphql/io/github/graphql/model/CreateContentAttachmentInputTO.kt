package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreateContentAttachmentInputTO(
    val body: String,
    val clientMutationId: String?,
    val contentReferenceId: String,
    val title: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("contentReferenceId: " + GraphQLRequestSerializer.getEntry(contentReferenceId))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        return joiner.toString()
    }

    class Builder {

        private lateinit var body: String
        private var clientMutationId: String? = null
        private lateinit var contentReferenceId: String
        private lateinit var title: String

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setContentReferenceId(contentReferenceId: String): Builder {
            this.contentReferenceId = contentReferenceId
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun build(): CreateContentAttachmentInputTO {
            return CreateContentAttachmentInputTO(body, clientMutationId, contentReferenceId, title)
        }
    }
}
