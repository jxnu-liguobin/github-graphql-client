package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object IssueTimelineItemsItemTypeTO extends Enumeration {

    type IssueTimelineItemsItemTypeTO = Value

    val ADDED_TO_PROJECT_EVENT: Value = Value("ADDED_TO_PROJECT_EVENT")
    val ASSIGNED_EVENT: Value = Value("ASSIGNED_EVENT")
    val CLOSED_EVENT: Value = Value("CLOSED_EVENT")
    val COMMENT_DELETED_EVENT: Value = Value("COMMENT_DELETED_EVENT")
    val CONVERTED_NOTE_TO_ISSUE_EVENT: Value = Value("CONVERTED_NOTE_TO_ISSUE_EVENT")
    val CROSS_REFERENCED_EVENT: Value = Value("CROSS_REFERENCED_EVENT")
    val DEMILESTONED_EVENT: Value = Value("DEMILESTONED_EVENT")
    val ISSUE_COMMENT: Value = Value("ISSUE_COMMENT")
    val LABELED_EVENT: Value = Value("LABELED_EVENT")
    val LOCKED_EVENT: Value = Value("LOCKED_EVENT")
    val MARKED_AS_DUPLICATE_EVENT: Value = Value("MARKED_AS_DUPLICATE_EVENT")
    val MENTIONED_EVENT: Value = Value("MENTIONED_EVENT")
    val MILESTONED_EVENT: Value = Value("MILESTONED_EVENT")
    val MOVED_COLUMNS_IN_PROJECT_EVENT: Value = Value("MOVED_COLUMNS_IN_PROJECT_EVENT")
    val PINNED_EVENT: Value = Value("PINNED_EVENT")
    val REFERENCED_EVENT: Value = Value("REFERENCED_EVENT")
    val REMOVED_FROM_PROJECT_EVENT: Value = Value("REMOVED_FROM_PROJECT_EVENT")
    val RENAMED_TITLE_EVENT: Value = Value("RENAMED_TITLE_EVENT")
    val REOPENED_EVENT: Value = Value("REOPENED_EVENT")
    val SUBSCRIBED_EVENT: Value = Value("SUBSCRIBED_EVENT")
    val TRANSFERRED_EVENT: Value = Value("TRANSFERRED_EVENT")
    val UNASSIGNED_EVENT: Value = Value("UNASSIGNED_EVENT")
    val UNLABELED_EVENT: Value = Value("UNLABELED_EVENT")
    val UNLOCKED_EVENT: Value = Value("UNLOCKED_EVENT")
    val UNPINNED_EVENT: Value = Value("UNPINNED_EVENT")
    val UNSUBSCRIBED_EVENT: Value = Value("UNSUBSCRIBED_EVENT")
    val USER_BLOCKED_EVENT: Value = Value("USER_BLOCKED_EVENT")

}

class IssueTimelineItemsItemTypeTOTypeRefer extends TypeReference[IssueTimelineItemsItemTypeTO.type]
