package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for GistFile
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface GistFileResolver {

    @Throws(Exception::class)
    fun text(gistFileTO: GistFileTO, truncate: Int?): String?

}
