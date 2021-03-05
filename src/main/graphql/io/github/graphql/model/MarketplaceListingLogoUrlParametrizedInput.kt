package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field logoUrl in type MarketplaceListing
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class MarketplaceListingLogoUrlParametrizedInput(
    val size: Int? = 400
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        }
        return joiner.toString()
    }
}
