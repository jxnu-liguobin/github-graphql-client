package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ConvertProjectCardNoteToIssuePayloadTO(
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

object ConvertProjectCardNoteToIssuePayloadTO {

    def builder(): ConvertProjectCardNoteToIssuePayloadTO.Builder = new Builder()

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

        def build(): ConvertProjectCardNoteToIssuePayloadTO = new ConvertProjectCardNoteToIssuePayloadTO(clientMutationId, projectCard)

    }
}
