package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for GistFile
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait GistFileResolver {

    @throws[Exception]
    def text(gistFileTO: GistFileTO, truncate: Option[Int]): String

}
