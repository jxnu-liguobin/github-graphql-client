package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field pullRequestReviewContributionsByRepository in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput(
    maxRepositories: Option[Int] = Some(25)
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (maxRepositories.isDefined) "maxRepositories: " + GraphQLRequestSerializer.getEntry(maxRepositories.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
