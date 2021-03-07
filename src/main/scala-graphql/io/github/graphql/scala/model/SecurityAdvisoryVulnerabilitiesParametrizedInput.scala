package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import SecurityAdvisoryEcosystemTO._
import SecurityAdvisorySeverityTO._

/**
 * Parametrized input for field vulnerabilities in type SecurityAdvisory
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class SecurityAdvisoryVulnerabilitiesParametrizedInput(
    after: String,
    before: String,
    ecosystem: SecurityAdvisoryEcosystemTO,
    first: Option[Int],
    last: Option[Int],
    orderBy: SecurityVulnerabilityOrderTO,
    `package`: String,
    @javax.validation.constraints.NotNull
    severities: Seq[SecurityAdvisorySeverityTO]
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (ecosystem != null) "ecosystem: " + GraphQLRequestSerializer.getEntry(ecosystem) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (orderBy != null) "orderBy: " + GraphQLRequestSerializer.getEntry(orderBy) else "",
            if (`package` != null) "package: " + GraphQLRequestSerializer.getEntry(`package`) else "",
            if (severities != null) "severities: " + GraphQLRequestSerializer.getEntry(severities.asJava) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
