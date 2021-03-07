package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object ProjectCardArchivedStateTO extends Enumeration {

    type ProjectCardArchivedStateTO = Value

    val ARCHIVED: Value = Value("ARCHIVED")
    val NOT_ARCHIVED: Value = Value("NOT_ARCHIVED")

}

class ProjectCardArchivedStateTOTypeRefer extends TypeReference[ProjectCardArchivedStateTO.type]
