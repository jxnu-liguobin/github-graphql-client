package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddCommentPayloadTO(
    clientMutationId: String,
    commentEdge: IssueCommentEdgeTO,
    subject: NodeTO,
    timelineEdge: IssueTimelineItemEdgeTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (commentEdge != null) "commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge) else "",
            if (subject != null) "subject: " + GraphQLRequestSerializer.getEntry(subject) else "",
            if (timelineEdge != null) "timelineEdge: " + GraphQLRequestSerializer.getEntry(timelineEdge) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddCommentPayloadTO {

    def builder(): AddCommentPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var commentEdge: IssueCommentEdgeTO = _
        private var subject: NodeTO = _
        private var timelineEdge: IssueTimelineItemEdgeTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setCommentEdge(commentEdge: IssueCommentEdgeTO): Builder = {
            this.commentEdge = commentEdge
            this
        }

        def setSubject(subject: NodeTO): Builder = {
            this.subject = subject
            this
        }

        def setTimelineEdge(timelineEdge: IssueTimelineItemEdgeTO): Builder = {
            this.timelineEdge = timelineEdge
            this
        }

        def build(): AddCommentPayloadTO = new AddCommentPayloadTO(clientMutationId, commentEdge, subject, timelineEdge)

    }
}
