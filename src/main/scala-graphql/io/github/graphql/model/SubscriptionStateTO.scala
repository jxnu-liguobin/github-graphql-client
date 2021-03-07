package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object SubscriptionStateTO extends Enumeration {

    type SubscriptionStateTO = Value

    val IGNORED: Value = Value("IGNORED")
    val SUBSCRIBED: Value = Value("SUBSCRIBED")
    val UNSUBSCRIBED: Value = Value("UNSUBSCRIBED")

}

class SubscriptionStateTOTypeRefer extends TypeReference[SubscriptionStateTO.type]
