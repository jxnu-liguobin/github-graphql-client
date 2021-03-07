package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class LabelTO(
    @javax.validation.constraints.NotNull
    color: String,
    createdAt: String,
    description: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isDefault: Boolean,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (color != null) "color: " + GraphQLRequestSerializer.getEntry(color) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isDefault: " + GraphQLRequestSerializer.getEntry(isDefault),
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object LabelTO {

    def builder(): LabelTO.Builder = new Builder()

    class Builder {

        private var color: String = _
        private var createdAt: String = _
        private var description: String = _
        private var id: String = _
        private var isDefault: Boolean = _
        private var name: String = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var updatedAt: String = _
        private var url: String = _

        def setColor(color: String): Builder = {
            this.color = color
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

        def setIsDefault(isDefault: Boolean): Builder = {
            this.isDefault = isDefault
            this
        }

        def setName(name: String): Builder = {
            this.name = name
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

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): LabelTO = new LabelTO(color, createdAt, description, id, isDefault, name, repository, resourcePath, updatedAt, url)

    }
}
