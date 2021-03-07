package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestCommitTO(
    @javax.validation.constraints.NotNull
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    override val url: String
) extends PullRequestTimelineItemsTO with UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
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
        val that = obj.asInstanceOf[PullRequestCommitTO]
        Objects.equals(commit, that.commit) &&
        Objects.equals(id, that.id) &&
        Objects.equals(pullRequest, that.pullRequest) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(commit, id, pullRequest, resourcePath, url)
    }
}

object PullRequestCommitTO {

    def builder(): PullRequestCommitTO.Builder = new Builder()

    class Builder {

        private var commit: CommitTO = _
        private var id: String = _
        private var pullRequest: PullRequestTO = _
        private var resourcePath: String = _
        private var url: String = _

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
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

        def build(): PullRequestCommitTO = new PullRequestCommitTO(commit, id, pullRequest, resourcePath, url)

    }
}
