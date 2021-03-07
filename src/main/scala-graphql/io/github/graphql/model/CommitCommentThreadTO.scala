package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitCommentThreadTO(
    @javax.validation.constraints.NotNull
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    path: String,
    position: Option[Int],
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO
) extends PullRequestTimelineItemTO with NodeTO with RepositoryNodeTO {

    override def toString(): String = {
        Seq(
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (path != null) "path: " + GraphQLRequestSerializer.getEntry(path) else "",
            if (position.isDefined) "position: " + GraphQLRequestSerializer.getEntry(position.get) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CommitCommentThreadTO {

    def builder(): CommitCommentThreadTO.Builder = new Builder()

    class Builder {

        private var commit: CommitTO = _
        private var id: String = _
        private var path: String = _
        private var position: Option[Int] = _
        private var repository: RepositoryTO = _

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setPath(path: String): Builder = {
            this.path = path
            this
        }

        def setPosition(position: Option[Int]): Builder = {
            this.position = position
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def build(): CommitCommentThreadTO = new CommitCommentThreadTO(commit, id, path, position, repository)

    }
}
