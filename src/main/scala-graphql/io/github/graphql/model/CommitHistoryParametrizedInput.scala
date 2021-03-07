package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field history in type Commit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class CommitHistoryParametrizedInput(
    after: String,
    author: CommitAuthorTO,
    before: String,
    first: Option[Int],
    last: Option[Int],
    path: String,
    since: String,
    until: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (path != null) "path: " + GraphQLRequestSerializer.getEntry(path) else "",
            if (since != null) "since: " + GraphQLRequestSerializer.getEntry(since) else "",
            if (until != null) "until: " + GraphQLRequestSerializer.getEntry(until) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
