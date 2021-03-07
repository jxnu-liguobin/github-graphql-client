package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloseIssuePayloadTO(
    clientMutationId: String,
    issue: IssueTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (issue != null) "issue: " + GraphQLRequestSerializer.getEntry(issue) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CloseIssuePayloadTO {

    def builder(): CloseIssuePayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var issue: IssueTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setIssue(issue: IssueTO): Builder = {
            this.issue = issue
            this
        }

        def build(): CloseIssuePayloadTO = new CloseIssuePayloadTO(clientMutationId, issue)

    }
}
