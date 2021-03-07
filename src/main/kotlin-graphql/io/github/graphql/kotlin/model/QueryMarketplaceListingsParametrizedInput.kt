package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field marketplaceListings in type Query
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class QueryMarketplaceListingsParametrizedInput(
    val adminId: String?,
    val after: String?,
    val allStates: Boolean?,
    val before: String?,
    val categorySlug: String?,
    val first: Int?,
    val last: Int?,
    val organizationId: String?,
    val primaryCategoryOnly: Boolean? = false,
    val slugs: List<String?>?,
    val useTopicAliases: Boolean?,
    val viewerCanAdmin: Boolean?,
    val withFreeTrialsOnly: Boolean? = false
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (adminId != null) {
            joiner.add("adminId: " + GraphQLRequestSerializer.getEntry(adminId))
        }
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (allStates != null) {
            joiner.add("allStates: " + GraphQLRequestSerializer.getEntry(allStates))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (categorySlug != null) {
            joiner.add("categorySlug: " + GraphQLRequestSerializer.getEntry(categorySlug))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (organizationId != null) {
            joiner.add("organizationId: " + GraphQLRequestSerializer.getEntry(organizationId))
        }
        if (primaryCategoryOnly != null) {
            joiner.add("primaryCategoryOnly: " + GraphQLRequestSerializer.getEntry(primaryCategoryOnly))
        }
        if (slugs != null) {
            joiner.add("slugs: " + GraphQLRequestSerializer.getEntry(slugs))
        }
        if (useTopicAliases != null) {
            joiner.add("useTopicAliases: " + GraphQLRequestSerializer.getEntry(useTopicAliases))
        }
        if (viewerCanAdmin != null) {
            joiner.add("viewerCanAdmin: " + GraphQLRequestSerializer.getEntry(viewerCanAdmin))
        }
        if (withFreeTrialsOnly != null) {
            joiner.add("withFreeTrialsOnly: " + GraphQLRequestSerializer.getEntry(withFreeTrialsOnly))
        }
        return joiner.toString()
    }
}
