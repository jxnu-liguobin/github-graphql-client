package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object MilestoneStateTO extends Enumeration {

    type MilestoneStateTO = Value

    val CLOSED: Value = Value("CLOSED")
    val OPEN: Value = Value("OPEN")

}

class MilestoneStateTOTypeRefer extends TypeReference[MilestoneStateTO.type]
