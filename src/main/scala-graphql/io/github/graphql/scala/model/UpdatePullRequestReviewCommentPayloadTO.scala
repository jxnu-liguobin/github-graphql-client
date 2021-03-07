package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UpdatePullRequestReviewCommentPayloadTO(
    clientMutationId: String,
    pullRequestReviewComment: PullRequestReviewCommentTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestReviewComment != null) "pullRequestReviewComment: " + GraphQLRequestSerializer.getEntry(pullRequestReviewComment) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdatePullRequestReviewCommentPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequestReviewComment, that.pullRequestReviewComment)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, pullRequestReviewComment)
    }
}

object UpdatePullRequestReviewCommentPayloadTO {

    def builder(): UpdatePullRequestReviewCommentPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequestReviewComment: PullRequestReviewCommentTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestReviewComment(pullRequestReviewComment: PullRequestReviewCommentTO): Builder = {
            this.pullRequestReviewComment = pullRequestReviewComment
            this
        }

        def build(): UpdatePullRequestReviewCommentPayloadTO = new UpdatePullRequestReviewCommentPayloadTO(clientMutationId, pullRequestReviewComment)

    }
}
