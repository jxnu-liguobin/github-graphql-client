package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateIssueCommentPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(issueComment, that.issueComment)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, issueComment)
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
