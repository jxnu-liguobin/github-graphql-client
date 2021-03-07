package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object CommentAuthorAssociationTO extends Enumeration {

    type CommentAuthorAssociationTO = Value

    val COLLABORATOR: Value = Value("COLLABORATOR")
    val CONTRIBUTOR: Value = Value("CONTRIBUTOR")
    val FIRST_TIMER: Value = Value("FIRST_TIMER")
    val FIRST_TIME_CONTRIBUTOR: Value = Value("FIRST_TIME_CONTRIBUTOR")
    val MEMBER: Value = Value("MEMBER")
    val NONE: Value = Value("NONE")
    val OWNER: Value = Value("OWNER")

}

class CommentAuthorAssociationTOTypeRefer extends TypeReference[CommentAuthorAssociationTO.type]
