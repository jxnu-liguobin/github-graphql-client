package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReleaseTO(
    author: UserTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    description: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isDraft: Boolean,
    isPrerelease: Boolean,
    name: String,
    publishedAt: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    tag: RefTO,
    @javax.validation.constraints.NotNull
    tagName: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String
) extends UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isDraft: " + GraphQLRequestSerializer.getEntry(isDraft),
            "isPrerelease: " + GraphQLRequestSerializer.getEntry(isPrerelease),
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (publishedAt != null) "publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (tag != null) "tag: " + GraphQLRequestSerializer.getEntry(tag) else "",
            if (tagName != null) "tagName: " + GraphQLRequestSerializer.getEntry(tagName) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReleaseTO {

    def builder(): ReleaseTO.Builder = new Builder()

    class Builder {

        private var author: UserTO = _
        private var createdAt: String = _
        private var description: String = _
        private var id: String = _
        private var isDraft: Boolean = _
        private var isPrerelease: Boolean = _
        private var name: String = _
        private var publishedAt: String = _
        private var resourcePath: String = _
        private var tag: RefTO = _
        private var tagName: String = _
        private var updatedAt: String = _
        private var url: String = _

        def setAuthor(author: UserTO): Builder = {
            this.author = author
            this
        }

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

        def setIsDraft(isDraft: Boolean): Builder = {
            this.isDraft = isDraft
            this
        }

        def setIsPrerelease(isPrerelease: Boolean): Builder = {
            this.isPrerelease = isPrerelease
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setPublishedAt(publishedAt: String): Builder = {
            this.publishedAt = publishedAt
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setTag(tag: RefTO): Builder = {
            this.tag = tag
            this
        }

        def setTagName(tagName: String): Builder = {
            this.tagName = tagName
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

        def build(): ReleaseTO = new ReleaseTO(author, createdAt, description, id, isDraft, isPrerelease, name, publishedAt, resourcePath, tag, tagName, updatedAt, url)

    }
}
