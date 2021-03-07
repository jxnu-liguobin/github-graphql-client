package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Bot
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface BotResolver {

    @javax.validation.constraints.NotNull
    String avatarUrl(BotTO botTO, Integer size) throws Exception;

}
