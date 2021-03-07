package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for SecurityAdvisory
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface SecurityAdvisoryResolver {

    @Throws(Exception::class)
    fun vulnerabilities(securityAdvisoryTO: SecurityAdvisoryTO, after: String?, before: String?, ecosystem: SecurityAdvisoryEcosystemTO?, first: Int?, last: Int?, orderBy: SecurityVulnerabilityOrderTO?, `package`: String?, severities: List<SecurityAdvisorySeverityTO>?): SecurityVulnerabilityConnectionTO

}
