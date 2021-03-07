package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class IssueFiltersTO(
    val assignee: String?,
    val createdBy: String?,
    val labels: List<String>?,
    val mentioned: String?,
    val milestone: String?,
    val since: String?,
    val states: List<IssueStateTO>?,
    val viewerSubscribed: Boolean? = false
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (assignee != null) {
            joiner.add("assignee: " + GraphQLRequestSerializer.getEntry(assignee))
        }
        if (createdBy != null) {
            joiner.add("createdBy: " + GraphQLRequestSerializer.getEntry(createdBy))
        }
        if (labels != null) {
            joiner.add("labels: " + GraphQLRequestSerializer.getEntry(labels))
        }
        if (mentioned != null) {
            joiner.add("mentioned: " + GraphQLRequestSerializer.getEntry(mentioned))
        }
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone))
        }
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since))
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states))
        }
        if (viewerSubscribed != null) {
            joiner.add("viewerSubscribed: " + GraphQLRequestSerializer.getEntry(viewerSubscribed))
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
        val that = other as IssueFiltersTO
        return Objects.equals(assignee, that.assignee)
                && Objects.equals(createdBy, that.createdBy)
                && Objects.equals(labels, that.labels)
                && Objects.equals(mentioned, that.mentioned)
                && Objects.equals(milestone, that.milestone)
                && Objects.equals(since, that.since)
                && Objects.equals(states, that.states)
                && Objects.equals(viewerSubscribed, that.viewerSubscribed)

    }

    override fun hashCode(): Int = {
        return Objects.hash(assignee, createdBy, labels, mentioned, milestone, since, states, viewerSubscribed)
    }

    class Builder {

        private var assignee: String? = null
        private var createdBy: String? = null
        private var labels: List<String>? = null
        private var mentioned: String? = null
        private var milestone: String? = null
        private var since: String? = null
        private var states: List<IssueStateTO>? = null
        private var viewerSubscribed: Boolean? = false

        fun setAssignee(assignee: String?): Builder {
            this.assignee = assignee
            return this
        }

        fun setCreatedBy(createdBy: String?): Builder {
            this.createdBy = createdBy
            return this
        }

        fun setLabels(labels: List<String>?): Builder {
            this.labels = labels
            return this
        }

        fun setMentioned(mentioned: String?): Builder {
            this.mentioned = mentioned
            return this
        }

        fun setMilestone(milestone: String?): Builder {
            this.milestone = milestone
            return this
        }

        fun setSince(since: String?): Builder {
            this.since = since
            return this
        }

        fun setStates(states: List<IssueStateTO>?): Builder {
            this.states = states
            return this
        }

        fun setViewerSubscribed(viewerSubscribed: Boolean?): Builder {
            this.viewerSubscribed = viewerSubscribed
            return this
        }

        fun build(): IssueFiltersTO {
            return IssueFiltersTO(assignee, createdBy, labels, mentioned, milestone, since, states, viewerSubscribed)
        }
    }
}
