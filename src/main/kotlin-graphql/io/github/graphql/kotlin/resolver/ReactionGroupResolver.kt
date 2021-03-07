package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for ReactionGroup
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface ReactionGroupResolver {

    @Throws(Exception::class)
    fun users(reactionGroupTO: ReactionGroupTO, after: String?, before: String?, first: Int?, last: Int?): ReactingUserConnectionTO

}
