package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteProjectPayloadTO(
    clientMutationId: String,
    owner: ProjectOwnerTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (owner != null) "owner: " + GraphQLRequestSerializer.getEntry(owner) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeleteProjectPayloadTO {

    def builder(): DeleteProjectPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var owner: ProjectOwnerTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setOwner(owner: ProjectOwnerTO): Builder = {
            this.owner = owner
            this
        }

        def build(): DeleteProjectPayloadTO = new DeleteProjectPayloadTO(clientMutationId, owner)

    }
}
