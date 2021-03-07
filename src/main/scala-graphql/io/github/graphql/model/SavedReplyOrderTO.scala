package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import OrderDirectionTO._
import SavedReplyOrderFieldTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SavedReplyOrderTO(
    @javax.validation.constraints.NotNull
    direction: OrderDirectionTO,
    @javax.validation.constraints.NotNull
    field: SavedReplyOrderFieldTO
) {

    override def toString(): String = {
        Seq(
            if (direction != null) "direction: " + GraphQLRequestSerializer.getEntry(direction) else "",
            if (field != null) "field: " + GraphQLRequestSerializer.getEntry(field) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SavedReplyOrderTO {

    def builder(): SavedReplyOrderTO.Builder = new Builder()

    class Builder {

        private var direction: OrderDirectionTO = _
        private var field: SavedReplyOrderFieldTO = _

        def setDirection(direction: OrderDirectionTO): Builder = {
            this.direction = direction
            this
        }

        def setField(field: SavedReplyOrderFieldTO): Builder = {
            this.field = field
            this
        }

        def build(): SavedReplyOrderTO = new SavedReplyOrderTO(direction, field)

    }
}
