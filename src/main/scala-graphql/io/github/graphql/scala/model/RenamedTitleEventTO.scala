package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RenamedTitleEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    currentTitle: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    previousTitle: String,
    @javax.validation.constraints.NotNull
    subject: RenamedTitleSubjectTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (currentTitle != null) "currentTitle: " + GraphQLRequestSerializer.getEntry(currentTitle) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (previousTitle != null) "previousTitle: " + GraphQLRequestSerializer.getEntry(previousTitle) else "",
            if (subject != null) "subject: " + GraphQLRequestSerializer.getEntry(subject) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RenamedTitleEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currentTitle, that.currentTitle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(previousTitle, that.previousTitle) &&
        Objects.equals(subject, that.subject)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, createdAt, currentTitle, id, previousTitle, subject)
    }
}

object RenamedTitleEventTO {

    def builder(): RenamedTitleEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var currentTitle: String = _
        private var id: String = _
        private var previousTitle: String = _
        private var subject: RenamedTitleSubjectTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setCurrentTitle(currentTitle: String): Builder = {
            this.currentTitle = currentTitle
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setPreviousTitle(previousTitle: String): Builder = {
            this.previousTitle = previousTitle
            this
        }

        def setSubject(subject: RenamedTitleSubjectTO): Builder = {
            this.subject = subject
            this
        }

        def build(): RenamedTitleEventTO = new RenamedTitleEventTO(actor, createdAt, currentTitle, id, previousTitle, subject)

    }
}
