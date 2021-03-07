package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import SecurityAdvisoryEcosystemTO._
import Seq[SecurityAdvisorySeverityTO]._

/**
 * Resolver for SecurityAdvisory
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait SecurityAdvisoryResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def vulnerabilities(securityAdvisoryTO: SecurityAdvisoryTO, after: String, before: String, ecosystem: SecurityAdvisoryEcosystemTO, first: Option[Int], last: Option[Int], orderBy: SecurityVulnerabilityOrderTO, `package`: String, severities: Seq[SecurityAdvisorySeverityTO]): SecurityVulnerabilityConnectionTO

}
