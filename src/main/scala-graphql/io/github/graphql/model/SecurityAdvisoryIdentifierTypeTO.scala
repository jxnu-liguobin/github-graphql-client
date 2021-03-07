package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object SecurityAdvisoryIdentifierTypeTO extends Enumeration {

    type SecurityAdvisoryIdentifierTypeTO = Value

    val CVE: Value = Value("CVE")
    val GHSA: Value = Value("GHSA")

}

class SecurityAdvisoryIdentifierTypeTOTypeRefer extends TypeReference[SecurityAdvisoryIdentifierTypeTO.type]
