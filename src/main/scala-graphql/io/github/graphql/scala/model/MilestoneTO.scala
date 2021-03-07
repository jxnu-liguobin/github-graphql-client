package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import MilestoneStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MilestoneTO(
    override val closed: Boolean,
    override val closedAt: String,
    @javax.validation.constraints.NotNull
    createdAt: String,
    creator: ActorTO,
    description: String,
    dueOn: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    issuePrioritiesDebug: String,
    number: Int,
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    state: MilestoneStateTO,
    @javax.validation.constraints.NotNull
    title: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String
) extends UniformResourceLocatableTO with ClosableTO with NodeTO {

    override def toString(): String = {
        Seq(
            "closed: " + GraphQLRequestSerializer.getEntry(closed),
            if (closedAt != null) "closedAt: " + GraphQLRequestSerializer.getEntry(closedAt) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (creator != null) "creator: " + GraphQLRequestSerializer.getEntry(creator) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (dueOn != null) "dueOn: " + GraphQLRequestSerializer.getEntry(dueOn) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (issuePrioritiesDebug != null) "issuePrioritiesDebug: " + GraphQLRequestSerializer.getEntry(issuePrioritiesDebug) else "",
            "number: " + GraphQLRequestSerializer.getEntry(number),
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (title != null) "title: " + GraphQLRequestSerializer.getEntry(title) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MilestoneTO]
        Objects.equals(closed, that.closed) &&
        Objects.equals(closedAt, that.closedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(creator, that.creator) &&
        Objects.equals(description, that.description) &&
        Objects.equals(dueOn, that.dueOn) &&
        Objects.equals(id, that.id) &&
        Objects.equals(issuePrioritiesDebug, that.issuePrioritiesDebug) &&
        Objects.equals(number, that.number) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(state, that.state) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(closed, closedAt, createdAt, creator, description, dueOn, id, issuePrioritiesDebug, number, repository, resourcePath, state, title, updatedAt, url)
    }
}

object MilestoneTO {

    def builder(): MilestoneTO.Builder = new Builder()

    class Builder {

        private var closed: Boolean = _
        private var closedAt: String = _
        private var createdAt: String = _
        private var creator: ActorTO = _
        private var description: String = _
        private var dueOn: String = _
        private var id: String = _
        private var issuePrioritiesDebug: String = _
        private var number: Int = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var state: MilestoneStateTO = _
        private var title: String = _
        private var updatedAt: String = _
        private var url: String = _

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

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setDueOn(dueOn: String): Builder = {
            this.dueOn = dueOn
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIssuePrioritiesDebug(issuePrioritiesDebug: String): Builder = {
            this.issuePrioritiesDebug = issuePrioritiesDebug
            this
        }

        def setNumber(number: Int): Builder = {
            this.number = number
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setState(state: MilestoneStateTO): Builder = {
            this.state = state
            this
        }

        def setTitle(title: String): Builder = {
            this.title = title
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

        def build(): MilestoneTO = new MilestoneTO(closed, closedAt, createdAt, creator, description, dueOn, id, issuePrioritiesDebug, number, repository, resourcePath, state, title, updatedAt, url)

    }
}
