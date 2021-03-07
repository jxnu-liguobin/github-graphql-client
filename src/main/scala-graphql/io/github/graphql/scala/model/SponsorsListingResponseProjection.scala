package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SponsorsListing
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SponsorsListingResponseProjection extends GraphQLResponseProjection {

    override def all$(): SponsorsListingResponseProjection = all$(3)

    override def all$(maxDepth: Int): SponsorsListingResponseProjection = {
        this.fullDescription()
        this.id()
        this.shortDescription()
        this.slug()
        this.typename()
        this
    }

    def fullDescription(): SponsorsListingResponseProjection = {
        fullDescription(null.asInstanceOf[String])
    }

    def fullDescription(alias: String): SponsorsListingResponseProjection = {
        fields.add(new GraphQLResponseField("fullDescription").alias(alias))
        this
    }

    def id(): SponsorsListingResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): SponsorsListingResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def shortDescription(): SponsorsListingResponseProjection = {
        shortDescription(null.asInstanceOf[String])
    }

    def shortDescription(alias: String): SponsorsListingResponseProjection = {
        fields.add(new GraphQLResponseField("shortDescription").alias(alias))
        this
    }

    def slug(): SponsorsListingResponseProjection = {
        slug(null.asInstanceOf[String])
    }

    def slug(alias: String): SponsorsListingResponseProjection = {
        fields.add(new GraphQLResponseField("slug").alias(alias))
        this
    }

    def typename(): SponsorsListingResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SponsorsListingResponseProjection = {
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
        val that = obj.asInstanceOf[SponsorsListingResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
