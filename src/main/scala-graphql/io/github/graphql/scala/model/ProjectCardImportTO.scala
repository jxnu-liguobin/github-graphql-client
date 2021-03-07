package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class ProjectCardImportTO(
    number: Int,
    @javax.validation.constraints.NotNull
    repository: String
) {

    override def toString(): String = {
        Seq(
            "number: " + GraphQLRequestSerializer.getEntry(number),
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ProjectCardImportTO]
        Objects.equals(number, that.number) &&
        Objects.equals(repository, that.repository)
    }

    override def hashCode(): Int = {
        Objects.hash(number, repository)
    }
}

object ProjectCardImportTO {

    def builder(): ProjectCardImportTO.Builder = new Builder()

    class Builder {

        private var number: Int = _
        private var repository: String = _

        def setNumber(number: Int): Builder = {
            this.number = number
            this
        }

        def setRepository(repository: String): Builder = {
            this.repository = repository
            this
        }

        def build(): ProjectCardImportTO = new ProjectCardImportTO(number, repository)

    }
}
