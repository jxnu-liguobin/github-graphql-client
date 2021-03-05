package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReleaseAssetTO(
    val contentType: String,
    val createdAt: String,
    val downloadCount: Int,
    val downloadUrl: String,
    override
    val id: String,
    val name: String,
    val release: ReleaseTO?,
    val size: Int,
    val updatedAt: String,
    val uploadedBy: UserTO,
    val url: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("contentType: " + GraphQLRequestSerializer.getEntry(contentType))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("downloadCount: " + GraphQLRequestSerializer.getEntry(downloadCount))
        joiner.add("downloadUrl: " + GraphQLRequestSerializer.getEntry(downloadUrl))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (release != null) {
            joiner.add("release: " + GraphQLRequestSerializer.getEntry(release))
        }
        joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("uploadedBy: " + GraphQLRequestSerializer.getEntry(uploadedBy))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
