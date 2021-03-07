package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object IdentityProviderConfigurationStateTO extends Enumeration {

    type IdentityProviderConfigurationStateTO = Value

    val CONFIGURED: Value = Value("CONFIGURED")
    val ENFORCED: Value = Value("ENFORCED")
    val UNCONFIGURED: Value = Value("UNCONFIGURED")

}

class IdentityProviderConfigurationStateTOTypeRefer extends TypeReference[IdentityProviderConfigurationStateTO.type]
