package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Issue
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class IssueResponseProjection extends GraphQLResponseProjection {

    public IssueResponseProjection() {
    }

    @Override
    public IssueResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueResponseProjection all$(int maxDepth) {
        this.activeLockReason();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.UserConnectionResponseProjection.assignees", projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1);
            this.assignees(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        this.body();
        this.bodyHTML();
        this.bodyText();
        this.closed();
        this.closedAt();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new IssueCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0)));
        }
        this.createdAt();
        this.createdViaEmail();
        this.databaseId();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1);
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0)));
        }
        this.lastEditedAt();
        this.locked();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.MilestoneResponseProjection.milestone", projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0) + 1);
            this.milestone(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0)));
        }
        this.number();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.UserConnectionResponseProjection.participants", projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0) + 1);
            this.participants(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) + 1);
            this.projectCards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0)));
        }
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1);
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1);
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.state();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0) + 1);
            this.timeline(new IssueTimelineConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0) + 1);
            this.timelineItems(new IssueTimelineItemsConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0)));
        }
        this.title();
        this.updatedAt();
        this.url();
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
        }
        this.viewerCanReact();
        this.viewerCanSubscribe();
        this.viewerCanUpdate();
        this.viewerCannotUpdateReasons();
        this.viewerDidAuthor();
        this.viewerSubscription();
        this.typename();
        return this;
    }

    public IssueResponseProjection activeLockReason() {
        return activeLockReason(null);
    }

    public IssueResponseProjection activeLockReason(String alias) {
        fields.add(new GraphQLResponseField("activeLockReason").alias(alias));
        return this;
    }

    public IssueResponseProjection assignees(UserConnectionResponseProjection subProjection) {
        return assignees((String)null, subProjection);
    }

    public IssueResponseProjection assignees(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignees").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection assignees(IssueAssigneesParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return assignees(null, input, subProjection);
    }

    public IssueResponseProjection assignees(String alias, IssueAssigneesParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public IssueResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public IssueResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public IssueResponseProjection body() {
        return body(null);
    }

    public IssueResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public IssueResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public IssueResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public IssueResponseProjection bodyText() {
        return bodyText(null);
    }

    public IssueResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public IssueResponseProjection closed() {
        return closed(null);
    }

    public IssueResponseProjection closed(String alias) {
        fields.add(new GraphQLResponseField("closed").alias(alias));
        return this;
    }

    public IssueResponseProjection closedAt() {
        return closedAt(null);
    }

    public IssueResponseProjection closedAt(String alias) {
        fields.add(new GraphQLResponseField("closedAt").alias(alias));
        return this;
    }

    public IssueResponseProjection comments(IssueCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public IssueResponseProjection comments(String alias, IssueCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection comments(IssueCommentsParametrizedInput input, IssueCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public IssueResponseProjection comments(String alias, IssueCommentsParametrizedInput input, IssueCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection createdAt() {
        return createdAt(null);
    }

    public IssueResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public IssueResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public IssueResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public IssueResponseProjection databaseId() {
        return databaseId(null);
    }

    public IssueResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public IssueResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public IssueResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection id() {
        return id(null);
    }

    public IssueResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public IssueResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public IssueResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public IssueResponseProjection labels(LabelConnectionResponseProjection subProjection) {
        return labels((String)null, subProjection);
    }

    public IssueResponseProjection labels(String alias, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection labels(IssueLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        return labels(null, input, subProjection);
    }

    public IssueResponseProjection labels(String alias, IssueLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public IssueResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public IssueResponseProjection locked() {
        return locked(null);
    }

    public IssueResponseProjection locked(String alias) {
        fields.add(new GraphQLResponseField("locked").alias(alias));
        return this;
    }

    public IssueResponseProjection milestone(MilestoneResponseProjection subProjection) {
        return milestone(null, subProjection);
    }

    public IssueResponseProjection milestone(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("milestone").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection number() {
        return number(null);
    }

    public IssueResponseProjection number(String alias) {
        fields.add(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public IssueResponseProjection participants(UserConnectionResponseProjection subProjection) {
        return participants((String)null, subProjection);
    }

    public IssueResponseProjection participants(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("participants").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection participants(IssueParticipantsParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return participants(null, input, subProjection);
    }

    public IssueResponseProjection participants(String alias, IssueParticipantsParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("participants").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection projectCards(ProjectCardConnectionResponseProjection subProjection) {
        return projectCards((String)null, subProjection);
    }

    public IssueResponseProjection projectCards(String alias, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection projectCards(IssueProjectCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        return projectCards(null, input, subProjection);
    }

    public IssueResponseProjection projectCards(String alias, IssueProjectCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public IssueResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public IssueResponseProjection reactionGroups(ReactionGroupResponseProjection subProjection) {
        return reactionGroups(null, subProjection);
    }

    public IssueResponseProjection reactionGroups(String alias, ReactionGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection reactions(ReactionConnectionResponseProjection subProjection) {
        return reactions((String)null, subProjection);
    }

    public IssueResponseProjection reactions(String alias, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection reactions(IssueReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        return reactions(null, input, subProjection);
    }

    public IssueResponseProjection reactions(String alias, IssueReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public IssueResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public IssueResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public IssueResponseProjection state() {
        return state(null);
    }

    public IssueResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    @Deprecated
    public IssueResponseProjection timeline(IssueTimelineConnectionResponseProjection subProjection) {
        return timeline((String)null, subProjection);
    }

    public IssueResponseProjection timeline(String alias, IssueTimelineConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timeline").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection timeline(IssueTimelineParametrizedInput input, IssueTimelineConnectionResponseProjection subProjection) {
        return timeline(null, input, subProjection);
    }

    public IssueResponseProjection timeline(String alias, IssueTimelineParametrizedInput input, IssueTimelineConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timeline").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection timelineItems(IssueTimelineItemsConnectionResponseProjection subProjection) {
        return timelineItems((String)null, subProjection);
    }

    public IssueResponseProjection timelineItems(String alias, IssueTimelineItemsConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection timelineItems(IssueTimelineItemsParametrizedInput input, IssueTimelineItemsConnectionResponseProjection subProjection) {
        return timelineItems(null, input, subProjection);
    }

    public IssueResponseProjection timelineItems(String alias, IssueTimelineItemsParametrizedInput input, IssueTimelineItemsConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection title() {
        return title(null);
    }

    public IssueResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public IssueResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public IssueResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public IssueResponseProjection url() {
        return url(null);
    }

    public IssueResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public IssueResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public IssueResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public IssueResponseProjection userContentEdits(IssueUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public IssueResponseProjection userContentEdits(String alias, IssueUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueResponseProjection viewerCanReact() {
        return viewerCanReact(null);
    }

    public IssueResponseProjection viewerCanReact(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias));
        return this;
    }

    public IssueResponseProjection viewerCanSubscribe() {
        return viewerCanSubscribe(null);
    }

    public IssueResponseProjection viewerCanSubscribe(String alias) {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias));
        return this;
    }

    public IssueResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public IssueResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public IssueResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public IssueResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public IssueResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public IssueResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public IssueResponseProjection viewerSubscription() {
        return viewerSubscription(null);
    }

    public IssueResponseProjection viewerSubscription(String alias) {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias));
        return this;
    }

    public IssueResponseProjection typename() {
        return typename(null);
    }

    public IssueResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final IssueResponseProjection that = (IssueResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
