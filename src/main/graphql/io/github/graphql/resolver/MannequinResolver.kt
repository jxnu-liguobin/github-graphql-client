package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Mannequin
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface MannequinResolver {

    @Throws(Exception::class)
    fun avatarUrl(mannequinTO: MannequinTO, size: Int?): String

}
