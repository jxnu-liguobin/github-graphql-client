package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object SecurityAdvisorySeverityTO extends Enumeration {

    type SecurityAdvisorySeverityTO = Value

    val CRITICAL: Value = Value("CRITICAL")
    val HIGH: Value = Value("HIGH")
    val LOW: Value = Value("LOW")
    val MODERATE: Value = Value("MODERATE")

}

class SecurityAdvisorySeverityTOTypeRefer extends TypeReference[SecurityAdvisorySeverityTO.type]
