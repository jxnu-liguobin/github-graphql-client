package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SponsorsListingTO(
    val fullDescription: String,
    override
    val id: String,
    val shortDescription: String,
    val slug: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("fullDescription: " + GraphQLRequestSerializer.getEntry(fullDescription))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        return joiner.toString()
    }
}
