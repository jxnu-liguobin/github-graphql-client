package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SecurityAdvisoryIdentifierTO(
    @javax.validation.constraints.NotNull
    `type`: String,
    @javax.validation.constraints.NotNull
    value: String
) {

    override def toString(): String = {
        Seq(
            if (`type` != null) "type: " + GraphQLRequestSerializer.getEntry(`type`) else "",
            if (value != null) "value: " + GraphQLRequestSerializer.getEntry(value) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SecurityAdvisoryIdentifierTO]
        Objects.equals(`type`, that.`type`) &&
        Objects.equals(value, that.value)
    }

    override def hashCode(): Int = {
        Objects.hash(`type`, value)
    }
}

object SecurityAdvisoryIdentifierTO {

    def builder(): SecurityAdvisoryIdentifierTO.Builder = new Builder()

    class Builder {

        private var `type`: String = _
        private var value: String = _

        def setType(`type`: String): Builder = {
            this.`type` = `type`
            this
        }

        def setValue(value: String): Builder = {
            this.value = value
            this
        }

        def build(): SecurityAdvisoryIdentifierTO = new SecurityAdvisoryIdentifierTO(`type`, value)

    }
}
