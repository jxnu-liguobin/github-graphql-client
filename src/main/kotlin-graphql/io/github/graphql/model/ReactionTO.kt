package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReactionTO(
    val content: ReactionContentTO,
    val createdAt: String,
    val databaseId: Int?,
    override
    val id: String,
    val reactable: ReactableTO,
    val user: UserTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("content: " + GraphQLRequestSerializer.getEntry(content))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("reactable: " + GraphQLRequestSerializer.getEntry(reactable))
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var content: ReactionContentTO
        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private lateinit var id: String
        private lateinit var reactable: ReactableTO
        private var user: UserTO? = null

        fun setContent(content: ReactionContentTO): Builder {
            this.content = content
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
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

        fun setReactable(reactable: ReactableTO): Builder {
            this.reactable = reactable
            return this
        }

        fun setUser(user: UserTO?): Builder {
            this.user = user
            return this
        }

        fun build(): ReactionTO {
            return ReactionTO(content, createdAt, databaseId, id, reactable, user)
        }
    }
}
