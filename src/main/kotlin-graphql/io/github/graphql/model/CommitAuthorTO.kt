package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
