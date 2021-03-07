package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object SubscriptionStateTO extends Enumeration {

    type SubscriptionStateTO = Value

    val IGNORED: Value = Value("IGNORED")
    val SUBSCRIBED: Value = Value("SUBSCRIBED")
    val UNSUBSCRIBED: Value = Value("UNSUBSCRIBED")

}

class SubscriptionStateTOTypeRefer extends TypeReference[SubscriptionStateTO.type]
