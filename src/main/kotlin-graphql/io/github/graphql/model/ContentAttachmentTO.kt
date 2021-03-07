package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ContentAttachmentTO(
    val body: String,
    val contentReference: ContentReferenceTO,
    val databaseId: Int,
    val id: String,
    val title: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("contentReference: " + GraphQLRequestSerializer.getEntry(contentReference))
        joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        return joiner.toString()
    }

    class Builder {

        private lateinit var body: String
        private lateinit var contentReference: ContentReferenceTO
        private var databaseId: Int = 0
        private lateinit var id: String
        private lateinit var title: String

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setContentReference(contentReference: ContentReferenceTO): Builder {
            this.contentReference = contentReference
            return this
        }

        fun setDatabaseId(databaseId: Int): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun build(): ContentAttachmentTO {
            return ContentAttachmentTO(body, contentReference, databaseId, id, title)
        }
    }
}
