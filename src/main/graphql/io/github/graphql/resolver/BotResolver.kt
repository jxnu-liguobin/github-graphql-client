package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Bot
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface BotResolver {

    @Throws(Exception::class)
    fun avatarUrl(botTO: BotTO, size: Int?): String

}
