package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field sponsorshipsAsMaintainer in type User
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class UserSponsorshipsAsMaintainerParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    includePrivate: Option[Boolean] = Some(false),
    last: Option[Int],
    orderBy: SponsorshipOrderTO
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (includePrivate.isDefined) "includePrivate: " + GraphQLRequestSerializer.getEntry(includePrivate.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
