package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for RepositoryInfo
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait RepositoryInfoResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def shortDescriptionHTML(repositoryInfoTO: RepositoryInfoTO, limit: Option[Int]): String

}
