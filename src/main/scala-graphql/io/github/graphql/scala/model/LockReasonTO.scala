package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object LockReasonTO extends Enumeration {

    type LockReasonTO = Value

    val OFF_TOPIC: Value = Value("OFF_TOPIC")
    val RESOLVED: Value = Value("RESOLVED")
    val SPAM: Value = Value("SPAM")
    val TOO_HEATED: Value = Value("TOO_HEATED")

}

class LockReasonTOTypeRefer extends TypeReference[LockReasonTO.type]
