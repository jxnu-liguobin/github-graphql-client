package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MergePullRequestInputTO(
    clientMutationId: String,
    commitBody: String,
    commitHeadline: String,
    expectedHeadOid: String,
    @javax.validation.constraints.NotNull
    pullRequestId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (commitBody != null) "commitBody: " + GraphQLRequestSerializer.getEntry(commitBody) else "",
            if (commitHeadline != null) "commitHeadline: " + GraphQLRequestSerializer.getEntry(commitHeadline) else "",
            if (expectedHeadOid != null) "expectedHeadOid: " + GraphQLRequestSerializer.getEntry(expectedHeadOid) else "",
            if (pullRequestId != null) "pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MergePullRequestInputTO {

    def builder(): MergePullRequestInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var commitBody: String = _
        private var commitHeadline: String = _
        private var expectedHeadOid: String = _
        private var pullRequestId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setCommitBody(commitBody: String): Builder = {
            this.commitBody = commitBody
            this
        }

        def setCommitHeadline(commitHeadline: String): Builder = {
            this.commitHeadline = commitHeadline
            this
        }

        def setExpectedHeadOid(expectedHeadOid: String): Builder = {
            this.expectedHeadOid = expectedHeadOid
            this
        }

        def setPullRequestId(pullRequestId: String): Builder = {
            this.pullRequestId = pullRequestId
            this
        }

        def build(): MergePullRequestInputTO = new MergePullRequestInputTO(clientMutationId, commitBody, commitHeadline, expectedHeadOid, pullRequestId)

    }
}
