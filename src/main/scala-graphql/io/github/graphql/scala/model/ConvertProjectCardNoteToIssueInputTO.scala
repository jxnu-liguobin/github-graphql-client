package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class ConvertProjectCardNoteToIssueInputTO(
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    projectCardId: String,
    @javax.validation.constraints.NotNull
    repositoryId: String,
    title: String
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (projectCardId != null) "projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ConvertProjectCardNoteToIssueInputTO]
        Objects.equals(body, that.body) &&
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(projectCardId, that.projectCardId) &&
        Objects.equals(repositoryId, that.repositoryId) &&
        Objects.equals(title, that.title)
    }

    override def hashCode(): Int = {
        Objects.hash(body, clientMutationId, projectCardId, repositoryId, title)
    }
}

object ConvertProjectCardNoteToIssueInputTO {

    def builder(): ConvertProjectCardNoteToIssueInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var projectCardId: String = _
        private var repositoryId: String = _
        private var title: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setProjectCardId(projectCardId: String): Builder = {
            this.projectCardId = projectCardId
            this
        }

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
            this
        }

        def build(): ConvertProjectCardNoteToIssueInputTO = new ConvertProjectCardNoteToIssueInputTO(body, clientMutationId, projectCardId, repositoryId, title)

    }
}
