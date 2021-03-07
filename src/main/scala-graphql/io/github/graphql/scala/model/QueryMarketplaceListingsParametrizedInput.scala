package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field marketplaceListings in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QueryMarketplaceListingsParametrizedInput(
    adminId: String,
    after: String,
    allStates: Option[Boolean],
    before: String,
    categorySlug: String,
    first: Option[Int],
    last: Option[Int],
    organizationId: String,
    primaryCategoryOnly: Option[Boolean] = Some(false),
    slugs: Seq[String],
    useTopicAliases: Option[Boolean],
    viewerCanAdmin: Option[Boolean],
    withFreeTrialsOnly: Option[Boolean] = Some(false)
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (adminId != null) "adminId: " + GraphQLRequestSerializer.getEntry(adminId) else "",
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (allStates.isDefined) "allStates: " + GraphQLRequestSerializer.getEntry(allStates.get) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (categorySlug != null) "categorySlug: " + GraphQLRequestSerializer.getEntry(categorySlug) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (organizationId != null) "organizationId: " + GraphQLRequestSerializer.getEntry(organizationId) else "",
            if (primaryCategoryOnly.isDefined) "primaryCategoryOnly: " + GraphQLRequestSerializer.getEntry(primaryCategoryOnly.get) else "",
            if (slugs != null) "slugs: " + GraphQLRequestSerializer.getEntry(slugs.asJava) else "",
            if (useTopicAliases.isDefined) "useTopicAliases: " + GraphQLRequestSerializer.getEntry(useTopicAliases.get) else "",
            if (viewerCanAdmin.isDefined) "viewerCanAdmin: " + GraphQLRequestSerializer.getEntry(viewerCanAdmin.get) else "",
            if (withFreeTrialsOnly.isDefined) "withFreeTrialsOnly: " + GraphQLRequestSerializer.getEntry(withFreeTrialsOnly.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
