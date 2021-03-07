package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class MarketplaceCategoryTO(
    description: String,
    howItWorks: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    primaryListingCount: Int,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    secondaryListingCount: Int,
    @javax.validation.constraints.NotNull
    slug: String,
    @javax.validation.constraints.NotNull
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (howItWorks != null) "howItWorks: " + GraphQLRequestSerializer.getEntry(howItWorks) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            "primaryListingCount: " + GraphQLRequestSerializer.getEntry(primaryListingCount),
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            "secondaryListingCount: " + GraphQLRequestSerializer.getEntry(secondaryListingCount),
            if (slug != null) "slug: " + GraphQLRequestSerializer.getEntry(slug) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MarketplaceCategoryTO {

    def builder(): MarketplaceCategoryTO.Builder = new Builder()

    class Builder {

        private var description: String = _
        private var howItWorks: String = _
        private var id: String = _
        private var name: String = _
        private var primaryListingCount: Int = _
        private var resourcePath: String = _
        private var secondaryListingCount: Int = _
        private var slug: String = _
        private var url: String = _

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setHowItWorks(howItWorks: String): Builder = {
            this.howItWorks = howItWorks
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

        def setPrimaryListingCount(primaryListingCount: Int): Builder = {
            this.primaryListingCount = primaryListingCount
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setSecondaryListingCount(secondaryListingCount: Int): Builder = {
            this.secondaryListingCount = secondaryListingCount
            this
        }

        def setSlug(slug: String): Builder = {
            this.slug = slug
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): MarketplaceCategoryTO = new MarketplaceCategoryTO(description, howItWorks, id, name, primaryListingCount, resourcePath, secondaryListingCount, slug, url)

    }
}
