package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ExternalIdentitySamlAttributesTO(
    nameId: String
) {

    override def toString(): String = {
        Seq(
            if (nameId != null) "nameId: " + GraphQLRequestSerializer.getEntry(nameId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
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
