package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddProjectCardInputTO(
    clientMutationId: String,
    contentId: String,
    note: String,
    @javax.validation.constraints.NotNull
    projectColumnId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (contentId != null) "contentId: " + GraphQLRequestSerializer.getEntry(contentId) else "",
            if (note != null) "note: " + GraphQLRequestSerializer.getEntry(note) else "",
            if (projectColumnId != null) "projectColumnId: " + GraphQLRequestSerializer.getEntry(projectColumnId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddProjectCardInputTO {

    def builder(): AddProjectCardInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var contentId: String = _
        private var note: String = _
        private var projectColumnId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setContentId(contentId: String): Builder = {
            this.contentId = contentId
            this
        }

        def setNote(note: String): Builder = {
            this.note = note
            this
        }

        def setProjectColumnId(projectColumnId: String): Builder = {
            this.projectColumnId = projectColumnId
            this
        }

        def build(): AddProjectCardInputTO = new AddProjectCardInputTO(clientMutationId, contentId, note, projectColumnId)

    }
}
