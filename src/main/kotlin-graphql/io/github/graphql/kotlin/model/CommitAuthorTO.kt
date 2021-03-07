package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class CommitAuthorTO(
    val emails: List<String>?,
    val id: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (emails != null) {
            joiner.add("emails: " + GraphQLRequestSerializer.getEntry(emails))
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
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
        val that = other as CommitAuthorTO
        return Objects.equals(emails, that.emails)
                && Objects.equals(id, that.id)

    }

    override fun hashCode(): Int = {
        return Objects.hash(emails, id)
    }

    class Builder {

        private var emails: List<String>? = null
        private var id: String? = null

        fun setEmails(emails: List<String>?): Builder {
            this.emails = emails
            return this
        }

        fun setId(id: String?): Builder {
            this.id = id
            return this
        }

        fun build(): CommitAuthorTO {
            return CommitAuthorTO(emails, id)
        }
    }
}
