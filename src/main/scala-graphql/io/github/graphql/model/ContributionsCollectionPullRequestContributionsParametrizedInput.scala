package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field pullRequestContributions in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class ContributionsCollectionPullRequestContributionsParametrizedInput(
    after: String,
    before: String,
    excludeFirst: Option[Boolean] = Some(false),
    excludePopular: Option[Boolean] = Some(false),
    first: Option[Int],
    last: Option[Int],
    orderBy: ContributionOrderTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (excludeFirst.isDefined) "excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst.get) else "",
            if (excludePopular.isDefined) "excludePopular: " + GraphQLRequestSerializer.getEntry(excludePopular.get) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
