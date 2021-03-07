package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DismissPullRequestReviewInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    message: String,
    @javax.validation.constraints.NotNull
    pullRequestReviewId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (message != null) "message: " + GraphQLRequestSerializer.getEntry(message) else "",
            if (pullRequestReviewId != null) "pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DismissPullRequestReviewInputTO {

    def builder(): DismissPullRequestReviewInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var message: String = _
        private var pullRequestReviewId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setMessage(message: String): Builder = {
            this.message = message
            this
        }

        def setPullRequestReviewId(pullRequestReviewId: String): Builder = {
            this.pullRequestReviewId = pullRequestReviewId
            this
        }

        def build(): DismissPullRequestReviewInputTO = new DismissPullRequestReviewInputTO(clientMutationId, message, pullRequestReviewId)

    }
}
