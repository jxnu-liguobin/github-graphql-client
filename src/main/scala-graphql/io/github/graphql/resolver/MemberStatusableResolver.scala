package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for MemberStatusable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait MemberStatusableResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def memberStatuses(memberStatusableTO: MemberStatusableTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: UserStatusOrderTO): UserStatusConnectionTO

}
