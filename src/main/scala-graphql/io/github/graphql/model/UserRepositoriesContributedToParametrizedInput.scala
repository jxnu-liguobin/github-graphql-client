package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import RepositoryContributionTypeTO._
import RepositoryPrivacyTO._

/**
 * Parametrized input for field repositoriesContributedTo in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserRepositoriesContributedToParametrizedInput(
    after: String,
    before: String,
    contributionTypes: Seq[RepositoryContributionTypeTO],
    first: Option[Int],
    includeUserRepositories: Option[Boolean],
    isLocked: Option[Boolean],
    last: Option[Int],
    orderBy: RepositoryOrderTO,
    privacy: RepositoryPrivacyTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (contributionTypes != null) "contributionTypes: " + GraphQLRequestSerializer.getEntry(contributionTypes.asJava) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (includeUserRepositories.isDefined) "includeUserRepositories: " + GraphQLRequestSerializer.getEntry(includeUserRepositories.get) else "",
            if (isLocked.isDefined) "isLocked: " + GraphQLRequestSerializer.getEntry(isLocked.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (privacy != null) "privacy: " + GraphQLRequestSerializer.getEntry(privacy) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
