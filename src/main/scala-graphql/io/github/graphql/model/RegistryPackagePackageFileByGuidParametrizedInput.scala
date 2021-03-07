package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field packageFileByGuid in type RegistryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class RegistryPackagePackageFileByGuidParametrizedInput(
    @javax.validation.constraints.NotNull
    guid: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (guid != null) "guid: " + GraphQLRequestSerializer.getEntry(guid) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
