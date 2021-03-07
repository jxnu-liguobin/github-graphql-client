package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Bot
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface BotResolver {

    @javax.validation.constraints.NotNull
    String avatarUrl(BotTO botTO, Integer size) throws Exception;

}
