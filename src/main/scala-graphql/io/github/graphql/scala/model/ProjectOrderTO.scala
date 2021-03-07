package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import OrderDirectionTO._
import ProjectOrderFieldTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class ProjectOrderTO(
    @javax.validation.constraints.NotNull
    direction: OrderDirectionTO,
    @javax.validation.constraints.NotNull
    field: ProjectOrderFieldTO
) {

    override def toString(): String = {
        Seq(
            if (direction != null) "direction: " + GraphQLRequestSerializer.getEntry(direction) else "",
            if (field != null) "field: " + GraphQLRequestSerializer.getEntry(field) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ProjectOrderTO]
        Objects.equals(direction, that.direction) &&
        Objects.equals(field, that.field)
    }

    override def hashCode(): Int = {
        Objects.hash(direction, field)
    }
}

object ProjectOrderTO {

    def builder(): ProjectOrderTO.Builder = new Builder()

    class Builder {

        private var direction: OrderDirectionTO = _
        private var field: ProjectOrderFieldTO = _

        def setDirection(direction: OrderDirectionTO): Builder = {
            this.direction = direction
            this
        }

        def setField(field: ProjectOrderFieldTO): Builder = {
            this.field = field
            this
        }

        def build(): ProjectOrderTO = new ProjectOrderTO(direction, field)

    }
}
