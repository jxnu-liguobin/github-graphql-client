package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import ProjectStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectInputTO(
    body: String,
    clientMutationId: String,
    name: String,
    @javax.validation.constraints.NotNull
    projectId: String,
    public: Option[Boolean],
    state: ProjectStateTO
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (projectId != null) "projectId: " + GraphQLRequestSerializer.getEntry(projectId) else "",
            if (public.isDefined) "public: " + GraphQLRequestSerializer.getEntry(public.get) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateProjectInputTO {

    def builder(): UpdateProjectInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var name: String = _
        private var projectId: String = _
        private var public: Option[Boolean] = _
        private var state: ProjectStateTO = _

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

        def setProjectId(projectId: String): Builder = {
            this.projectId = projectId
            this
        }

        def setPublic(public: Option[Boolean]): Builder = {
            this.public = public
            this
        }

        def setState(state: ProjectStateTO): Builder = {
            this.state = state
            this
        }

        def build(): UpdateProjectInputTO = new UpdateProjectInputTO(body, clientMutationId, name, projectId, public, state)

    }
}
