package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReferencedEventTO(
    actor: ActorTO,
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    commitRepository: RepositoryTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isCrossRepository: Boolean,
    isDirectReference: Boolean,
    @javax.validation.constraints.NotNull
    subject: ReferencedSubjectTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (commitRepository != null) "commitRepository: " + GraphQLRequestSerializer.getEntry(commitRepository) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository),
            "isDirectReference: " + GraphQLRequestSerializer.getEntry(isDirectReference),
            if (subject != null) "subject: " + GraphQLRequestSerializer.getEntry(subject) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReferencedEventTO {

    def builder(): ReferencedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var commit: CommitTO = _
        private var commitRepository: RepositoryTO = _
        private var createdAt: String = _
        private var id: String = _
        private var isCrossRepository: Boolean = _
        private var isDirectReference: Boolean = _
        private var subject: ReferencedSubjectTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setCommitRepository(commitRepository: RepositoryTO): Builder = {
            this.commitRepository = commitRepository
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

        def setIsCrossRepository(isCrossRepository: Boolean): Builder = {
            this.isCrossRepository = isCrossRepository
            this
        }

        def setIsDirectReference(isDirectReference: Boolean): Builder = {
            this.isDirectReference = isDirectReference
            this
        }

        def setSubject(subject: ReferencedSubjectTO): Builder = {
            this.subject = subject
            this
        }

        def build(): ReferencedEventTO = new ReferencedEventTO(actor, commit, commitRepository, createdAt, id, isCrossRepository, isDirectReference, subject)

    }
}
