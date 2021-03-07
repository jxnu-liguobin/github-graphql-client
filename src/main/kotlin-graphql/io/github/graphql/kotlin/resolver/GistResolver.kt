package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Gist
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface GistResolver {

    @Throws(Exception::class)
    fun comments(gistTO: GistTO, after: String?, before: String?, first: Int?, last: Int?): GistCommentConnectionTO

    @Throws(Exception::class)
    fun files(gistTO: GistTO, limit: Int?, oid: String?): List<GistFileTO?>?

    @Throws(Exception::class)
    fun forks(gistTO: GistTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: GistOrderTO?): GistConnectionTO

    @Throws(Exception::class)
    fun stargazers(gistTO: GistTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: StarOrderTO?): StargazerConnectionTO

}
