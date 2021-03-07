package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnmarkIssueAsDuplicateInputTO(
    @javax.validation.constraints.NotNull
    canonicalId: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    duplicateId: String
) {

    override def toString(): String = {
        Seq(
            if (canonicalId != null) "canonicalId: " + GraphQLRequestSerializer.getEntry(canonicalId) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (duplicateId != null) "duplicateId: " + GraphQLRequestSerializer.getEntry(duplicateId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnmarkIssueAsDuplicateInputTO]
        Objects.equals(canonicalId, that.canonicalId) &&
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(duplicateId, that.duplicateId)
    }

    override def hashCode(): Int = {
        Objects.hash(canonicalId, clientMutationId, duplicateId)
    }
}

object UnmarkIssueAsDuplicateInputTO {

    def builder(): UnmarkIssueAsDuplicateInputTO.Builder = new Builder()

    class Builder {

        private var canonicalId: String = _
        private var clientMutationId: String = _
        private var duplicateId: String = _

        def setCanonicalId(canonicalId: String): Builder = {
            this.canonicalId = canonicalId
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setDuplicateId(duplicateId: String): Builder = {
            this.duplicateId = duplicateId
            this
        }

        def build(): UnmarkIssueAsDuplicateInputTO = new UnmarkIssueAsDuplicateInputTO(canonicalId, clientMutationId, duplicateId)

    }
}
