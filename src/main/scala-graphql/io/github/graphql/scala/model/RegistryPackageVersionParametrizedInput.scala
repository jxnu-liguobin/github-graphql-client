package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field version in type RegistryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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
