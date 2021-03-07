package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Release
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait ReleaseResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def releaseAssets(releaseTO: ReleaseTO, after: String, before: String, first: Option[Int], last: Option[Int], name: String): ReleaseAssetConnectionTO

}
