package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for App
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait AppResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def logoUrl(appTO: AppTO, size: Option[Int]): String

}
