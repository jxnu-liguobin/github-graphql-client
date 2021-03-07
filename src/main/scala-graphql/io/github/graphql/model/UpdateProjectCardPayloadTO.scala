package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdateProjectCardPayloadTO(
    clientMutationId: String,
    projectCard: ProjectCardTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (projectCard != null) "projectCard: " + GraphQLRequestSerializer.getEntry(projectCard) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateProjectCardPayloadTO {

    def builder(): UpdateProjectCardPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var projectCard: ProjectCardTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setProjectCard(projectCard: ProjectCardTO): Builder = {
            this.projectCard = projectCard
            this
        }

        def build(): UpdateProjectCardPayloadTO = new UpdateProjectCardPayloadTO(clientMutationId, projectCard)

    }
}
