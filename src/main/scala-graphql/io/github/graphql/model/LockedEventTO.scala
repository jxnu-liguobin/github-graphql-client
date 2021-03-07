package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import LockReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LockedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    lockReason: LockReasonTO,
    @javax.validation.constraints.NotNull
    lockable: LockableTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (lockReason != null) "lockReason: " + GraphQLRequestSerializer.getEntry(lockReason) else "",
            if (lockable != null) "lockable: " + GraphQLRequestSerializer.getEntry(lockable) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object LockedEventTO {

    def builder(): LockedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var id: String = _
        private var lockReason: LockReasonTO = _
        private var lockable: LockableTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
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

        def setLockReason(lockReason: LockReasonTO): Builder = {
            this.lockReason = lockReason
            this
        }

        def setLockable(lockable: LockableTO): Builder = {
            this.lockable = lockable
            this
        }

        def build(): LockedEventTO = new LockedEventTO(actor, createdAt, id, lockReason, lockable)

    }
}
