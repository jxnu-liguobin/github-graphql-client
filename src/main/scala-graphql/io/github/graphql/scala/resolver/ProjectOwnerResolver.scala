package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import Seq[ProjectStateTO]._

/**
 * Resolver for ProjectOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait ProjectOwnerResolver {

    @throws[Exception]
    def project(projectOwnerTO: ProjectOwnerTO, number: Int): ProjectTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def projects(projectOwnerTO: ProjectOwnerTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: ProjectOrderTO, search: String, states: Seq[ProjectStateTO]): ProjectConnectionTO

}
