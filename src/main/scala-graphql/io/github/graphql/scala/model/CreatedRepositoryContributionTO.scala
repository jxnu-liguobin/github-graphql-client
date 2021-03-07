package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CreatedRepositoryContributionTO(
    override val isRestricted: Boolean,
    @javax.validation.constraints.NotNull
    override val occurredAt: String,
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    @javax.validation.constraints.NotNull
    override val user: UserTO
) extends CreatedRepositoryOrRestrictedContributionTO with ContributionTO {

    override def toString(): String = {
        Seq(
            "isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted),
            if (occurredAt != null) "occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CreatedRepositoryContributionTO]
        Objects.equals(isRestricted, that.isRestricted) &&
        Objects.equals(occurredAt, that.occurredAt) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(url, that.url) &&
        Objects.equals(user, that.user)
    }

    override def hashCode(): Int = {
        Objects.hash(isRestricted, occurredAt, repository, resourcePath, url, user)
    }
}

object CreatedRepositoryContributionTO {

    def builder(): CreatedRepositoryContributionTO.Builder = new Builder()

    class Builder {

        private var isRestricted: Boolean = _
        private var occurredAt: String = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var url: String = _
        private var user: UserTO = _

        def setIsRestricted(isRestricted: Boolean): Builder = {
            this.isRestricted = isRestricted
            this
        }

        def setOccurredAt(occurredAt: String): Builder = {
            this.occurredAt = occurredAt
            this
        }

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

        def setUser(user: UserTO): Builder = {
            this.user = user
            this
        }

        def build(): CreatedRepositoryContributionTO = new CreatedRepositoryContributionTO(isRestricted, occurredAt, repository, resourcePath, url, user)

    }
}
