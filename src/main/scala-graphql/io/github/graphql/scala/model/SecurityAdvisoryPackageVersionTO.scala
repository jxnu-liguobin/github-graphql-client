package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SecurityAdvisoryPackageVersionTO]
        Objects.equals(identifier, that.identifier)
    }

    override def hashCode(): Int = {
        Objects.hash(identifier)
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
