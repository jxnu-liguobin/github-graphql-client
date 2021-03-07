package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddPullRequestReviewCommentInputTO(
    @javax.validation.constraints.NotNull
    body: String,
    clientMutationId: String,
    commitOID: String,
    inReplyTo: String,
    path: String,
    position: Option[Int],
    @javax.validation.constraints.NotNull
    pullRequestReviewId: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (commitOID != null) "commitOID: " + GraphQLRequestSerializer.getEntry(commitOID) else "",
            if (inReplyTo != null) "inReplyTo: " + GraphQLRequestSerializer.getEntry(inReplyTo) else "",
            if (path != null) "path: " + GraphQLRequestSerializer.getEntry(path) else "",
            if (position.isDefined) "position: " + GraphQLRequestSerializer.getEntry(position.get) else "",
            if (pullRequestReviewId != null) "pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddPullRequestReviewCommentInputTO {

    def builder(): AddPullRequestReviewCommentInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var commitOID: String = _
        private var inReplyTo: String = _
        private var path: String = _
        private var position: Option[Int] = _
        private var pullRequestReviewId: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setCommitOID(commitOID: String): Builder = {
            this.commitOID = commitOID
            this
        }

        def setInReplyTo(inReplyTo: String): Builder = {
            this.inReplyTo = inReplyTo
            this
        }

        def setPath(path: String): Builder = {
            this.path = path
            this
        }

        def setPosition(position: Option[Int]): Builder = {
            this.position = position
            this
        }

        def setPullRequestReviewId(pullRequestReviewId: String): Builder = {
            this.pullRequestReviewId = pullRequestReviewId
            this
        }

        def build(): AddPullRequestReviewCommentInputTO = new AddPullRequestReviewCommentInputTO(body, clientMutationId, commitOID, inReplyTo, path, position, pullRequestReviewId)

    }
}