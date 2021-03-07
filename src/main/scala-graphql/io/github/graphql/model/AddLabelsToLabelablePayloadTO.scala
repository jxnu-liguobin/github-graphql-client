package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddLabelsToLabelablePayloadTO(
    clientMutationId: String,
    labelable: LabelableTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (labelable != null) "labelable: " + GraphQLRequestSerializer.getEntry(labelable) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddLabelsToLabelablePayloadTO {

    def builder(): AddLabelsToLabelablePayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var labelable: LabelableTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setLabelable(labelable: LabelableTO): Builder = {
            this.labelable = labelable
            this
        }

        def build(): AddLabelsToLabelablePayloadTO = new AddLabelsToLabelablePayloadTO(clientMutationId, labelable)

    }
}
