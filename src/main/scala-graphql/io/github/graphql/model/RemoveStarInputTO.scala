package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveStarInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    starrableId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (starrableId != null) "starrableId: " + GraphQLRequestSerializer.getEntry(starrableId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RemoveStarInputTO {

    def builder(): RemoveStarInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var starrableId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setStarrableId(starrableId: String): Builder = {
            this.starrableId = starrableId
            this
        }

        def build(): RemoveStarInputTO = new RemoveStarInputTO(clientMutationId, starrableId)

    }
}
