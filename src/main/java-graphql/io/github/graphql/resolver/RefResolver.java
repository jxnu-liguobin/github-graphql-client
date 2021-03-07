package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Ref
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface RefResolver {

    @javax.validation.constraints.NotNull
    PullRequestConnectionTO associatedPullRequests(RefTO refTO, String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) throws Exception;

}
