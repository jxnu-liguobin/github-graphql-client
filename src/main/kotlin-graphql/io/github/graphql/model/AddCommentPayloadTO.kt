package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
