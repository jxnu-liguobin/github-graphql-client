package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SponsorsListing
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
