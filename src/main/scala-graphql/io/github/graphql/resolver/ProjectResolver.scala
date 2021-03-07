package io.github.graphql.resolver

import io.github.graphql.model._
import Seq[ProjectCardArchivedStateTO]._

/**
 * Resolver for Project
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait ProjectResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def columns(projectTO: ProjectTO, after: String, before: String, first: Option[Int], last: Option[Int]): ProjectColumnConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pendingCards(projectTO: ProjectTO, after: String, archivedStates: Seq[ProjectCardArchivedStateTO], before: String, first: Option[Int], last: Option[Int]): ProjectCardConnectionTO

}
