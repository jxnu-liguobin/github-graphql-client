package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BaseRefForcePushedEventTO(
    actor: ActorTO,
    afterCommit: CommitTO,
    beforeCommit: CommitTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    ref: RefTO
) extends PullRequestTimelineItemsTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (afterCommit != null) "afterCommit: " + GraphQLRequestSerializer.getEntry(afterCommit) else "",
            if (beforeCommit != null) "beforeCommit: " + GraphQLRequestSerializer.getEntry(beforeCommit) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (ref != null) "ref: " + GraphQLRequestSerializer.getEntry(ref) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[BaseRefForcePushedEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(afterCommit, that.afterCommit) &&
        Objects.equals(beforeCommit, that.beforeCommit) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(pullRequest, that.pullRequest) &&
        Objects.equals(ref, that.ref)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, afterCommit, beforeCommit, createdAt, id, pullRequest, ref)
    }
}

object BaseRefForcePushedEventTO {

    def builder(): BaseRefForcePushedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var afterCommit: CommitTO = _
        private var beforeCommit: CommitTO = _
        private var createdAt: String = _
        private var id: String = _
        private var pullRequest: PullRequestTO = _
        private var ref: RefTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setAfterCommit(afterCommit: CommitTO): Builder = {
            this.afterCommit = afterCommit
            this
        }

        def setBeforeCommit(beforeCommit: CommitTO): Builder = {
            this.beforeCommit = beforeCommit
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

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def setRef(ref: RefTO): Builder = {
            this.ref = ref
            this
        }

        def build(): BaseRefForcePushedEventTO = new BaseRefForcePushedEventTO(actor, afterCommit, beforeCommit, createdAt, id, pullRequest, ref)

    }
}
