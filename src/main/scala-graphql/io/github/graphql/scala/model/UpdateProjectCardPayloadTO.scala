package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateProjectCardPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(projectCard, that.projectCard)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, projectCard)
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
