package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestRevisionMarkerTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    lastSeenCommit: CommitTO,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO
) extends PullRequestTimelineItemsTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (lastSeenCommit != null) "lastSeenCommit: " + GraphQLRequestSerializer.getEntry(lastSeenCommit) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object PullRequestRevisionMarkerTO {

    def builder(): PullRequestRevisionMarkerTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var lastSeenCommit: CommitTO = _
        private var pullRequest: PullRequestTO = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setLastSeenCommit(lastSeenCommit: CommitTO): Builder = {
            this.lastSeenCommit = lastSeenCommit
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def build(): PullRequestRevisionMarkerTO = new PullRequestRevisionMarkerTO(createdAt, lastSeenCommit, pullRequest)

    }
}
