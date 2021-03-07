package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import ProjectColumnPurposeTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ProjectColumnTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    project: ProjectTO,
    purpose: ProjectColumnPurposeTO,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else "",
            if (purpose != null) "purpose: " + GraphQLRequestSerializer.getEntry(purpose) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ProjectColumnTO {

    def builder(): ProjectColumnTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var id: String = _
        private var name: String = _
        private var project: ProjectTO = _
        private var purpose: ProjectColumnPurposeTO = _
        private var resourcePath: String = _
        private var updatedAt: String = _
        private var url: String = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setProject(project: ProjectTO): Builder = {
            this.project = project
            this
        }

        def setPurpose(purpose: ProjectColumnPurposeTO): Builder = {
            this.purpose = purpose
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): ProjectColumnTO = new ProjectColumnTO(createdAt, databaseId, id, name, project, purpose, resourcePath, updatedAt, url)

    }
}
