package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for MemberStatusable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface MemberStatusableResolver {

    @Throws(Exception::class)
    fun memberStatuses(memberStatusableTO: MemberStatusableTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: UserStatusOrderTO?): UserStatusConnectionTO

}
