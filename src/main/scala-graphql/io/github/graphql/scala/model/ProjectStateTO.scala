package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object ProjectStateTO extends Enumeration {

    type ProjectStateTO = Value

    val CLOSED: Value = Value("CLOSED")
    val OPEN: Value = Value("OPEN")

}

class ProjectStateTOTypeRefer extends TypeReference[ProjectStateTO.type]
