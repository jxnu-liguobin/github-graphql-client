package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Project
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface ProjectResolver {

    @Throws(Exception::class)
    fun columns(projectTO: ProjectTO, after: String?, before: String?, first: Int?, last: Int?): ProjectColumnConnectionTO

    @Throws(Exception::class)
    fun pendingCards(projectTO: ProjectTO, after: String?, archivedStates: List<ProjectCardArchivedStateTO?>?, before: String?, first: Int?, last: Int?): ProjectCardConnectionTO

}
