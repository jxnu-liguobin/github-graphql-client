package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for ProfileItemShowcase
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface ProfileItemShowcaseResolver {

    @Throws(Exception::class)
    fun items(profileItemShowcaseTO: ProfileItemShowcaseTO, after: String?, before: String?, first: Int?, last: Int?): PinnableItemConnectionTO

}
