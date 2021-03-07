package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import OrderDirectionTO._

/**
 * Parametrized input for field refs in type Repository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class RepositoryRefsParametrizedInput(
    after: String,
    before: String,
    direction: OrderDirectionTO,
    first: Option[Int],
    last: Option[Int],
    orderBy: RefOrderTO,
    @javax.validation.constraints.NotNull
    refPrefix: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (direction != null) "direction: " + GraphQLRequestSerializer.getEntry(direction) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (refPrefix != null) "refPrefix: " + GraphQLRequestSerializer.getEntry(refPrefix) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
