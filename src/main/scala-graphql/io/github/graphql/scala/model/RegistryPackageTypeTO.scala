package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object RegistryPackageTypeTO extends Enumeration {

    type RegistryPackageTypeTO = Value

    val DEBIAN: Value = Value("DEBIAN")
    val DOCKER: Value = Value("DOCKER")
    val MAVEN: Value = Value("MAVEN")
    val NPM: Value = Value("NPM")
    val NUGET: Value = Value("NUGET")
    val PYTHON: Value = Value("PYTHON")
    val RUBYGEMS: Value = Value("RUBYGEMS")

}

class RegistryPackageTypeTOTypeRefer extends TypeReference[RegistryPackageTypeTO.type]
