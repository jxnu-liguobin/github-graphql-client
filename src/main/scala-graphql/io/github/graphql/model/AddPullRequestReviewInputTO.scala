package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import PullRequestReviewEventTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddPullRequestReviewInputTO(
    body: String,
    clientMutationId: String,
    comments: Seq[DraftPullRequestReviewCommentTO],
    commitOID: String,
    event: PullRequestReviewEventTO,
    @javax.validation.constraints.NotNull
    pullRequestId: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (comments != null) "comments: " + GraphQLRequestSerializer.getEntry(comments.asJava) else "",
            if (commitOID != null) "commitOID: " + GraphQLRequestSerializer.getEntry(commitOID) else "",
            if (event != null) "event: " + GraphQLRequestSerializer.getEntry(event) else "",
            if (pullRequestId != null) "pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddPullRequestReviewInputTO {

    def builder(): AddPullRequestReviewInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var comments: Seq[DraftPullRequestReviewCommentTO] = _
        private var commitOID: String = _
        private var event: PullRequestReviewEventTO = _
        private var pullRequestId: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setComments(comments: Seq[DraftPullRequestReviewCommentTO]): Builder = {
            this.comments = comments
            this
        }

        def setCommitOID(commitOID: String): Builder = {
            this.commitOID = commitOID
            this
        }

        def setEvent(event: PullRequestReviewEventTO): Builder = {
            this.event = event
            this
        }

        def setPullRequestId(pullRequestId: String): Builder = {
            this.pullRequestId = pullRequestId
            this
        }

        def build(): AddPullRequestReviewInputTO = new AddPullRequestReviewInputTO(body, clientMutationId, comments, commitOID, event, pullRequestId)

    }
}
