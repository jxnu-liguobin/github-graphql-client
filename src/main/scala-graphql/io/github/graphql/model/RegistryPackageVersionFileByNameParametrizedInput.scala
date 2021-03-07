package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field fileByName in type RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
