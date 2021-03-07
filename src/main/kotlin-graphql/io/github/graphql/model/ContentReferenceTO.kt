package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ContentReferenceTO(
    val databaseId: Int,
    val id: String,
    val reference: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("reference: " + GraphQLRequestSerializer.getEntry(reference))
        return joiner.toString()
    }

    class Builder {

        private var databaseId: Int = 0
        private lateinit var id: String
        private lateinit var reference: String

        fun setDatabaseId(databaseId: Int): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setReference(reference: String): Builder {
            this.reference = reference
            return this
        }

        fun build(): ContentReferenceTO {
            return ContentReferenceTO(databaseId, id, reference)
        }
    }
}
