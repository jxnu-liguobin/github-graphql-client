package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
