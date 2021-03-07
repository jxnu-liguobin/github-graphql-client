package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object ProjectCardStateTO extends Enumeration {

    type ProjectCardStateTO = Value

    val CONTENT_ONLY: Value = Value("CONTENT_ONLY")
    val NOTE_ONLY: Value = Value("NOTE_ONLY")
    val REDACTED: Value = Value("REDACTED")

}

class ProjectCardStateTOTypeRefer extends TypeReference[ProjectCardStateTO.type]
