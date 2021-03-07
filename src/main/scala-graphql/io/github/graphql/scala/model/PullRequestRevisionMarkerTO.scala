package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PullRequestRevisionMarkerTO]
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(lastSeenCommit, that.lastSeenCommit) &&
        Objects.equals(pullRequest, that.pullRequest)
    }

    override def hashCode(): Int = {
        Objects.hash(createdAt, lastSeenCommit, pullRequest)
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
