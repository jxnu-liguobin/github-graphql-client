package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityAdvisoryPackageVersionTO(
    @javax.validation.constraints.NotNull
    identifier: String
) {

    override def toString(): String = {
        Seq(
            if (identifier != null) "identifier: " + GraphQLRequestSerializer.getEntry(identifier) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SecurityAdvisoryPackageVersionTO {

    def builder(): SecurityAdvisoryPackageVersionTO.Builder = new Builder()

    class Builder {

        private var identifier: String = _

        def setIdentifier(identifier: String): Builder = {
            this.identifier = identifier
            this
        }

        def build(): SecurityAdvisoryPackageVersionTO = new SecurityAdvisoryPackageVersionTO(identifier)

    }
}
