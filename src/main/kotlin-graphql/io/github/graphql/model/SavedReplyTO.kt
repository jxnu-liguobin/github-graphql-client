package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SavedReplyTO(
    val body: String,
    val bodyHTML: String,
    val databaseId: Int?,
    override
    val id: String,
    val title: String,
    val user: ActorTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var body: String
        private lateinit var bodyHTML: String
        private var databaseId: Int? = null
        private lateinit var id: String
        private lateinit var title: String
        private var user: ActorTO? = null

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setBodyHTML(bodyHTML: String): Builder {
            this.bodyHTML = bodyHTML
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
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

        fun setUser(user: ActorTO?): Builder {
            this.user = user
            return this
        }

        fun build(): SavedReplyTO {
            return SavedReplyTO(body, bodyHTML, databaseId, id, title, user)
        }
    }
}
