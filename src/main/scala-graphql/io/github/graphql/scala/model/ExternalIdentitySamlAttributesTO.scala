package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ExternalIdentitySamlAttributesTO(
    nameId: String
) {

    override def toString(): String = {
        Seq(
            if (nameId != null) "nameId: " + GraphQLRequestSerializer.getEntry(nameId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ExternalIdentitySamlAttributesTO]
        Objects.equals(nameId, that.nameId)
    }

    override def hashCode(): Int = {
        Objects.hash(nameId)
    }
}

object ExternalIdentitySamlAttributesTO {

    def builder(): ExternalIdentitySamlAttributesTO.Builder = new Builder()

    class Builder {

        private var nameId: String = _

        def setNameId(nameId: String): Builder = {
            this.nameId = nameId
            this
        }

        def build(): ExternalIdentitySamlAttributesTO = new ExternalIdentitySamlAttributesTO(nameId)

    }
}
