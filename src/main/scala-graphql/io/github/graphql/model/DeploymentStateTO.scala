package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object DeploymentStateTO extends Enumeration {

    type DeploymentStateTO = Value

    val ABANDONED: Value = Value("ABANDONED")
    val ACTIVE: Value = Value("ACTIVE")
    val DESTROYED: Value = Value("DESTROYED")
    val ERROR: Value = Value("ERROR")
    val FAILURE: Value = Value("FAILURE")
    val INACTIVE: Value = Value("INACTIVE")
    val IN_PROGRESS: Value = Value("IN_PROGRESS")
    val PENDING: Value = Value("PENDING")
    val QUEUED: Value = Value("QUEUED")

}

class DeploymentStateTOTypeRefer extends TypeReference[DeploymentStateTO.type]
