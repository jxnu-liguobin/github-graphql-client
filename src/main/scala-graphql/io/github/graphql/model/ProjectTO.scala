package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import ProjectStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ProjectTO(
    body: String,
    @javax.validation.constraints.NotNull
    bodyHTML: String,
    override val closed: Boolean,
    override val closedAt: String,
    @javax.validation.constraints.NotNull
    createdAt: String,
    creator: ActorTO,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    number: Int,
    @javax.validation.constraints.NotNull
    owner: ProjectOwnerTO,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    @javax.validation.constraints.NotNull
    state: ProjectStateTO,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String,
    override val viewerCanUpdate: Boolean
) extends ClosableTO with NodeTO with UpdatableTO {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (bodyHTML != null) "bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML) else "",
            "closed: " + GraphQLRequestSerializer.getEntry(closed),
            if (closedAt != null) "closedAt: " + GraphQLRequestSerializer.getEntry(closedAt) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (creator != null) "creator: " + GraphQLRequestSerializer.getEntry(creator) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            "number: " + GraphQLRequestSerializer.getEntry(number),
            if (owner != null) "owner: " + GraphQLRequestSerializer.getEntry(owner) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ProjectTO {

    def builder(): ProjectTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var bodyHTML: String = _
        private var closed: Boolean = _
        private var closedAt: String = _
        private var createdAt: String = _
        private var creator: ActorTO = _
        private var databaseId: Option[Int] = _
        private var id: String = _
        private var name: String = _
        private var number: Int = _
        private var owner: ProjectOwnerTO = _
        private var resourcePath: String = _
        private var state: ProjectStateTO = _
        private var updatedAt: String = _
        private var url: String = _
        private var viewerCanUpdate: Boolean = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setBodyHTML(bodyHTML: String): Builder = {
            this.bodyHTML = bodyHTML
            this
        }

        def setClosed(closed: Boolean): Builder = {
            this.closed = closed
            this
        }

        def setClosedAt(closedAt: String): Builder = {
            this.closedAt = closedAt
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

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setNumber(number: Int): Builder = {
            this.number = number
            this
        }

        def setOwner(owner: ProjectOwnerTO): Builder = {
            this.owner = owner
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setState(state: ProjectStateTO): Builder = {
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

        def setViewerCanUpdate(viewerCanUpdate: Boolean): Builder = {
            this.viewerCanUpdate = viewerCanUpdate
            this
        }

        def build(): ProjectTO = new ProjectTO(body, bodyHTML, closed, closedAt, createdAt, creator, databaseId, id, name, number, owner, resourcePath, state, updatedAt, url, viewerCanUpdate)

    }
}
