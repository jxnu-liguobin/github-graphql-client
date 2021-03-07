package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object ProjectCardArchivedStateTO extends Enumeration {

    type ProjectCardArchivedStateTO = Value

    val ARCHIVED: Value = Value("ARCHIVED")
    val NOT_ARCHIVED: Value = Value("NOT_ARCHIVED")

}

class ProjectCardArchivedStateTOTypeRefer extends TypeReference[ProjectCardArchivedStateTO.type]
