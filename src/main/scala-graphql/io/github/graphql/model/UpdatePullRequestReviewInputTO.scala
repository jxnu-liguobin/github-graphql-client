package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdatePullRequestReviewInputTO(
    @javax.validation.constraints.NotNull
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    pullRequestReviewId: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestReviewId != null) "pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdatePullRequestReviewInputTO {

    def builder(): UpdatePullRequestReviewInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var pullRequestReviewId: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestReviewId(pullRequestReviewId: String): Builder = {
            this.pullRequestReviewId = pullRequestReviewId
            this
        }

        def build(): UpdatePullRequestReviewInputTO = new UpdatePullRequestReviewInputTO(body, clientMutationId, pullRequestReviewId)

    }
}
