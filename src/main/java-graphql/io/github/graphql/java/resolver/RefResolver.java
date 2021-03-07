package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Ref
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface RefResolver {

    @javax.validation.constraints.NotNull
    PullRequestConnectionTO associatedPullRequests(RefTO refTO, String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) throws Exception;

}
