package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MarketplaceCategoryTO(
    val description: String?,
    val howItWorks: String?,
    override
    val id: String,
    val name: String,
    val primaryListingCount: Int,
    val resourcePath: String,
    val secondaryListingCount: Int,
    val slug: String,
    val url: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (howItWorks != null) {
            joiner.add("howItWorks: " + GraphQLRequestSerializer.getEntry(howItWorks))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("primaryListingCount: " + GraphQLRequestSerializer.getEntry(primaryListingCount))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("secondaryListingCount: " + GraphQLRequestSerializer.getEntry(secondaryListingCount))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as MarketplaceCategoryTO
        return Objects.equals(description, that.description)
                && Objects.equals(howItWorks, that.howItWorks)
                && Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(primaryListingCount, that.primaryListingCount)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(secondaryListingCount, that.secondaryListingCount)
                && Objects.equals(slug, that.slug)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(description, howItWorks, id, name, primaryListingCount, resourcePath, secondaryListingCount, slug, url)
    }

    class Builder {

        private var description: String? = null
        private var howItWorks: String? = null
        private lateinit var id: String
        private lateinit var name: String
        private var primaryListingCount: Int = 0
        private lateinit var resourcePath: String
        private var secondaryListingCount: Int = 0
        private lateinit var slug: String
        private lateinit var url: String

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setHowItWorks(howItWorks: String?): Builder {
            this.howItWorks = howItWorks
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setPrimaryListingCount(primaryListingCount: Int): Builder {
            this.primaryListingCount = primaryListingCount
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setSecondaryListingCount(secondaryListingCount: Int): Builder {
            this.secondaryListingCount = secondaryListingCount
            return this
        }

        fun setSlug(slug: String): Builder {
            this.slug = slug
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): MarketplaceCategoryTO {
            return MarketplaceCategoryTO(description, howItWorks, id, name, primaryListingCount, resourcePath, secondaryListingCount, slug, url)
        }
    }
}
