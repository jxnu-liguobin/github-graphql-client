package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object PullRequestPubSubTopicTO extends Enumeration {

    type PullRequestPubSubTopicTO = Value

    val HEAD_REF: Value = Value("HEAD_REF")
    val MARKASREAD: Value = Value("MARKASREAD")
    val STATE: Value = Value("STATE")
    val TIMELINE: Value = Value("TIMELINE")
    val UPDATED: Value = Value("UPDATED")

}

class PullRequestPubSubTopicTOTypeRefer extends TypeReference[PullRequestPubSubTopicTO.type]
