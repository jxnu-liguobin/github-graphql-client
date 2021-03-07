package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field version in type RegistryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class RegistryPackageVersionParametrizedInput(
    @javax.validation.constraints.NotNull
    version: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (version != null) "version: " + GraphQLRequestSerializer.getEntry(version) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
