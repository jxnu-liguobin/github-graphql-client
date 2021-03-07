package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Topic
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait TopicResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def relatedTopics(topicTO: TopicTO, first: Option[Int]): Seq[TopicTO]

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def stargazers(topicTO: TopicTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: StarOrderTO): StargazerConnectionTO

}
