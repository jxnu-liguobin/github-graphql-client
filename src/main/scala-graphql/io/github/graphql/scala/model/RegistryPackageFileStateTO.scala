package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object RegistryPackageFileStateTO extends Enumeration {

    type RegistryPackageFileStateTO = Value

    val NEW: Value = Value("NEW")
    val UPLOADED: Value = Value("UPLOADED")

}

class RegistryPackageFileStateTOTypeRefer extends TypeReference[RegistryPackageFileStateTO.type]
