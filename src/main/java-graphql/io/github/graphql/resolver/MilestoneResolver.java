package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Milestone
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface MilestoneResolver {

    @javax.validation.constraints.NotNull
    IssueConnectionTO issues(MilestoneTO milestoneTO, String after, String before, IssueFiltersTO filterBy, Integer first, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<IssueStateTO> states) throws Exception;

    @javax.validation.constraints.NotNull
    PullRequestConnectionTO pullRequests(MilestoneTO milestoneTO, String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) throws Exception;

}
