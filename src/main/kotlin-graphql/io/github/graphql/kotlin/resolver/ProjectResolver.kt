package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Project
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
interface ProjectResolver {

    @Throws(Exception::class)
    fun columns(projectTO: ProjectTO, after: String?, before: String?, first: Int?, last: Int?): ProjectColumnConnectionTO

    @Throws(Exception::class)
    fun pendingCards(projectTO: ProjectTO, after: String?, archivedStates: List<ProjectCardArchivedStateTO?>?, before: String?, first: Int?, last: Int?): ProjectCardConnectionTO

}
