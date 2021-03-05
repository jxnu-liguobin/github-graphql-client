package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class GistFileTO(
    val encodedName: String?,
    val encoding: String?,
    val extension: String?,
    val isImage: Boolean,
    val isTruncated: Boolean,
    val language: LanguageTO?,
    val name: String?,
    val size: Int?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (encodedName != null) {
            joiner.add("encodedName: " + GraphQLRequestSerializer.getEntry(encodedName))
        }
        if (encoding != null) {
            joiner.add("encoding: " + GraphQLRequestSerializer.getEntry(encoding))
        }
        if (extension != null) {
            joiner.add("extension: " + GraphQLRequestSerializer.getEntry(extension))
        }
        joiner.add("isImage: " + GraphQLRequestSerializer.getEntry(isImage))
        joiner.add("isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated))
        if (language != null) {
            joiner.add("language: " + GraphQLRequestSerializer.getEntry(language))
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        }
        return joiner.toString()
    }
}
