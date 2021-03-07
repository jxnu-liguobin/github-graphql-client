package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CommitContributionsByRepositoryTO(
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    @javax.validation.constraints.NotNull
    url: String
) {

    override def toString(): String = {
        Seq(
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CommitContributionsByRepositoryTO]
        Objects.equals(repository, that.repository) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(repository, resourcePath, url)
    }
}

object CommitContributionsByRepositoryTO {

    def builder(): CommitContributionsByRepositoryTO.Builder = new Builder()

    class Builder {

        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var url: String = _

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): CommitContributionsByRepositoryTO = new CommitContributionsByRepositoryTO(repository, resourcePath, url)

    }
}
