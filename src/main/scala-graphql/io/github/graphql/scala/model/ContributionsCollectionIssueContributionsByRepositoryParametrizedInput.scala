package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field issueContributionsByRepository in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
case class ContributionsCollectionIssueContributionsByRepositoryParametrizedInput(
    excludeFirst: Option[Boolean] = Some(false),
    excludePopular: Option[Boolean] = Some(false),
    maxRepositories: Option[Int] = Some(25)
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (excludeFirst.isDefined) "excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst.get) else "",
            if (excludePopular.isDefined) "excludePopular: " + GraphQLRequestSerializer.getEntry(excludePopular.get) else "",
            if (maxRepositories.isDefined) "maxRepositories: " + GraphQLRequestSerializer.getEntry(maxRepositories.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
