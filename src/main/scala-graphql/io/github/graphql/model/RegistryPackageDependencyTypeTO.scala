package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object RegistryPackageDependencyTypeTO extends Enumeration {

    type RegistryPackageDependencyTypeTO = Value

    val BUNDLED: Value = Value("BUNDLED")
    val DEFAULT: Value = Value("DEFAULT")
    val DEV: Value = Value("DEV")
    val OPTIONAL: Value = Value("OPTIONAL")
    val PEER: Value = Value("PEER")
    val TEST: Value = Value("TEST")

}

class RegistryPackageDependencyTypeTOTypeRefer extends TypeReference[RegistryPackageDependencyTypeTO.type]
