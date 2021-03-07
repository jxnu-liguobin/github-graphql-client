package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for App
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface AppResolver {

    @Throws(Exception::class)
    fun logoUrl(appTO: AppTO, size: Int?): String

}
