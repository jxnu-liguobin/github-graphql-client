package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for ProfileItemShowcase
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface ProfileItemShowcaseResolver {

    @Throws(Exception::class)
    fun items(profileItemShowcaseTO: ProfileItemShowcaseTO, after: String?, before: String?, first: Int?, last: Int?): PinnableItemConnectionTO

}
