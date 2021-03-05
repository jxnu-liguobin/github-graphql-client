package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageFileTO(
    val guid: String?,
    override
    val id: String,
    val md5: String?,
    val metadataUrl: String,
    val name: String,
    val packageVersion: RegistryPackageVersionTO,
    val sha1: String?,
    val sha256: String?,
    val size: Int?,
    val updatedAt: String,
    val url: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (guid != null) {
            joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (md5 != null) {
            joiner.add("md5: " + GraphQLRequestSerializer.getEntry(md5))
        }
        joiner.add("metadataUrl: " + GraphQLRequestSerializer.getEntry(metadataUrl))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("packageVersion: " + GraphQLRequestSerializer.getEntry(packageVersion))
        if (sha1 != null) {
            joiner.add("sha1: " + GraphQLRequestSerializer.getEntry(sha1))
        }
        if (sha256 != null) {
            joiner.add("sha256: " + GraphQLRequestSerializer.getEntry(sha256))
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
