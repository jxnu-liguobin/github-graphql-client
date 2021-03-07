package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreateIssueInputTO(
    val assigneeIds: List<String>?,
    val body: String?,
    val clientMutationId: String?,
    val labelIds: List<String>?,
    val milestoneId: String?,
    val projectIds: List<String>?,
    val repositoryId: String,
    val title: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (assigneeIds != null) {
            joiner.add("assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds))
        }
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (labelIds != null) {
            joiner.add("labelIds: " + GraphQLRequestSerializer.getEntry(labelIds))
        }
        if (milestoneId != null) {
            joiner.add("milestoneId: " + GraphQLRequestSerializer.getEntry(milestoneId))
        }
        if (projectIds != null) {
            joiner.add("projectIds: " + GraphQLRequestSerializer.getEntry(projectIds))
        }
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        return joiner.toString()
    }

    class Builder {

        private var assigneeIds: List<String>? = null
        private var body: String? = null
        private var clientMutationId: String? = null
        private var labelIds: List<String>? = null
        private var milestoneId: String? = null
        private var projectIds: List<String>? = null
        private lateinit var repositoryId: String
        private lateinit var title: String

        fun setAssigneeIds(assigneeIds: List<String>?): Builder {
            this.assigneeIds = assigneeIds
            return this
        }

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setLabelIds(labelIds: List<String>?): Builder {
            this.labelIds = labelIds
            return this
        }

        fun setMilestoneId(milestoneId: String?): Builder {
            this.milestoneId = milestoneId
            return this
        }

        fun setProjectIds(projectIds: List<String>?): Builder {
            this.projectIds = projectIds
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun build(): CreateIssueInputTO {
            return CreateIssueInputTO(assigneeIds, body, clientMutationId, labelIds, milestoneId, projectIds, repositoryId, title)
        }
    }
}
