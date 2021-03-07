package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
