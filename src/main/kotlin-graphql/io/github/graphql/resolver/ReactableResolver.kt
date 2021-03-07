package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Reactable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface ReactableResolver {

    @Throws(Exception::class)
    fun reactions(reactableTO: ReactableTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

}
