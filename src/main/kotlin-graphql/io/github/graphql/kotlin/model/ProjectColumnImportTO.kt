package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ProjectColumnImportTO
        return Objects.equals(columnName, that.columnName)
                && Objects.equals(issues, that.issues)
                && Objects.equals(position, that.position)

    }

    override fun hashCode(): Int = {
        return Objects.hash(columnName, issues, position)
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
