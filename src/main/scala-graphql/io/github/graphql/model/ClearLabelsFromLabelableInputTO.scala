package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ClearLabelsFromLabelableInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    labelableId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (labelableId != null) "labelableId: " + GraphQLRequestSerializer.getEntry(labelableId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ClearLabelsFromLabelableInputTO {

    def builder(): ClearLabelsFromLabelableInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var labelableId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setLabelableId(labelableId: String): Builder = {
            this.labelableId = labelableId
            this
        }

        def build(): ClearLabelsFromLabelableInputTO = new ClearLabelsFromLabelableInputTO(clientMutationId, labelableId)

    }
}
