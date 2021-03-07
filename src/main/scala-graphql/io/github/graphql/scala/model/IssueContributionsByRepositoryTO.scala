package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class IssueContributionsByRepositoryTO(
    @javax.validation.constraints.NotNull
    repository: RepositoryTO
) {

    override def toString(): String = {
        Seq(
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
        val that = obj.asInstanceOf[IssueContributionsByRepositoryTO]
        Objects.equals(repository, that.repository)
    }

    override def hashCode(): Int = {
        Objects.hash(repository)
    }
}

object IssueContributionsByRepositoryTO {

    def builder(): IssueContributionsByRepositoryTO.Builder = new Builder()

    class Builder {

        private var repository: RepositoryTO = _

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def build(): IssueContributionsByRepositoryTO = new IssueContributionsByRepositoryTO(repository)

    }
}
