package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class StatusTO(
    val commit: CommitTO?,
    val contexts: List<StatusContextTO>,
    override
    val id: String,
    val state: StatusStateTO
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("contexts: " + GraphQLRequestSerializer.getEntry(contexts))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        return joiner.toString()
    }

    class Builder {

        private var commit: CommitTO? = null
        private lateinit var contexts: List<StatusContextTO>
        private lateinit var id: String
        private lateinit var state: StatusStateTO

        fun setCommit(commit: CommitTO?): Builder {
            this.commit = commit
            return this
        }

        fun setContexts(contexts: List<StatusContextTO>): Builder {
            this.contexts = contexts
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setState(state: StatusStateTO): Builder {
            this.state = state
            return this
        }

        fun build(): StatusTO {
            return StatusTO(commit, contexts, id, state)
        }
    }
}
