package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Topic
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface TopicResolver {

    @javax.validation.constraints.NotNull
    java.util.List<TopicTO> relatedTopics(TopicTO topicTO, Integer first) throws Exception;

    @javax.validation.constraints.NotNull
    StargazerConnectionTO stargazers(TopicTO topicTO, String after, String before, Integer first, Integer last, StarOrderTO orderBy) throws Exception;

}
