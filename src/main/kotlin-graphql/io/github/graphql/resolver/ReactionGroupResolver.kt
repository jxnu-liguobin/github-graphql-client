package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for ReactionGroup
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface ReactionGroupResolver {

    @Throws(Exception::class)
    fun users(reactionGroupTO: ReactionGroupTO, after: String?, before: String?, first: Int?, last: Int?): ReactingUserConnectionTO

}
