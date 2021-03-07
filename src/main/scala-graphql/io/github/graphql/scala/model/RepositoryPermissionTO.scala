package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object RepositoryPermissionTO extends Enumeration {

    type RepositoryPermissionTO = Value

    val ADMIN: Value = Value("ADMIN")
    val MAINTAIN: Value = Value("MAINTAIN")
    val READ: Value = Value("READ")
    val TRIAGE: Value = Value("TRIAGE")
    val WRITE: Value = Value("WRITE")

}

class RepositoryPermissionTOTypeRefer extends TypeReference[RepositoryPermissionTO.type]
