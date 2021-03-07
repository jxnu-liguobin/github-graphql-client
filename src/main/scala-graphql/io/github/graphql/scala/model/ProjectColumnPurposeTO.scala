package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object ProjectColumnPurposeTO extends Enumeration {

    type ProjectColumnPurposeTO = Value

    val DONE: Value = Value("DONE")
    val IN_PROGRESS: Value = Value("IN_PROGRESS")
    val TODO: Value = Value("TODO")

}

class ProjectColumnPurposeTOTypeRefer extends TypeReference[ProjectColumnPurposeTO.type]
