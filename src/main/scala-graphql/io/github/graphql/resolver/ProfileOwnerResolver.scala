package io.github.graphql.resolver

import io.github.graphql.model._
import PinnableItemTypeTO._

/**
 * Resolver for ProfileOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait ProfileOwnerResolver {

    @throws[Exception]
    def anyPinnableItems(profileOwnerTO: ProfileOwnerTO, `type`: PinnableItemTypeTO): Boolean

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnableItems(profileOwnerTO: ProfileOwnerTO, after: String, before: String, first: Option[Int], last: Option[Int], types: Seq[PinnableItemTypeTO]): PinnableItemConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pinnedItems(profileOwnerTO: ProfileOwnerTO, after: String, before: String, first: Option[Int], last: Option[Int], types: Seq[PinnableItemTypeTO]): PinnableItemConnectionTO

}
