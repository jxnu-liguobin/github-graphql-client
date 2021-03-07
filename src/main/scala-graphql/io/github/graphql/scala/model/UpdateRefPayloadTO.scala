package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UpdateRefPayloadTO(
    clientMutationId: String,
    ref: RefTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (ref != null) "ref: " + GraphQLRequestSerializer.getEntry(ref) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateRefPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(ref, that.ref)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, ref)
    }
}

object UpdateRefPayloadTO {

    def builder(): UpdateRefPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var ref: RefTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setRef(ref: RefTO): Builder = {
            this.ref = ref
            this
        }

        def build(): UpdateRefPayloadTO = new UpdateRefPayloadTO(clientMutationId, ref)

    }
}
