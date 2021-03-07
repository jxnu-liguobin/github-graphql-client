package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateProjectCardInputTO(
    clientMutationId: String,
    isArchived: Option[Boolean],
    note: String,
    @javax.validation.constraints.NotNull
    projectCardId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (isArchived.isDefined) "isArchived: " + GraphQLRequestSerializer.getEntry(isArchived.get) else "",
            if (note != null) "note: " + GraphQLRequestSerializer.getEntry(note) else "",
            if (projectCardId != null) "projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateProjectCardInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(isArchived, that.isArchived) &&
        Objects.equals(note, that.note) &&
        Objects.equals(projectCardId, that.projectCardId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, isArchived, note, projectCardId)
    }
}

object UpdateProjectCardInputTO {

    def builder(): UpdateProjectCardInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var isArchived: Option[Boolean] = _
        private var note: String = _
        private var projectCardId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setIsArchived(isArchived: Option[Boolean]): Builder = {
            this.isArchived = isArchived
            this
        }

        def setNote(note: String): Builder = {
            this.note = note
            this
        }

        def setProjectCardId(projectCardId: String): Builder = {
            this.projectCardId = projectCardId
            this
        }

        def build(): UpdateProjectCardInputTO = new UpdateProjectCardInputTO(clientMutationId, isArchived, note, projectCardId)

    }
}
