package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import CollaboratorAffiliationTO._

/**
 * Parametrized input for field collaborators in type Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class RepositoryCollaboratorsParametrizedInput(
    affiliation: CollaboratorAffiliationTO,
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (affiliation != null) "affiliation: " + GraphQLRequestSerializer.getEntry(affiliation) else "",
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
