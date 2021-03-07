package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object RepositoryLockReasonTO extends Enumeration {

    type RepositoryLockReasonTO = Value

    val BILLING: Value = Value("BILLING")
    val MIGRATING: Value = Value("MIGRATING")
    val MOVING: Value = Value("MOVING")
    val RENAME: Value = Value("RENAME")

}

class RepositoryLockReasonTOTypeRefer extends TypeReference[RepositoryLockReasonTO.type]
