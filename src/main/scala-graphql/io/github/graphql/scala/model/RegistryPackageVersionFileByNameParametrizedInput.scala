package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field fileByName in type RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
case class RegistryPackageVersionFileByNameParametrizedInput(
    @javax.validation.constraints.NotNull
    filename: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (filename != null) "filename: " + GraphQLRequestSerializer.getEntry(filename) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
