package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RemoveReactionPayloadTO(
    clientMutationId: String,
    reaction: ReactionTO,
    subject: ReactableTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (reaction != null) "reaction: " + GraphQLRequestSerializer.getEntry(reaction) else "",
            if (subject != null) "subject: " + GraphQLRequestSerializer.getEntry(subject) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RemoveReactionPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(reaction, that.reaction) &&
        Objects.equals(subject, that.subject)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, reaction, subject)
    }
}

object RemoveReactionPayloadTO {

    def builder(): RemoveReactionPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var reaction: ReactionTO = _
        private var subject: ReactableTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setReaction(reaction: ReactionTO): Builder = {
            this.reaction = reaction
            this
        }

        def setSubject(subject: ReactableTO): Builder = {
            this.subject = subject
            this
        }

        def build(): RemoveReactionPayloadTO = new RemoveReactionPayloadTO(clientMutationId, reaction, subject)

    }
}
