package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for Bot
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait BotResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def avatarUrl(botTO: BotTO, size: Option[Int]): String

}
