package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeletePullRequestReviewInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    pullRequestReviewId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestReviewId != null) "pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeletePullRequestReviewInputTO {

    def builder(): DeletePullRequestReviewInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequestReviewId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestReviewId(pullRequestReviewId: String): Builder = {
            this.pullRequestReviewId = pullRequestReviewId
            this
        }

        def build(): DeletePullRequestReviewInputTO = new DeletePullRequestReviewInputTO(clientMutationId, pullRequestReviewId)

    }
}
