package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class ReopenPullRequestInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    pullRequestId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestId != null) "pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReopenPullRequestInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequestId, that.pullRequestId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, pullRequestId)
    }
}

object ReopenPullRequestInputTO {

    def builder(): ReopenPullRequestInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequestId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestId(pullRequestId: String): Builder = {
            this.pullRequestId = pullRequestId
            this
        }

        def build(): ReopenPullRequestInputTO = new ReopenPullRequestInputTO(clientMutationId, pullRequestId)

    }
}
