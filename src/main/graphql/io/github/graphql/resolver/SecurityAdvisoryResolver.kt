package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for SecurityAdvisory
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface SecurityAdvisoryResolver {

    @Throws(Exception::class)
    fun vulnerabilities(securityAdvisoryTO: SecurityAdvisoryTO, after: String?, before: String?, ecosystem: SecurityAdvisoryEcosystemTO?, first: Int?, last: Int?, orderBy: SecurityVulnerabilityOrderTO?, `package`: String?, severities: List<SecurityAdvisorySeverityTO>?): SecurityVulnerabilityConnectionTO

}
