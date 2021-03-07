package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Topic
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface TopicResolver {

    @Throws(Exception::class)
    fun relatedTopics(topicTO: TopicTO, first: Int?): List<TopicTO>

    @Throws(Exception::class)
    fun stargazers(topicTO: TopicTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: StarOrderTO?): StargazerConnectionTO

}
