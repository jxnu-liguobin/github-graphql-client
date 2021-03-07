package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
