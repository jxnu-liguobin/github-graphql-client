package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MergeBranchPayloadTO(
    clientMutationId: String,
    mergeCommit: CommitTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (mergeCommit != null) "mergeCommit: " + GraphQLRequestSerializer.getEntry(mergeCommit) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MergeBranchPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(mergeCommit, that.mergeCommit)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, mergeCommit)
    }
}

object MergeBranchPayloadTO {

    def builder(): MergeBranchPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var mergeCommit: CommitTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setMergeCommit(mergeCommit: CommitTO): Builder = {
            this.mergeCommit = mergeCommit
            this
        }

        def build(): MergeBranchPayloadTO = new MergeBranchPayloadTO(clientMutationId, mergeCommit)

    }
}
