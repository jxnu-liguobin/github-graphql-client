package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MergeBranchInputTO(
    @javax.validation.constraints.NotNull
    base: String,
    clientMutationId: String,
    commitMessage: String,
    @javax.validation.constraints.NotNull
    head: String,
    @javax.validation.constraints.NotNull
    repositoryId: String
) {

    override def toString(): String = {
        Seq(
            if (base != null) "base: " + GraphQLRequestSerializer.getEntry(base) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (commitMessage != null) "commitMessage: " + GraphQLRequestSerializer.getEntry(commitMessage) else "",
            if (head != null) "head: " + GraphQLRequestSerializer.getEntry(head) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MergeBranchInputTO {

    def builder(): MergeBranchInputTO.Builder = new Builder()

    class Builder {

        private var base: String = _
        private var clientMutationId: String = _
        private var commitMessage: String = _
        private var head: String = _
        private var repositoryId: String = _

        def setBase(base: String): Builder = {
            this.base = base
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setCommitMessage(commitMessage: String): Builder = {
            this.commitMessage = commitMessage
            this
        }

        def setHead(head: String): Builder = {
            this.head = head
            this
        }

        def setRepositoryId(repositoryId: String): Builder = {
            this.repositoryId = repositoryId
            this
        }

        def build(): MergeBranchInputTO = new MergeBranchInputTO(base, clientMutationId, commitMessage, head, repositoryId)

    }
}
