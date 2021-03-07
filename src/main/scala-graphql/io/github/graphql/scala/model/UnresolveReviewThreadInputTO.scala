package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnresolveReviewThreadInputTO(
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnresolveReviewThreadInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(threadId, that.threadId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, threadId)
    }
}

object UnresolveReviewThreadInputTO {

    def builder(): UnresolveReviewThreadInputTO.Builder = new Builder()

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

        def build(): UnresolveReviewThreadInputTO = new UnresolveReviewThreadInputTO(clientMutationId, threadId)

    }
}
