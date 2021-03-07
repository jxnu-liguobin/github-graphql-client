package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnpinIssueInputTO(
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnpinIssueInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(issueId, that.issueId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, issueId)
    }
}

object UnpinIssueInputTO {

    def builder(): UnpinIssueInputTO.Builder = new Builder()

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

        def build(): UnpinIssueInputTO = new UnpinIssueInputTO(clientMutationId, issueId)

    }
}
