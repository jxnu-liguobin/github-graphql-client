package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddReactionPayloadTO(
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
}

object AddReactionPayloadTO {

    def builder(): AddReactionPayloadTO.Builder = new Builder()

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

        def build(): AddReactionPayloadTO = new AddReactionPayloadTO(clientMutationId, reaction, subject)

    }
}
