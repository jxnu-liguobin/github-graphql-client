package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ConvertProjectCardNoteToIssuePayloadTO(
    val clientMutationId: String?,
    val projectCard: ProjectCardTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (projectCard != null) {
            joiner.add("projectCard: " + GraphQLRequestSerializer.getEntry(projectCard))
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
        val that = other as ConvertProjectCardNoteToIssuePayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(projectCard, that.projectCard)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, projectCard)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var projectCard: ProjectCardTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setProjectCard(projectCard: ProjectCardTO?): Builder {
            this.projectCard = projectCard
            return this
        }

        fun build(): ConvertProjectCardNoteToIssuePayloadTO {
            return ConvertProjectCardNoteToIssuePayloadTO(clientMutationId, projectCard)
        }
    }
}
