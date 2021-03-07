package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Issue
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface IssueResolver {

    @javax.validation.constraints.NotNull
    UserConnectionTO assignees(IssueTO issueTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    IssueCommentConnectionTO comments(IssueTO issueTO, String after, String before, Integer first, Integer last) throws Exception;

    LabelConnectionTO labels(IssueTO issueTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    UserConnectionTO participants(IssueTO issueTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ProjectCardConnectionTO projectCards(IssueTO issueTO, String after, java.util.List<ProjectCardArchivedStateTO> archivedStates, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ReactionConnectionTO reactions(IssueTO issueTO, String after, String before, ReactionContentTO content, Integer first, Integer last, ReactionOrderTO orderBy) throws Exception;

    @Deprecated
    @javax.validation.constraints.NotNull
    IssueTimelineConnectionTO timeline(IssueTO issueTO, String after, String before, Integer first, Integer last, String since) throws Exception;

    @javax.validation.constraints.NotNull
    IssueTimelineItemsConnectionTO timelineItems(IssueTO issueTO, String after, String before, Integer first, java.util.List<IssueTimelineItemsItemTypeTO> itemTypes, Integer last, String since, Integer skip) throws Exception;

    UserContentEditConnectionTO userContentEdits(IssueTO issueTO, String after, String before, Integer first, Integer last) throws Exception;

}
