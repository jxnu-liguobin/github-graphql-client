package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as StatusTO
        return Objects.equals(commit, that.commit)
                && Objects.equals(contexts, that.contexts)
                && Objects.equals(id, that.id)
                && Objects.equals(state, that.state)

    }

    override fun hashCode(): Int = {
        return Objects.hash(commit, contexts, id, state)
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
