package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object IssuePubSubTopicTO extends Enumeration {

    type IssuePubSubTopicTO = Value

    val MARKASREAD: Value = Value("MARKASREAD")
    val STATE: Value = Value("STATE")
    val TIMELINE: Value = Value("TIMELINE")
    val UPDATED: Value = Value("UPDATED")

}

class IssuePubSubTopicTOTypeRefer extends TypeReference[IssuePubSubTopicTO.type]
