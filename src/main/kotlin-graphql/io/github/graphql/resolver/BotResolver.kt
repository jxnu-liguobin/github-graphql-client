package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Bot
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface BotResolver {

    @Throws(Exception::class)
    fun avatarUrl(botTO: BotTO, size: Int?): String

}
