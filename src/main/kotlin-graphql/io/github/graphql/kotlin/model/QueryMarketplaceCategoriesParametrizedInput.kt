package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field marketplaceCategories in type Query
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
data class QueryMarketplaceCategoriesParametrizedInput(
    val excludeEmpty: Boolean?,
    val excludeSubcategories: Boolean?,
    val includeCategories: List<String>?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (excludeEmpty != null) {
            joiner.add("excludeEmpty: " + GraphQLRequestSerializer.getEntry(excludeEmpty))
        }
        if (excludeSubcategories != null) {
            joiner.add("excludeSubcategories: " + GraphQLRequestSerializer.getEntry(excludeSubcategories))
        }
        if (includeCategories != null) {
            joiner.add("includeCategories: " + GraphQLRequestSerializer.getEntry(includeCategories))
        }
        return joiner.toString()
    }
}
