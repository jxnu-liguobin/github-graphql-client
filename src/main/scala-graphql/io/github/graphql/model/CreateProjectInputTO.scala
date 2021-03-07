package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import ProjectTemplateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateProjectInputTO(
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    ownerId: String,
    @javax.validation.constraints.NotNull
    repositoryIds: Seq[String],
    template: ProjectTemplateTO
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (ownerId != null) "ownerId: " + GraphQLRequestSerializer.getEntry(ownerId) else "",
            if (repositoryIds != null) "repositoryIds: " + GraphQLRequestSerializer.getEntry(repositoryIds.asJava) else "",
            if (template != null) "template: " + GraphQLRequestSerializer.getEntry(template) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreateProjectInputTO {

    def builder(): CreateProjectInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var name: String = _
        private var ownerId: String = _
        private var repositoryIds: Seq[String] = _
        private var template: ProjectTemplateTO = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setOwnerId(ownerId: String): Builder = {
            this.ownerId = ownerId
            this
        }

        def setRepositoryIds(repositoryIds: Seq[String]): Builder = {
            this.repositoryIds = repositoryIds
            this
        }

        def setTemplate(template: ProjectTemplateTO): Builder = {
            this.template = template
            this
        }

        def build(): CreateProjectInputTO = new CreateProjectInputTO(body, clientMutationId, name, ownerId, repositoryIds, template)

    }
}
