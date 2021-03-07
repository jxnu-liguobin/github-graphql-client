package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ResolveReviewThreadInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    threadId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (threadId != null) "threadId: " + GraphQLRequestSerializer.getEntry(threadId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ResolveReviewThreadInputTO {

    def builder(): ResolveReviewThreadInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var threadId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setThreadId(threadId: String): Builder = {
            this.threadId = threadId
            this
        }

        def build(): ResolveReviewThreadInputTO = new ResolveReviewThreadInputTO(clientMutationId, threadId)

    }
}
