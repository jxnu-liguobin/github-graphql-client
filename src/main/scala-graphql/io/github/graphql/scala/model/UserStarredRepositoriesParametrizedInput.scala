package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field starredRepositories in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class UserStarredRepositoriesParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    orderBy: StarOrderTO,
    ownedByViewer: Option[Boolean]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (ownedByViewer.isDefined) "ownedByViewer: " + GraphQLRequestSerializer.getEntry(ownedByViewer.get) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
