package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Reactable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface ReactableResolver {

    @Throws(Exception::class)
    fun reactions(reactableTO: ReactableTO, after: String?, before: String?, content: ReactionContentTO?, first: Int?, last: Int?, orderBy: ReactionOrderTO?): ReactionConnectionTO

}
