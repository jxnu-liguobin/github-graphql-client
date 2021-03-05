package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MarketplaceCategoryTO(
    val description: String?,
    val howItWorks: String?,
    override
    val id: String,
    val name: String,
    val primaryListingCount: Int,
    val resourcePath: String,
    val secondaryListingCount: Int,
    val slug: String,
    val url: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (howItWorks != null) {
            joiner.add("howItWorks: " + GraphQLRequestSerializer.getEntry(howItWorks))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("primaryListingCount: " + GraphQLRequestSerializer.getEntry(primaryListingCount))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("secondaryListingCount: " + GraphQLRequestSerializer.getEntry(secondaryListingCount))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
