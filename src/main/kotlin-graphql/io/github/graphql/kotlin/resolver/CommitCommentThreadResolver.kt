package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for CommitCommentThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface CommitCommentThreadResolver {

    @Throws(Exception::class)
    fun comments(commitCommentThreadTO: CommitCommentThreadTO, after: String?, before: String?, first: Int?, last: Int?): CommitCommentConnectionTO

}
