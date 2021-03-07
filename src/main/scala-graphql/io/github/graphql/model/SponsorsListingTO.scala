package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
