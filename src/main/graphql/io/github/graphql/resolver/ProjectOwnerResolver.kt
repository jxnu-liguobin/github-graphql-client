package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for ProjectOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface ProjectOwnerResolver {

    @Throws(Exception::class)
    fun project(projectOwnerTO: ProjectOwnerTO, number: Int): ProjectTO?

    @Throws(Exception::class)
    fun projects(projectOwnerTO: ProjectOwnerTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ProjectOrderTO?, search: String?, states: List<ProjectStateTO>?): ProjectConnectionTO

}
