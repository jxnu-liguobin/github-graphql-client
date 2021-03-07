package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateRefInputTO(
    clientMutationId: String,
    force: Option[Boolean] = Some(false),
    @javax.validation.constraints.NotNull
    oid: String,
    @javax.validation.constraints.NotNull
    refId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (force.isDefined) "force: " + GraphQLRequestSerializer.getEntry(force.get) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else "",
            if (refId != null) "refId: " + GraphQLRequestSerializer.getEntry(refId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateRefInputTO {

    def builder(): UpdateRefInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var force: Option[Boolean] = Some(false)
        private var oid: String = _
        private var refId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setForce(force: Option[Boolean]): Builder = {
            this.force = force
            this
        }

        def setOid(oid: String): Builder = {
            this.oid = oid
            this
        }

        def setRefId(refId: String): Builder = {
            this.refId = refId
            this
        }

        def build(): UpdateRefInputTO = new UpdateRefInputTO(clientMutationId, force, oid, refId)

    }
}
