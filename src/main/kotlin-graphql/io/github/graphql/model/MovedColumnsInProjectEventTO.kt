package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class MovedColumnsInProjectEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val databaseId: Int?,
    override
    val id: String
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private lateinit var id: String

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
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

        fun build(): MovedColumnsInProjectEventTO {
            return MovedColumnsInProjectEventTO(actor, createdAt, databaseId, id)
        }
    }
}
