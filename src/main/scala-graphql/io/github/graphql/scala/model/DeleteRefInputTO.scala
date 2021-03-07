package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DeleteRefInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    refId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (refId != null) "refId: " + GraphQLRequestSerializer.getEntry(refId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeleteRefInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(refId, that.refId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, refId)
    }
}

object DeleteRefInputTO {

    def builder(): DeleteRefInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var refId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setRefId(refId: String): Builder = {
            this.refId = refId
            this
        }

        def build(): DeleteRefInputTO = new DeleteRefInputTO(clientMutationId, refId)

    }
}
