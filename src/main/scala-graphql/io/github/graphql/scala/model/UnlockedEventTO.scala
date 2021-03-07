package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UnlockedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    lockable: LockableTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (lockable != null) "lockable: " + GraphQLRequestSerializer.getEntry(lockable) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnlockedEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lockable, that.lockable)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, createdAt, id, lockable)
    }
}

object UnlockedEventTO {

    def builder(): UnlockedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var id: String = _
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

        def setLockable(lockable: LockableTO): Builder = {
            this.lockable = lockable
            this
        }

        def build(): UnlockedEventTO = new UnlockedEventTO(actor, createdAt, id, lockable)

    }
}
