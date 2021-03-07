package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object TopicSuggestionDeclineReasonTO extends Enumeration {

    type TopicSuggestionDeclineReasonTO = Value

    val NOT_RELEVANT: Value = Value("NOT_RELEVANT")
    val PERSONAL_PREFERENCE: Value = Value("PERSONAL_PREFERENCE")
    val TOO_GENERAL: Value = Value("TOO_GENERAL")
    val TOO_SPECIFIC: Value = Value("TOO_SPECIFIC")

}

class TopicSuggestionDeclineReasonTOTypeRefer extends TypeReference[TopicSuggestionDeclineReasonTO.type]
