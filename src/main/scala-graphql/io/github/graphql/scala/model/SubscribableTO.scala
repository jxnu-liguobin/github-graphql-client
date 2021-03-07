package io.github.graphql.scala.model

import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
trait SubscribableTO {

    @javax.validation.constraints.NotNull
    val id: String

    val viewerCanSubscribe: Boolean

    val viewerSubscription: SubscriptionStateTO

}
