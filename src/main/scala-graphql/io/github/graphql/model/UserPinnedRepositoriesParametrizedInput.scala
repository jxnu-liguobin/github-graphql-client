package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import RepositoryAffiliationTO._
import RepositoryAffiliationTO._
import RepositoryPrivacyTO._

/**
 * Parametrized input for field pinnedRepositories in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserPinnedRepositoriesParametrizedInput(
    affiliations: Seq[RepositoryAffiliationTO] = Seq(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR),
    after: String,
    before: String,
    first: Option[Int],
    isLocked: Option[Boolean],
    last: Option[Int],
    orderBy: RepositoryOrderTO,
    ownerAffiliations: Seq[RepositoryAffiliationTO] = Seq(RepositoryAffiliationTO.OWNER, RepositoryAffiliationTO.COLLABORATOR),
    privacy: RepositoryPrivacyTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (affiliations != null) "affiliations: " + GraphQLRequestSerializer.getEntry(affiliations.asJava) else "",
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (isLocked.isDefined) "isLocked: " + GraphQLRequestSerializer.getEntry(isLocked.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (ownerAffiliations != null) "ownerAffiliations: " + GraphQLRequestSerializer.getEntry(ownerAffiliations.asJava) else "",
            if (privacy != null) "privacy: " + GraphQLRequestSerializer.getEntry(privacy) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
