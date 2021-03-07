package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for GistFile
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
interface GistFileResolver {

    @Throws(Exception::class)
    fun text(gistFileTO: GistFileTO, truncate: Int?): String?

}
