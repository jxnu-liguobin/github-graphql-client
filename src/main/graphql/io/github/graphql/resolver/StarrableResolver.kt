package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Starrable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface StarrableResolver {

    @Throws(Exception::class)
    fun stargazers(starrableTO: StarrableTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: StarOrderTO?): StargazerConnectionTO

}
