package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ProjectColumnImportTO(
    val columnName: String,
    val issues: List<ProjectCardImportTO>?,
    val position: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

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

    class Builder {

        private lateinit var columnName: String
        private var issues: List<ProjectCardImportTO>? = null
        private var position: Int = 0

        fun setColumnName(columnName: String): Builder {
            this.columnName = columnName
            return this
        }

        fun setIssues(issues: List<ProjectCardImportTO>?): Builder {
            this.issues = issues
            return this
        }

        fun setPosition(position: Int): Builder {
            this.position = position
            return this
        }

        fun build(): ProjectColumnImportTO {
            return ProjectColumnImportTO(columnName, issues, position)
        }
    }
}
