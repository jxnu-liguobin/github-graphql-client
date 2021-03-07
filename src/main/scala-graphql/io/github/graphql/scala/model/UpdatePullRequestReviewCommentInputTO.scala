package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdatePullRequestReviewCommentInputTO(
    @javax.validation.constraints.NotNull
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    pullRequestReviewCommentId: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestReviewCommentId != null) "pullRequestReviewCommentId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewCommentId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdatePullRequestReviewCommentInputTO]
        Objects.equals(body, that.body) &&
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequestReviewCommentId, that.pullRequestReviewCommentId)
    }

    override def hashCode(): Int = {
        Objects.hash(body, clientMutationId, pullRequestReviewCommentId)
    }
}

object UpdatePullRequestReviewCommentInputTO {

    def builder(): UpdatePullRequestReviewCommentInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var pullRequestReviewCommentId: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestReviewCommentId(pullRequestReviewCommentId: String): Builder = {
            this.pullRequestReviewCommentId = pullRequestReviewCommentId
            this
        }

        def build(): UpdatePullRequestReviewCommentInputTO = new UpdatePullRequestReviewCommentInputTO(body, clientMutationId, pullRequestReviewCommentId)

    }
}
