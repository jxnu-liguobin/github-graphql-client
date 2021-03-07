package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import ReactionContentTO._

/**
 * Resolver for Reactable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait ReactableResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def reactions(reactableTO: ReactableTO, after: String, before: String, content: ReactionContentTO, first: Option[Int], last: Option[Int], orderBy: ReactionOrderTO): ReactionConnectionTO

}
