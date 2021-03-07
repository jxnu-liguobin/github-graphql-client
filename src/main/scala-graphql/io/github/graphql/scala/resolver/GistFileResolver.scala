package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for GistFile
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait GistFileResolver {

    @throws[Exception]
    def text(gistFileTO: GistFileTO, truncate: Option[Int]): String

}
