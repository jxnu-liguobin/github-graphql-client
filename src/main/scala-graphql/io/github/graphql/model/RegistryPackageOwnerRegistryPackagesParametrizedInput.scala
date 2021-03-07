package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import scala.collection.JavaConverters._
import RegistryPackageTypeTO._

/**
 * Parametrized input for field registryPackages in type RegistryPackageOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
case class RegistryPackageOwnerRegistryPackagesParametrizedInput(
    after: String,
    before: String,
    first: Option[Int],
    last: Option[Int],
    name: String,
    names: Seq[String],
    packageType: RegistryPackageTypeTO,
    publicOnly: Option[Boolean] = Some(false),
    registryPackageType: String,
    repositoryId: String
) extends GraphQLParametrizedInput {

    override def toString(): String = {
        Seq(
            if (after != null) "after: " + GraphQLRequestSerializer.getEntry(after) else "",
            if (before != null) "before: " + GraphQLRequestSerializer.getEntry(before) else "",
            if (first.isDefined) "first: " + GraphQLRequestSerializer.getEntry(first.get) else "",
            if (last.isDefined) "last: " + GraphQLRequestSerializer.getEntry(last.get) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (names != null) "names: " + GraphQLRequestSerializer.getEntry(names.asJava) else "",
            if (packageType != null) "packageType: " + GraphQLRequestSerializer.getEntry(packageType) else "",
            if (publicOnly.isDefined) "publicOnly: " + GraphQLRequestSerializer.getEntry(publicOnly.get) else "",
            if (registryPackageType != null) "registryPackageType: " + GraphQLRequestSerializer.getEntry(registryPackageType) else "",
            if (repositoryId != null) "repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId) else ""
        ).filter(_ != "").mkString("(", ",", ")")
    }

}
