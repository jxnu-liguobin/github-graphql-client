package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DismissPullRequestReviewInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(message, that.message) &&
        Objects.equals(pullRequestReviewId, that.pullRequestReviewId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, message, pullRequestReviewId)
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
