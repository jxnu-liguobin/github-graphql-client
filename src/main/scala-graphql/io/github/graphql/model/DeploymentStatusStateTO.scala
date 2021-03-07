package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object DeploymentStatusStateTO extends Enumeration {

    type DeploymentStatusStateTO = Value

    val ERROR: Value = Value("ERROR")
    val FAILURE: Value = Value("FAILURE")
    val INACTIVE: Value = Value("INACTIVE")
    val IN_PROGRESS: Value = Value("IN_PROGRESS")
    val PENDING: Value = Value("PENDING")
    val QUEUED: Value = Value("QUEUED")
    val SUCCESS: Value = Value("SUCCESS")

}

class DeploymentStatusStateTOTypeRefer extends TypeReference[DeploymentStatusStateTO.type]
