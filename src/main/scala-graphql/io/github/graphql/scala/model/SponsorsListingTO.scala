package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SponsorsListingTO(
    @javax.validation.constraints.NotNull
    fullDescription: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    shortDescription: String,
    @javax.validation.constraints.NotNull
    slug: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (fullDescription != null) "fullDescription: " + GraphQLRequestSerializer.getEntry(fullDescription) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (shortDescription != null) "shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription) else "",
            if (slug != null) "slug: " + GraphQLRequestSerializer.getEntry(slug) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SponsorsListingTO]
        Objects.equals(fullDescription, that.fullDescription) &&
        Objects.equals(id, that.id) &&
        Objects.equals(shortDescription, that.shortDescription) &&
        Objects.equals(slug, that.slug)
    }

    override def hashCode(): Int = {
        Objects.hash(fullDescription, id, shortDescription, slug)
    }
}

object SponsorsListingTO {

    def builder(): SponsorsListingTO.Builder = new Builder()

    class Builder {

        private var fullDescription: String = _
        private var id: String = _
        private var shortDescription: String = _
        private var slug: String = _

        def setFullDescription(fullDescription: String): Builder = {
            this.fullDescription = fullDescription
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setShortDescription(shortDescription: String): Builder = {
            this.shortDescription = shortDescription
            this
        }

        def setSlug(slug: String): Builder = {
            this.slug = slug
            this
        }

        def build(): SponsorsListingTO = new SponsorsListingTO(fullDescription, id, shortDescription, slug)

    }
}
