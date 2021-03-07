package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveOutsideCollaboratorInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    organizationId: String,
    @javax.validation.constraints.NotNull
    userId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (organizationId != null) "organizationId: " + GraphQLRequestSerializer.getEntry(organizationId) else "",
            if (userId != null) "userId: " + GraphQLRequestSerializer.getEntry(userId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RemoveOutsideCollaboratorInputTO {

    def builder(): RemoveOutsideCollaboratorInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var organizationId: String = _
        private var userId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setOrganizationId(organizationId: String): Builder = {
            this.organizationId = organizationId
            this
        }

        def setUserId(userId: String): Builder = {
            this.userId = userId
            this
        }

        def build(): RemoveOutsideCollaboratorInputTO = new RemoveOutsideCollaboratorInputTO(clientMutationId, organizationId, userId)

    }
}
