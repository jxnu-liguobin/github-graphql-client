package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import SecurityAdvisoryIdentifierTypeTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityAdvisoryIdentifierFilterTO(
    @javax.validation.constraints.NotNull
    `type`: SecurityAdvisoryIdentifierTypeTO,
    @javax.validation.constraints.NotNull
    value: String
) {

    override def toString(): String = {
        Seq(
            if (`type` != null) "type: " + GraphQLRequestSerializer.getEntry(`type`) else "",
            if (value != null) "value: " + GraphQLRequestSerializer.getEntry(value) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SecurityAdvisoryIdentifierFilterTO {

    def builder(): SecurityAdvisoryIdentifierFilterTO.Builder = new Builder()

    class Builder {

        private var `type`: SecurityAdvisoryIdentifierTypeTO = _
        private var value: String = _

        def setType(`type`: SecurityAdvisoryIdentifierTypeTO): Builder = {
            this.`type` = `type`
            this
        }

        def setValue(value: String): Builder = {
            this.value = value
            this
        }

        def build(): SecurityAdvisoryIdentifierFilterTO = new SecurityAdvisoryIdentifierFilterTO(`type`, value)

    }
}
