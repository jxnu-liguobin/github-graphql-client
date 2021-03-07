package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object DefaultRepositoryPermissionFieldTO extends Enumeration {

    type DefaultRepositoryPermissionFieldTO = Value

    val ADMIN: Value = Value("ADMIN")
    val NONE: Value = Value("NONE")
    val READ: Value = Value("READ")
    val WRITE: Value = Value("WRITE")

}

class DefaultRepositoryPermissionFieldTOTypeRefer extends TypeReference[DefaultRepositoryPermissionFieldTO.type]
