package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProjectColumnImportTO(
    val columnName: String,
    val issues: List<ProjectCardImportTO>?,
    val position: Int
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("columnName: " + GraphQLRequestSerializer.getEntry(columnName))
        if (issues != null) {
            joiner.add("issues: " + GraphQLRequestSerializer.getEntry(issues))
        }
        joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        return joiner.toString()
    }
}
