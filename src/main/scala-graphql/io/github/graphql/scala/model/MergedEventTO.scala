package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MergedEventTO(
    actor: ActorTO,
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    mergeRef: RefTO,
    @javax.validation.constraints.NotNull
    mergeRefName: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    override val url: String
) extends PullRequestTimelineItemsTO with PullRequestTimelineItemTO with UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (mergeRef != null) "mergeRef: " + GraphQLRequestSerializer.getEntry(mergeRef) else "",
            if (mergeRefName != null) "mergeRefName: " + GraphQLRequestSerializer.getEntry(mergeRefName) else "",
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
        val that = obj.asInstanceOf[MergedEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(commit, that.commit) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mergeRef, that.mergeRef) &&
        Objects.equals(mergeRefName, that.mergeRefName) &&
        Objects.equals(pullRequest, that.pullRequest) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, commit, createdAt, id, mergeRef, mergeRefName, pullRequest, resourcePath, url)
    }
}

object MergedEventTO {

    def builder(): MergedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var commit: CommitTO = _
        private var createdAt: String = _
        private var id: String = _
        private var mergeRef: RefTO = _
        private var mergeRefName: String = _
        private var pullRequest: PullRequestTO = _
        private var resourcePath: String = _
        private var url: String = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setMergeRef(mergeRef: RefTO): Builder = {
            this.mergeRef = mergeRef
            this
        }

        def setMergeRefName(mergeRefName: String): Builder = {
            this.mergeRefName = mergeRefName
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

        def build(): MergedEventTO = new MergedEventTO(actor, commit, createdAt, id, mergeRef, mergeRefName, pullRequest, resourcePath, url)

    }
}
