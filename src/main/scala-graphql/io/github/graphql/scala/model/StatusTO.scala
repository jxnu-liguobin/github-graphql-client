package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import StatusStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[StatusTO]
        Objects.equals(commit, that.commit) &&
        Objects.equals(contexts, that.contexts) &&
        Objects.equals(id, that.id) &&
        Objects.equals(state, that.state)
    }

    override def hashCode(): Int = {
        Objects.hash(commit, contexts, id, state)
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
