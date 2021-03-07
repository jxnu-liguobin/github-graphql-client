package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReopenIssueInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    issueId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (issueId != null) "issueId: " + GraphQLRequestSerializer.getEntry(issueId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReopenIssueInputTO {

    def builder(): ReopenIssueInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var issueId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setIssueId(issueId: String): Builder = {
            this.issueId = issueId
            this
        }

        def build(): ReopenIssueInputTO = new ReopenIssueInputTO(clientMutationId, issueId)

    }
}
