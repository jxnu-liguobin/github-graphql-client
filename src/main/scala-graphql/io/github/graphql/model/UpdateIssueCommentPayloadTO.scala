package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateIssueCommentPayloadTO(
    clientMutationId: String,
    issueComment: IssueCommentTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (issueComment != null) "issueComment: " + GraphQLRequestSerializer.getEntry(issueComment) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateIssueCommentPayloadTO {

    def builder(): UpdateIssueCommentPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var issueComment: IssueCommentTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setIssueComment(issueComment: IssueCommentTO): Builder = {
            this.issueComment = issueComment
            this
        }

        def build(): UpdateIssueCommentPayloadTO = new UpdateIssueCommentPayloadTO(clientMutationId, issueComment)

    }
}
