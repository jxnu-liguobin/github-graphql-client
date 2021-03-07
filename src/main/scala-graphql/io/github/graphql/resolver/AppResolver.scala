package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for App
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait AppResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def logoUrl(appTO: AppTO, size: Option[Int]): String

}
