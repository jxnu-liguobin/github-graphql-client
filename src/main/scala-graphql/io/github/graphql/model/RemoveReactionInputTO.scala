package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import ReactionContentTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveReactionInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    content: ReactionContentTO,
    @javax.validation.constraints.NotNull
    subjectId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (content != null) "content: " + GraphQLRequestSerializer.getEntry(content) else "",
            if (subjectId != null) "subjectId: " + GraphQLRequestSerializer.getEntry(subjectId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RemoveReactionInputTO {

    def builder(): RemoveReactionInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var content: ReactionContentTO = _
        private var subjectId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setContent(content: ReactionContentTO): Builder = {
            this.content = content
            this
        }

        def setSubjectId(subjectId: String): Builder = {
            this.subjectId = subjectId
            this
        }

        def build(): RemoveReactionInputTO = new RemoveReactionInputTO(clientMutationId, content, subjectId)

    }
}
