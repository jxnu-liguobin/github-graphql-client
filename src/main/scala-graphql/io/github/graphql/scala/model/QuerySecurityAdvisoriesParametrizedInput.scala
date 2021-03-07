package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field securityAdvisories in type Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class QuerySecurityAdvisoriesParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    identifier: SecurityAdvisoryIdentifierFilterTO,
    last: Option[Int],
    orderBy: SecurityAdvisoryOrderTO,
    publishedSince: String,
    updatedSince: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (identifier != null) "identifier: " + GraphQLRequestSerializer.getEntry(identifier) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (publishedSince != null) "publishedSince: " + GraphQLRequestSerializer.getEntry(publishedSince) else "",
            if (updatedSince != null) "updatedSince: " + GraphQLRequestSerializer.getEntry(updatedSince) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
