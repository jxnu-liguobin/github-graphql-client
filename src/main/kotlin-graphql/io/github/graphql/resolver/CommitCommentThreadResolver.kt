package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for CommitCommentThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface CommitCommentThreadResolver {

    @Throws(Exception::class)
    fun comments(commitCommentThreadTO: CommitCommentThreadTO, after: String?, before: String?, first: Int?, last: Int?): CommitCommentConnectionTO

}
