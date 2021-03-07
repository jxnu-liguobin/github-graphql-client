package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
