package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UnmarkIssueAsDuplicatePayloadTO(
    clientMutationId: String,
    duplicate: IssueOrPullRequestTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (duplicate != null) "duplicate: " + GraphQLRequestSerializer.getEntry(duplicate) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UnmarkIssueAsDuplicatePayloadTO {

    def builder(): UnmarkIssueAsDuplicatePayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var duplicate: IssueOrPullRequestTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setDuplicate(duplicate: IssueOrPullRequestTO): Builder = {
            this.duplicate = duplicate
            this
        }

        def build(): UnmarkIssueAsDuplicatePayloadTO = new UnmarkIssueAsDuplicatePayloadTO(clientMutationId, duplicate)

    }
}
