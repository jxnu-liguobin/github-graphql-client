package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddCommentPayloadTO(
    val clientMutationId: String?,
    val commentEdge: IssueCommentEdgeTO?,
    val subject: NodeTO?,
    val timelineEdge: IssueTimelineItemEdgeTO?
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
        if (commentEdge != null) {
            joiner.add("commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge))
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        }
        if (timelineEdge != null) {
            joiner.add("timelineEdge: " + GraphQLRequestSerializer.getEntry(timelineEdge))
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
        val that = other as AddCommentPayloadTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(commentEdge, that.commentEdge)
                && Objects.equals(subject, that.subject)
                && Objects.equals(timelineEdge, that.timelineEdge)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, commentEdge, subject, timelineEdge)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var commentEdge: IssueCommentEdgeTO? = null
        private var subject: NodeTO? = null
        private var timelineEdge: IssueTimelineItemEdgeTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setCommentEdge(commentEdge: IssueCommentEdgeTO?): Builder {
            this.commentEdge = commentEdge
            return this
        }

        fun setSubject(subject: NodeTO?): Builder {
            this.subject = subject
            return this
        }

        fun setTimelineEdge(timelineEdge: IssueTimelineItemEdgeTO?): Builder {
            this.timelineEdge = timelineEdge
            return this
        }

        fun build(): AddCommentPayloadTO {
            return AddCommentPayloadTO(clientMutationId, commentEdge, subject, timelineEdge)
        }
    }
}
