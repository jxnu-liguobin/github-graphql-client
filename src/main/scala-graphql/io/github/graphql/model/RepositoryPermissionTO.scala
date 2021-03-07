package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
