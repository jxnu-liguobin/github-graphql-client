package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class GitActorTO(
    val date: String?,
    val email: String?,
    val name: String?,
    val user: UserTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (date != null) {
            joiner.add("date: " + GraphQLRequestSerializer.getEntry(date))
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email))
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }

    class Builder {

        private var date: String? = null
        private var email: String? = null
        private var name: String? = null
        private var user: UserTO? = null

        fun setDate(date: String?): Builder {
            this.date = date
            return this
        }

        fun setEmail(email: String?): Builder {
            this.email = email
            return this
        }

        fun setName(name: String?): Builder {
            this.name = name
            return this
        }

        fun setUser(user: UserTO?): Builder {
            this.user = user
            return this
        }

        fun build(): GitActorTO {
            return GitActorTO(date, email, name, user)
        }
    }
}
