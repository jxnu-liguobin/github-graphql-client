package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
