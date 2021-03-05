package io.github.graphql.resolver

import io.github.graphql.model.*

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface SecurityAdvisoriesQueryResolver {

    @Throws(Exception::class)
    fun securityAdvisories(after: String?, before: String?, first: Int?, identifier: SecurityAdvisoryIdentifierFilterTO?, last: Int?, orderBy: SecurityAdvisoryOrderTO?, publishedSince: String?, updatedSince: String?): SecurityAdvisoryConnectionTO

}
