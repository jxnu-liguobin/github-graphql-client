package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for Status
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait StatusResolver {

    @throws[Exception]
    def context(statusTO: StatusTO, name: String): StatusContextTO

}
