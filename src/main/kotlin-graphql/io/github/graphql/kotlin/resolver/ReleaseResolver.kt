package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Release
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface ReleaseResolver {

    @Throws(Exception::class)
    fun releaseAssets(releaseTO: ReleaseTO, after: String?, before: String?, first: Int?, last: Int?, name: String?): ReleaseAssetConnectionTO

}
