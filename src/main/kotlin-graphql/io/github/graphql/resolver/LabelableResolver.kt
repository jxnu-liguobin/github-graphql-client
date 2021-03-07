package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Labelable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface LabelableResolver {

    @Throws(Exception::class)
    fun labels(labelableTO: LabelableTO, after: String?, before: String?, first: Int?, last: Int?): LabelConnectionTO?

}
