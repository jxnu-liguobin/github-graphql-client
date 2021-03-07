package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LicenseRuleTO(
    @javax.validation.constraints.NotNull
    description: String,
    @javax.validation.constraints.NotNull
    key: String,
    @javax.validation.constraints.NotNull
    label: String
) {

    override def toString(): String = {
        Seq(
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            if (key != null) "key: " + GraphQLRequestSerializer.getEntry(key) else "",
            if (label != null) "label: " + GraphQLRequestSerializer.getEntry(label) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[LicenseRuleTO]
        Objects.equals(description, that.description) &&
        Objects.equals(key, that.key) &&
        Objects.equals(label, that.label)
    }

    override def hashCode(): Int = {
        Objects.hash(description, key, label)
    }
}

object LicenseRuleTO {

    def builder(): LicenseRuleTO.Builder = new Builder()

    class Builder {

        private var description: String = _
        private var key: String = _
        private var label: String = _

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setKey(key: String): Builder = {
            this.key = key
            this
        }

        def setLabel(label: String): Builder = {
            this.label = label
            this
        }

        def build(): LicenseRuleTO = new LicenseRuleTO(description, key, label)

    }
}
