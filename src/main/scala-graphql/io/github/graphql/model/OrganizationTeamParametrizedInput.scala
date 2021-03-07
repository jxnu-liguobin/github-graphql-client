package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field team in type Organization
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class OrganizationTeamParametrizedInput(
    @javax.validation.constraints.NotNull
    slug: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (slug != null) "slug: " + GraphQLRequestSerializer.getEntry(slug) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
