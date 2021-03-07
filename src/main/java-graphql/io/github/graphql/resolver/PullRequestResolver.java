package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for PullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface PullRequestResolver {

    @javax.validation.constraints.NotNull
    UserConnectionTO assignees(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    IssueCommentConnectionTO comments(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    PullRequestCommitConnectionTO commits(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    PullRequestChangedFileConnectionTO files(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    LabelConnectionTO labels(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    UserConnectionTO participants(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectCardConnectionTO projectCards(PullRequestTO pullRequestTO, String after, java.util.List<ProjectCardArchivedStateTO> archivedStates, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ReactionConnectionTO reactions(PullRequestTO pullRequestTO, String after, String before, ReactionContentTO content, Integer first, Integer last, ReactionOrderTO orderBy) throws Exception;

    ReviewRequestConnectionTO reviewRequests(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    PullRequestReviewThreadConnectionTO reviewThreads(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

    PullRequestReviewConnectionTO reviews(PullRequestTO pullRequestTO, String after, String author, String before, Integer first, Integer last, java.util.List<PullRequestReviewStateTO> states) throws Exception;

    @Deprecated
    @javax.validation.constraints.NotNull
    PullRequestTimelineConnectionTO timeline(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last, String since) throws Exception;

    @javax.validation.constraints.NotNull
    PullRequestTimelineItemsConnectionTO timelineItems(PullRequestTO pullRequestTO, String after, String before, Integer first, java.util.List<PullRequestTimelineItemsItemTypeTO> itemTypes, Integer last, String since, Integer skip) throws Exception;

    UserContentEditConnectionTO userContentEdits(PullRequestTO pullRequestTO, String after, String before, Integer first, Integer last) throws Exception;

}
