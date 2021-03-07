package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import OrderDirectionTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SponsorshipOrderTO]
        Objects.equals(direction, that.direction)
    }

    override def hashCode(): Int = {
        Objects.hash(direction)
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
