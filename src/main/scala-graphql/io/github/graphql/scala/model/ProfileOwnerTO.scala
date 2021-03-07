package io.github.graphql.scala.model


@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
trait ProfileOwnerTO {

    val email: String

    @javax.validation.constraints.NotNull
    val id: String

    @javax.validation.constraints.NotNull
    val itemShowcase: ProfileItemShowcaseTO

    val location: String

    @javax.validation.constraints.NotNull
    val login: String

    val name: String

    val pinnedItemsRemaining: Int

    val viewerCanChangePinnedItems: Boolean

    val websiteUrl: String

}
