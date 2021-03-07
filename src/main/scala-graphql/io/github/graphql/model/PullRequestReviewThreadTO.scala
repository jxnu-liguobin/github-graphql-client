package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PullRequestReviewThreadTO(
    @javax.validation.constraints.NotNull
    override val id: String,
    isResolved: Boolean,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    resolvedBy: UserTO,
    viewerCanResolve: Boolean,
    viewerCanUnresolve: Boolean
) extends PullRequestTimelineItemsTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isResolved: " + GraphQLRequestSerializer.getEntry(isResolved),
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resolvedBy != null) "resolvedBy: " + GraphQLRequestSerializer.getEntry(resolvedBy) else "",
            "viewerCanResolve: " + GraphQLRequestSerializer.getEntry(viewerCanResolve),
            "viewerCanUnresolve: " + GraphQLRequestSerializer.getEntry(viewerCanUnresolve)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object PullRequestReviewThreadTO {

    def builder(): PullRequestReviewThreadTO.Builder = new Builder()

    class Builder {

        private var id: String = _
        private var isResolved: Boolean = _
        private var pullRequest: PullRequestTO = _
        private var repository: RepositoryTO = _
        private var resolvedBy: UserTO = _
        private var viewerCanResolve: Boolean = _
        private var viewerCanUnresolve: Boolean = _

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIsResolved(isResolved: Boolean): Builder = {
            this.isResolved = isResolved
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setResolvedBy(resolvedBy: UserTO): Builder = {
            this.resolvedBy = resolvedBy
            this
        }

        def setViewerCanResolve(viewerCanResolve: Boolean): Builder = {
            this.viewerCanResolve = viewerCanResolve
            this
        }

        def setViewerCanUnresolve(viewerCanUnresolve: Boolean): Builder = {
            this.viewerCanUnresolve = viewerCanUnresolve
            this
        }

        def build(): PullRequestReviewThreadTO = new PullRequestReviewThreadTO(id, isResolved, pullRequest, repository, resolvedBy, viewerCanResolve, viewerCanUnresolve)

    }
}
