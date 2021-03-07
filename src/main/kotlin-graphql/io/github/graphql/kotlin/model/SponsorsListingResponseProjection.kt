package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SponsorsListing
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SponsorsListingResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SponsorsListingResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SponsorsListingResponseProjection {
        this.fullDescription()
        this.id()
        this.shortDescription()
        this.slug()
        this.typename()
        return this
    }

    fun fullDescription(): SponsorsListingResponseProjection = fullDescription(null)

    fun fullDescription(alias: String?): SponsorsListingResponseProjection {
        fields.add(GraphQLResponseField("fullDescription").alias(alias))
        return this
    }

    fun id(): SponsorsListingResponseProjection = id(null)

    fun id(alias: String?): SponsorsListingResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun shortDescription(): SponsorsListingResponseProjection = shortDescription(null)

    fun shortDescription(alias: String?): SponsorsListingResponseProjection {
        fields.add(GraphQLResponseField("shortDescription").alias(alias))
        return this
    }

    fun slug(): SponsorsListingResponseProjection = slug(null)

    fun slug(alias: String?): SponsorsListingResponseProjection {
        fields.add(GraphQLResponseField("slug").alias(alias))
        return this
    }

    fun typename(): SponsorsListingResponseProjection = typename(null)

    fun typename(alias: String?): SponsorsListingResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SponsorsListingResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
