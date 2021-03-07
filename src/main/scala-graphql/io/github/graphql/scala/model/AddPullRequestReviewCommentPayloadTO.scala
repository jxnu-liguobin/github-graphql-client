package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class AddPullRequestReviewCommentPayloadTO(
    clientMutationId: String,
    comment: PullRequestReviewCommentTO,
    commentEdge: PullRequestReviewCommentEdgeTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (comment != null) "comment: " + GraphQLRequestSerializer.getEntry(comment) else "",
            if (commentEdge != null) "commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddPullRequestReviewCommentPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(comment, that.comment) &&
        Objects.equals(commentEdge, that.commentEdge)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, comment, commentEdge)
    }
}

object AddPullRequestReviewCommentPayloadTO {

    def builder(): AddPullRequestReviewCommentPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var comment: PullRequestReviewCommentTO = _
        private var commentEdge: PullRequestReviewCommentEdgeTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setComment(comment: PullRequestReviewCommentTO): Builder = {
            this.comment = comment
            this
        }

        def setCommentEdge(commentEdge: PullRequestReviewCommentEdgeTO): Builder = {
            this.commentEdge = commentEdge
            this
        }

        def build(): AddPullRequestReviewCommentPayloadTO = new AddPullRequestReviewCommentPayloadTO(clientMutationId, comment, commentEdge)

    }
}
