package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._

/**
 * Parametrized input for field versionByPlatform in type RegistryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
case class RegistryPackageVersionByPlatformParametrizedInput(
    @javax.validation.constraints.NotNull
    platform: String,
    @javax.validation.constraints.NotNull
    version: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (platform != null) "platform: " + GraphQLRequestSerializer.getEntry(platform) else "",
            if (version != null) "version: " + GraphQLRequestSerializer.getEntry(version) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
