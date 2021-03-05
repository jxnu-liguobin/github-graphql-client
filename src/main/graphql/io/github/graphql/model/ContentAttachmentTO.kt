package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContentAttachmentTO(
    val body: String,
    val contentReference: ContentReferenceTO,
    val databaseId: Int,
    val id: String,
    val title: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("contentReference: " + GraphQLRequestSerializer.getEntry(contentReference))
        joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        return joiner.toString()
    }
}
