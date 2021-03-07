package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import Seq[ProjectCardArchivedStateTO]._

/**
 * Resolver for ProjectColumn
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait ProjectColumnResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def cards(projectColumnTO: ProjectColumnTO, after: String, archivedStates: Seq[ProjectCardArchivedStateTO], before: String, first: Option[Int], last: Option[Int]): ProjectCardConnectionTO

}
