package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object SecurityAdvisorySeverityTO extends Enumeration {

    type SecurityAdvisorySeverityTO = Value

    val CRITICAL: Value = Value("CRITICAL")
    val HIGH: Value = Value("HIGH")
    val LOW: Value = Value("LOW")
    val MODERATE: Value = Value("MODERATE")

}

class SecurityAdvisorySeverityTOTypeRefer extends TypeReference[SecurityAdvisorySeverityTO.type]
