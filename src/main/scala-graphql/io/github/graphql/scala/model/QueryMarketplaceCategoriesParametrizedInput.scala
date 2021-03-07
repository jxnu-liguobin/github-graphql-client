package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field marketplaceCategories in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QueryMarketplaceCategoriesParametrizedInput(
    excludeEmpty: Option[Boolean],
    excludeSubcategories: Option[Boolean],
    @javax.validation.constraints.NotNull
    includeCategories: Seq[String]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (excludeEmpty.isDefined) "excludeEmpty: " + GraphQLRequestSerializer.getEntry(excludeEmpty.get) else "",
            if (excludeSubcategories.isDefined) "excludeSubcategories: " + GraphQLRequestSerializer.getEntry(excludeSubcategories.get) else "",
            if (includeCategories != null) "includeCategories: " + GraphQLRequestSerializer.getEntry(includeCategories.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
