package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedIssueContributionTO(
    override val isRestricted: Boolean,
    @javax.validation.constraints.NotNull
    issue: IssueTO,
    @javax.validation.constraints.NotNull
    override val occurredAt: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    @javax.validation.constraints.NotNull
    override val user: UserTO
) extends CreatedIssueOrRestrictedContributionTO with ContributionTO {

    override def toString(): String = {
        Seq(
            "isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted),
            if (issue != null) "issue: " + GraphQLRequestSerializer.getEntry(issue) else "",
            if (occurredAt != null) "occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreatedIssueContributionTO {

    def builder(): CreatedIssueContributionTO.Builder = new Builder()

    class Builder {

        private var isRestricted: Boolean = _
        private var issue: IssueTO = _
        private var occurredAt: String = _
        private var resourcePath: String = _
        private var url: String = _
        private var user: UserTO = _

        def setIsRestricted(isRestricted: Boolean): Builder = {
            this.isRestricted = isRestricted
            this
        }

        def setIssue(issue: IssueTO): Builder = {
            this.issue = issue
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

        def build(): CreatedIssueContributionTO = new CreatedIssueContributionTO(isRestricted, issue, occurredAt, resourcePath, url, user)

    }
}
