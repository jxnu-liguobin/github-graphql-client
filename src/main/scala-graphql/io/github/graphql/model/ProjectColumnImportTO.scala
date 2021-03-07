package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProjectColumnImportTO(
    @javax.validation.constraints.NotNull
    columnName: String,
    @javax.validation.constraints.NotNull
    issues: Seq[ProjectCardImportTO],
    position: Int
) {

    override def toString(): String = {
        Seq(
            if (columnName != null) "columnName: " + GraphQLRequestSerializer.getEntry(columnName) else "",
            if (issues != null) "issues: " + GraphQLRequestSerializer.getEntry(issues.asJava) else "",
            "position: " + GraphQLRequestSerializer.getEntry(position)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ProjectColumnImportTO {

    def builder(): ProjectColumnImportTO.Builder = new Builder()

    class Builder {

        private var columnName: String = _
        private var issues: Seq[ProjectCardImportTO] = _
        private var position: Int = _

        def setColumnName(columnName: String): Builder = {
            this.columnName = columnName
            this
        }

        def setIssues(issues: Seq[ProjectCardImportTO]): Builder = {
            this.issues = issues
            this
        }

        def setPosition(position: Int): Builder = {
            this.position = position
            this
        }

        def build(): ProjectColumnImportTO = new ProjectColumnImportTO(columnName, issues, position)

    }
}
