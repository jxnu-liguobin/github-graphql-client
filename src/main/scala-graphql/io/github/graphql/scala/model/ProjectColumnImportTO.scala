package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ProjectColumnImportTO]
        Objects.equals(columnName, that.columnName) &&
        Objects.equals(issues, that.issues) &&
        Objects.equals(position, that.position)
    }

    override def hashCode(): Int = {
        Objects.hash(columnName, issues, position)
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
