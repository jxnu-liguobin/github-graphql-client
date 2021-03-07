package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MarketplaceCategory
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MarketplaceCategoryResponseProjection extends GraphQLResponseProjection {

    override def all$(): MarketplaceCategoryResponseProjection = all$(3)

    override def all$(maxDepth: Int): MarketplaceCategoryResponseProjection = {
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
        this
    }

    def description(): MarketplaceCategoryResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def howItWorks(): MarketplaceCategoryResponseProjection = {
        howItWorks(null.asInstanceOf[String])
    }

    def howItWorks(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("howItWorks").alias(alias))
        this
    }

    def id(): MarketplaceCategoryResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): MarketplaceCategoryResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def primaryListingCount(): MarketplaceCategoryResponseProjection = {
        primaryListingCount(null.asInstanceOf[String])
    }

    def primaryListingCount(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("primaryListingCount").alias(alias))
        this
    }

    def resourcePath(): MarketplaceCategoryResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def secondaryListingCount(): MarketplaceCategoryResponseProjection = {
        secondaryListingCount(null.asInstanceOf[String])
    }

    def secondaryListingCount(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("secondaryListingCount").alias(alias))
        this
    }

    def slug(): MarketplaceCategoryResponseProjection = {
        slug(null.asInstanceOf[String])
    }

    def slug(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("slug").alias(alias))
        this
    }

    def url(): MarketplaceCategoryResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): MarketplaceCategoryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MarketplaceCategoryResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MarketplaceCategoryResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
