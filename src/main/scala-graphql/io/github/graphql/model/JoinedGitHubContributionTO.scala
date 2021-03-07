package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class JoinedGitHubContributionTO(
    override val isRestricted: Boolean,
    @javax.validation.constraints.NotNull
    override val occurredAt: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    @javax.validation.constraints.NotNull
    override val user: UserTO
) extends ContributionTO {

    override def toString(): String = {
        Seq(
            "isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted),
            if (occurredAt != null) "occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object JoinedGitHubContributionTO {

    def builder(): JoinedGitHubContributionTO.Builder = new Builder()

    class Builder {

        private var isRestricted: Boolean = _
        private var occurredAt: String = _
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

        def build(): JoinedGitHubContributionTO = new JoinedGitHubContributionTO(isRestricted, occurredAt, resourcePath, url, user)

    }
}
