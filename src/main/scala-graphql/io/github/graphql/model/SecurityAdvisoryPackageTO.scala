package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import SecurityAdvisoryEcosystemTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityAdvisoryPackageTO(
    @javax.validation.constraints.NotNull
    ecosystem: SecurityAdvisoryEcosystemTO,
    @javax.validation.constraints.NotNull
    name: String
) {

    override def toString(): String = {
        Seq(
            if (ecosystem != null) "ecosystem: " + GraphQLRequestSerializer.getEntry(ecosystem) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SecurityAdvisoryPackageTO {

    def builder(): SecurityAdvisoryPackageTO.Builder = new Builder()

    class Builder {

        private var ecosystem: SecurityAdvisoryEcosystemTO = _
        private var name: String = _

        def setEcosystem(ecosystem: SecurityAdvisoryEcosystemTO): Builder = {
            this.ecosystem = ecosystem
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def build(): SecurityAdvisoryPackageTO = new SecurityAdvisoryPackageTO(ecosystem, name)

    }
}
