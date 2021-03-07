package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateIssueInputTO(
    val assigneeIds: List<String>?,
    val body: String?,
    val clientMutationId: String?,
    val id: String,
    val labelIds: List<String>?,
    val milestoneId: String?,
    val projectIds: List<String>?,
    val state: IssueStateTO?,
    val title: String?
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
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (labelIds != null) {
            joiner.add("labelIds: " + GraphQLRequestSerializer.getEntry(labelIds))
        }
        if (milestoneId != null) {
            joiner.add("milestoneId: " + GraphQLRequestSerializer.getEntry(milestoneId))
        }
        if (projectIds != null) {
            joiner.add("projectIds: " + GraphQLRequestSerializer.getEntry(projectIds))
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        }
        return joiner.toString()
    }

    class Builder {

        private var assigneeIds: List<String>? = null
        private var body: String? = null
        private var clientMutationId: String? = null
        private lateinit var id: String
        private var labelIds: List<String>? = null
        private var milestoneId: String? = null
        private var projectIds: List<String>? = null
        private var state: IssueStateTO? = null
        private var title: String? = null

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

        fun setId(id: String): Builder {
            this.id = id
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

        fun setState(state: IssueStateTO?): Builder {
            this.state = state
            return this
        }

        fun setTitle(title: String?): Builder {
            this.title = title
            return this
        }

        fun build(): UpdateIssueInputTO {
            return UpdateIssueInputTO(assigneeIds, body, clientMutationId, id, labelIds, milestoneId, projectIds, state, title)
        }
    }
}
