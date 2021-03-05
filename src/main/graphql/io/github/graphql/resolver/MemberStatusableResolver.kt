package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for MemberStatusable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface MemberStatusableResolver {

    @Throws(Exception::class)
    fun memberStatuses(memberStatusableTO: MemberStatusableTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: UserStatusOrderTO?): UserStatusConnectionTO

}
