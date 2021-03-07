package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GistTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    description: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isFork: Boolean,
    isPublic: Boolean,
    @javax.validation.constraints.NotNull
    name: String,
    owner: RepositoryOwnerTO,
    pushedAt: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    override val viewerHasStarred: Boolean
) extends PinnableItemTO with StarrableTO with UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isFork: " + GraphQLRequestSerializer.getEntry(isFork),
            "isPublic: " + GraphQLRequestSerializer.getEntry(isPublic),
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (owner != null) "owner: " + GraphQLRequestSerializer.getEntry(owner) else "",
            if (pushedAt != null) "pushedAt: " + GraphQLRequestSerializer.getEntry(pushedAt) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[GistTO]
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(isFork, that.isFork) &&
        Objects.equals(isPublic, that.isPublic) &&
        Objects.equals(name, that.name) &&
        Objects.equals(owner, that.owner) &&
        Objects.equals(pushedAt, that.pushedAt) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url) &&
        Objects.equals(viewerHasStarred, that.viewerHasStarred)
    }

    override def hashCode(): Int = {
        Objects.hash(createdAt, description, id, isFork, isPublic, name, owner, pushedAt, resourcePath, updatedAt, url, viewerHasStarred)
    }
}

object GistTO {

    def builder(): GistTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var description: String = _
        private var id: String = _
        private var isFork: Boolean = _
        private var isPublic: Boolean = _
        private var name: String = _
        private var owner: RepositoryOwnerTO = _
        private var pushedAt: String = _
        private var resourcePath: String = _
        private var updatedAt: String = _
        private var url: String = _
        private var viewerHasStarred: Boolean = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIsFork(isFork: Boolean): Builder = {
            this.isFork = isFork
            this
        }

        def setIsPublic(isPublic: Boolean): Builder = {
            this.isPublic = isPublic
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setOwner(owner: RepositoryOwnerTO): Builder = {
            this.owner = owner
            this
        }

        def setPushedAt(pushedAt: String): Builder = {
            this.pushedAt = pushedAt
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

        def setViewerHasStarred(viewerHasStarred: Boolean): Builder = {
            this.viewerHasStarred = viewerHasStarred
            this
        }

        def build(): GistTO = new GistTO(createdAt, description, id, isFork, isPublic, name, owner, pushedAt, resourcePath, updatedAt, url, viewerHasStarred)

    }
}
