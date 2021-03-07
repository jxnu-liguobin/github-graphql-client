package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MarketplaceCategory
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class MarketplaceCategoryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MarketplaceCategoryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MarketplaceCategoryResponseProjection {
        this.description()
        this.howItWorks()
        this.id()
        this.name()
        this.primaryListingCount()
        this.resourcePath()
        this.secondaryListingCount()
        this.slug()
        this.url()
        this.typename()
        return this
    }

    fun description(): MarketplaceCategoryResponseProjection = description(null)

    fun description(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun howItWorks(): MarketplaceCategoryResponseProjection = howItWorks(null)

    fun howItWorks(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("howItWorks").alias(alias))
        return this
    }

    fun id(): MarketplaceCategoryResponseProjection = id(null)

    fun id(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): MarketplaceCategoryResponseProjection = name(null)

    fun name(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun primaryListingCount(): MarketplaceCategoryResponseProjection = primaryListingCount(null)

    fun primaryListingCount(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("primaryListingCount").alias(alias))
        return this
    }

    fun resourcePath(): MarketplaceCategoryResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun secondaryListingCount(): MarketplaceCategoryResponseProjection = secondaryListingCount(null)

    fun secondaryListingCount(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("secondaryListingCount").alias(alias))
        return this
    }

    fun slug(): MarketplaceCategoryResponseProjection = slug(null)

    fun slug(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("slug").alias(alias))
        return this
    }

    fun url(): MarketplaceCategoryResponseProjection = url(null)

    fun url(alias: String?): MarketplaceCategoryResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): MarketplaceCategoryResponseProjection = typename(null)

    fun typename(alias: String?): MarketplaceCategoryResponseProjection {
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
        val that = other as MarketplaceCategoryResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
