package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SponsorsListingTO(
    val fullDescription: String,
    override
    val id: String,
    val shortDescription: String,
    val slug: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("fullDescription: " + GraphQLRequestSerializer.getEntry(fullDescription))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SponsorsListingTO
        return Objects.equals(fullDescription, that.fullDescription)
                && Objects.equals(id, that.id)
                && Objects.equals(shortDescription, that.shortDescription)
                && Objects.equals(slug, that.slug)

    }

    override fun hashCode(): Int = {
        return Objects.hash(fullDescription, id, shortDescription, slug)
    }

    class Builder {

        private lateinit var fullDescription: String
        private lateinit var id: String
        private lateinit var shortDescription: String
        private lateinit var slug: String

        fun setFullDescription(fullDescription: String): Builder {
            this.fullDescription = fullDescription
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setShortDescription(shortDescription: String): Builder {
            this.shortDescription = shortDescription
            return this
        }

        fun setSlug(slug: String): Builder {
            this.slug = slug
            return this
        }

        fun build(): SponsorsListingTO {
            return SponsorsListingTO(fullDescription, id, shortDescription, slug)
        }
    }
}
