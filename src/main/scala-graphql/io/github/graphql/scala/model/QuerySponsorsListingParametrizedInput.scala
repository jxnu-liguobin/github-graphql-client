package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field sponsorsListing in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QuerySponsorsListingParametrizedInput(
    @javax.validation.constraints.NotNull
    slug: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (slug != null) "slug: " + GraphQLRequestSerializer.getEntry(slug) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
