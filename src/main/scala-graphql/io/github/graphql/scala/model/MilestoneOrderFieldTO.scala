package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object MilestoneOrderFieldTO extends Enumeration {

    type MilestoneOrderFieldTO = Value

    val CREATED_AT: Value = Value("CREATED_AT")
    val DUE_DATE: Value = Value("DUE_DATE")
    val NUMBER: Value = Value("NUMBER")
    val UPDATED_AT: Value = Value("UPDATED_AT")

}

class MilestoneOrderFieldTOTypeRefer extends TypeReference[MilestoneOrderFieldTO.type]
