package io.github.graphql.model

import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
trait SubscribableTO {

    @javax.validation.constraints.NotNull
    val id: String

    val viewerCanSubscribe: Boolean

    val viewerSubscription: SubscriptionStateTO

}
