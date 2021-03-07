package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import StatusStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class StatusTO(
    commit: CommitTO,
    @javax.validation.constraints.NotNull
    contexts: Seq[StatusContextTO],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    state: StatusStateTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            if (contexts != null) "contexts: " + GraphQLRequestSerializer.getEntry(contexts.asJava) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object StatusTO {

    def builder(): StatusTO.Builder = new Builder()

    class Builder {

        private var commit: CommitTO = _
        private var contexts: Seq[StatusContextTO] = _
        private var id: String = _
        private var state: StatusStateTO = _

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setContexts(contexts: Seq[StatusContextTO]): Builder = {
            this.contexts = contexts
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setState(state: StatusStateTO): Builder = {
            this.state = state
            this
        }

        def build(): StatusTO = new StatusTO(commit, contexts, id, state)

    }
}
