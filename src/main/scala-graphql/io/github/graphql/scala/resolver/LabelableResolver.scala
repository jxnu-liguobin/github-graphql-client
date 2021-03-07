package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Labelable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait LabelableResolver {

    @throws[Exception]
    def labels(labelableTO: LabelableTO, after: String, before: String, first: Option[Int], last: Option[Int]): LabelConnectionTO

}
