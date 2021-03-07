package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object CommentCannotUpdateReasonTO extends Enumeration {

    type CommentCannotUpdateReasonTO = Value

    val DENIED: Value = Value("DENIED")
    val INSUFFICIENT_ACCESS: Value = Value("INSUFFICIENT_ACCESS")
    val LOCKED: Value = Value("LOCKED")
    val LOGIN_REQUIRED: Value = Value("LOGIN_REQUIRED")
    val MAINTENANCE: Value = Value("MAINTENANCE")
    val VERIFIED_EMAIL_REQUIRED: Value = Value("VERIFIED_EMAIL_REQUIRED")

}

class CommentCannotUpdateReasonTOTypeRefer extends TypeReference[CommentCannotUpdateReasonTO.type]
