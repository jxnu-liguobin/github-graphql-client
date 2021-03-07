package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
