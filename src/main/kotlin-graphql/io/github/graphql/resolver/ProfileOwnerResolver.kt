package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for ProfileOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface ProfileOwnerResolver {

    @Throws(Exception::class)
    fun anyPinnableItems(profileOwnerTO: ProfileOwnerTO, type: PinnableItemTypeTO?): Boolean

    @Throws(Exception::class)
    fun pinnableItems(profileOwnerTO: ProfileOwnerTO, after: String?, before: String?, first: Int?, last: Int?, types: List<PinnableItemTypeTO>?): PinnableItemConnectionTO

    @Throws(Exception::class)
    fun pinnedItems(profileOwnerTO: ProfileOwnerTO, after: String?, before: String?, first: Int?, last: Int?, types: List<PinnableItemTypeTO>?): PinnableItemConnectionTO

}
