package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Topic
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface TopicResolver {

    @Throws(Exception::class)
    fun relatedTopics(topicTO: TopicTO, first: Int?): List<TopicTO>

    @Throws(Exception::class)
    fun stargazers(topicTO: TopicTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: StarOrderTO?): StargazerConnectionTO

}
