package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
