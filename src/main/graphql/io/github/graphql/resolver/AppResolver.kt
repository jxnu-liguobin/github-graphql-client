package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for App
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface AppResolver {

    @Throws(Exception::class)
    fun logoUrl(appTO: AppTO, size: Int?): String

}
