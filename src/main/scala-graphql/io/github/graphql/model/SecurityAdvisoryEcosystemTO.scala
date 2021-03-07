package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object SecurityAdvisoryEcosystemTO extends Enumeration {

    type SecurityAdvisoryEcosystemTO = Value

    val MAVEN: Value = Value("MAVEN")
    val NPM: Value = Value("NPM")
    val NUGET: Value = Value("NUGET")
    val PIP: Value = Value("PIP")
    val RUBYGEMS: Value = Value("RUBYGEMS")

}

class SecurityAdvisoryEcosystemTOTypeRefer extends TypeReference[SecurityAdvisoryEcosystemTO.type]
