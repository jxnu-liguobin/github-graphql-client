package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object DefaultRepositoryPermissionFieldTO extends Enumeration {

    type DefaultRepositoryPermissionFieldTO = Value

    val ADMIN: Value = Value("ADMIN")
    val NONE: Value = Value("NONE")
    val READ: Value = Value("READ")
    val WRITE: Value = Value("WRITE")

}

class DefaultRepositoryPermissionFieldTOTypeRefer extends TypeReference[DefaultRepositoryPermissionFieldTO.type]
