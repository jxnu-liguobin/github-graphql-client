package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnmarkIssueAsDuplicatePayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(duplicate, that.duplicate)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, duplicate)
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
