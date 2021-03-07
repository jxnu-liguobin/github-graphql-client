package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import ProjectCardStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ProjectCardTO(
    column: ProjectColumnTO,
    content: ProjectCardItemTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    creator: ActorTO,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val id: String,
    isArchived: Boolean,
    note: String,
    @javax.validation.constraints.NotNull
    project: ProjectTO,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    state: ProjectCardStateTO,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (column != null) "column: " + GraphQLRequestSerializer.getEntry(column) else "",
            if (content != null) "content: " + GraphQLRequestSerializer.getEntry(content) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (creator != null) "creator: " + GraphQLRequestSerializer.getEntry(creator) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isArchived: " + GraphQLRequestSerializer.getEntry(isArchived),
            if (note != null) "note: " + GraphQLRequestSerializer.getEntry(note) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ProjectCardTO {

    def builder(): ProjectCardTO.Builder = new Builder()

    class Builder {

        private var column: ProjectColumnTO = _
        private var content: ProjectCardItemTO = _
        private var createdAt: String = _
        private var creator: ActorTO = _
        private var databaseId: Option[Int] = _
        private var id: String = _
        private var isArchived: Boolean = _
        private var note: String = _
        private var project: ProjectTO = _
        private var resourcePath: String = _
        private var state: ProjectCardStateTO = _
        private var updatedAt: String = _
        private var url: String = _

        def setColumn(column: ProjectColumnTO): Builder = {
            this.column = column
            this
        }

        def setContent(content: ProjectCardItemTO): Builder = {
            this.content = content
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setCreator(creator: ActorTO): Builder = {
            this.creator = creator
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

        def setIsArchived(isArchived: Boolean): Builder = {
            this.isArchived = isArchived
            this
        }

        def setNote(note: String): Builder = {
            this.note = note
            this
        }

        def setProject(project: ProjectTO): Builder = {
            this.project = project
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setState(state: ProjectCardStateTO): Builder = {
            this.state = state
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

        def build(): ProjectCardTO = new ProjectCardTO(column, content, createdAt, creator, databaseId, id, isArchived, note, project, resourcePath, state, updatedAt, url)

    }
}
