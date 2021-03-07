package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddCommentPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(commentEdge, that.commentEdge) &&
        Objects.equals(subject, that.subject) &&
        Objects.equals(timelineEdge, that.timelineEdge)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, commentEdge, subject, timelineEdge)
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
