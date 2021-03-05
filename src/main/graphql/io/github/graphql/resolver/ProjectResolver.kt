package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Project
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface ProjectResolver {

    @Throws(Exception::class)
    fun columns(projectTO: ProjectTO, after: String?, before: String?, first: Int?, last: Int?): ProjectColumnConnectionTO

    @Throws(Exception::class)
    fun pendingCards(projectTO: ProjectTO, after: String?, archivedStates: List<ProjectCardArchivedStateTO?>?, before: String?, first: Int?, last: Int?): ProjectCardConnectionTO

}
