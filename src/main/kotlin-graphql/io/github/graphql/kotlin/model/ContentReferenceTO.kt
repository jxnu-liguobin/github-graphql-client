package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ContentReferenceTO
        return Objects.equals(databaseId, that.databaseId)
                && Objects.equals(id, that.id)
                && Objects.equals(reference, that.reference)

    }

    override fun hashCode(): Int = {
        return Objects.hash(databaseId, id, reference)
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
