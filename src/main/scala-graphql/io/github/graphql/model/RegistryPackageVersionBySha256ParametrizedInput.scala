package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field versionBySha256 in type RegistryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class RegistryPackageVersionBySha256ParametrizedInput(
    @javax.validation.constraints.NotNull
    sha256: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (sha256 != null) "sha256: " + GraphQLRequestSerializer.getEntry(sha256) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
