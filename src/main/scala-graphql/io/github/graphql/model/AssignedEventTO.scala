package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AssignedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    assignable: AssignableTO,
    assignee: AssigneeTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
    user: UserTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (assignable != null) "assignable: " + GraphQLRequestSerializer.getEntry(assignable) else "",
            if (assignee != null) "assignee: " + GraphQLRequestSerializer.getEntry(assignee) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AssignedEventTO {

    def builder(): AssignedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var assignable: AssignableTO = _
        private var assignee: AssigneeTO = _
        private var createdAt: String = _
        private var id: String = _
        private var user: UserTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setAssignable(assignable: AssignableTO): Builder = {
            this.assignable = assignable
            this
        }

        def setAssignee(assignee: AssigneeTO): Builder = {
            this.assignee = assignee
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

        @deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
        def setUser(user: UserTO): Builder = {
            this.user = user
            this
        }

        def build(): AssignedEventTO = new AssignedEventTO(actor, assignable, assignee, createdAt, id, user)

    }
}
