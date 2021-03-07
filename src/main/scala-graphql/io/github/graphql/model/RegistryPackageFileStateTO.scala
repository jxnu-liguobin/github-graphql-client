package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object RegistryPackageFileStateTO extends Enumeration {

    type RegistryPackageFileStateTO = Value

    val NEW: Value = Value("NEW")
    val UPLOADED: Value = Value("UPLOADED")

}

class RegistryPackageFileStateTOTypeRefer extends TypeReference[RegistryPackageFileStateTO.type]
