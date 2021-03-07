package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Label
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface LabelResolver {

    @javax.validation.constraints.NotNull
    IssueConnectionTO issues(LabelTO labelTO, String after, String before, IssueFiltersTO filterBy, Integer first, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<IssueStateTO> states) throws Exception;

    @javax.validation.constraints.NotNull
    PullRequestConnectionTO pullRequests(LabelTO labelTO, String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) throws Exception;

}
