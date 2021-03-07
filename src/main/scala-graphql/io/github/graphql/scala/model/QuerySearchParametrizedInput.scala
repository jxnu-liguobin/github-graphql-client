package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import SearchTypeTO._

/**
 * Parametrized input for field search in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QuerySearchParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    @javax.validation.constraints.NotNull
    query: String,
    @javax.validation.constraints.NotNull
    `type`: SearchTypeTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (query != null) "query: " + GraphQLRequestSerializer.getEntry(query) else "",
            if (`type` != null) "type: " + GraphQLRequestSerializer.getEntry(`type`) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
