package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class AppTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    databaseId: Option[Int],
    description: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    logoBackgroundColor: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    slug: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String
) extends SearchResultItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (logoBackgroundColor != null) "logoBackgroundColor: " + GraphQLRequestSerializer.getEntry(logoBackgroundColor) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (slug != null) "slug: " + GraphQLRequestSerializer.getEntry(slug) else "",
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
        val that = obj.asInstanceOf[AppTO]
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(logoBackgroundColor, that.logoBackgroundColor) &&
        Objects.equals(name, that.name) &&
        Objects.equals(slug, that.slug) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(createdAt, databaseId, description, id, logoBackgroundColor, name, slug, updatedAt, url)
    }
}

object AppTO {

    def builder(): AppTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var description: String = _
        private var id: String = _
        private var logoBackgroundColor: String = _
        private var name: String = _
        private var slug: String = _
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

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setLogoBackgroundColor(logoBackgroundColor: String): Builder = {
            this.logoBackgroundColor = logoBackgroundColor
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setSlug(slug: String): Builder = {
            this.slug = slug
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

        def build(): AppTO = new AppTO(createdAt, databaseId, description, id, logoBackgroundColor, name, slug, updatedAt, url)

    }
}
