package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object SecurityAdvisoryIdentifierTypeTO extends Enumeration {

    type SecurityAdvisoryIdentifierTypeTO = Value

    val CVE: Value = Value("CVE")
    val GHSA: Value = Value("GHSA")

}

class SecurityAdvisoryIdentifierTypeTOTypeRefer extends TypeReference[SecurityAdvisoryIdentifierTypeTO.type]
