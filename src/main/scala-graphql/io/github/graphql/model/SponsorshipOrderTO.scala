package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import OrderDirectionTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SponsorshipOrderTO(
    @javax.validation.constraints.NotNull
    direction: OrderDirectionTO
) {

    override def toString(): String = {
        Seq(
            if (direction != null) "direction: " + GraphQLRequestSerializer.getEntry(direction) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SponsorshipOrderTO {

    def builder(): SponsorshipOrderTO.Builder = new Builder()

    class Builder {

        private var direction: OrderDirectionTO = _

        def setDirection(direction: OrderDirectionTO): Builder = {
            this.direction = direction
            this
        }

        def build(): SponsorshipOrderTO = new SponsorshipOrderTO(direction)

    }
}
