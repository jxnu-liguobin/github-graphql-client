package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Issue
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class IssueResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueResponseProjection = {
        this.activeLockReason()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.UserConnectionResponseProjection.assignees", projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1)
            this.assignees(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0) + 1)
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.closed()
        this.closedAt()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new IssueCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1)
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        this.lastEditedAt()
        this.locked()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.MilestoneResponseProjection.milestone", projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0) + 1)
            this.milestone(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0)))
        }
        this.number()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.UserConnectionResponseProjection.participants", projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0) + 1)
            this.participants(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) + 1)
            this.projectCards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0)))
        }
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1)
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1)
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0) + 1)
            this.timeline(new IssueTimelineConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0) + 1)
            this.timelineItems(new IssueTimelineItemsConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0)))
        }
        this.title()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1)
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanReact()
        this.viewerCanSubscribe()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.viewerSubscription()
        this.typename()
        this
    }

    def activeLockReason(): IssueResponseProjection = {
        activeLockReason(null.asInstanceOf[String])
    }

    def activeLockReason(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("activeLockReason").alias(alias))
        this
    }

    def assignees(subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        assignees(null.asInstanceOf[String], subProjection)
    }

    def assignees(alias: String, subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("assignees").alias(alias).projection(subProjection))
        this
    }

    def assignees(input: IssueAssigneesParametrizedInput,subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        assignees(null.asInstanceOf[String], input, subProjection)
    }

    def assignees(alias: String, input: IssueAssigneesParametrizedInput , subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def author(subProjection: ActorResponseProjection): IssueResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: ActorResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authorAssociation(): IssueResponseProjection = {
        authorAssociation(null.asInstanceOf[String])
    }

    def authorAssociation(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias))
        this
    }

    def body(): IssueResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): IssueResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def bodyText(): IssueResponseProjection = {
        bodyText(null.asInstanceOf[String])
    }

    def bodyText(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("bodyText").alias(alias))
        this
    }

    def closed(): IssueResponseProjection = {
        closed(null.asInstanceOf[String])
    }

    def closed(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("closed").alias(alias))
        this
    }

    def closedAt(): IssueResponseProjection = {
        closedAt(null.asInstanceOf[String])
    }

    def closedAt(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("closedAt").alias(alias))
        this
    }

    def comments(subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: IssueCommentsParametrizedInput,subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: IssueCommentsParametrizedInput , subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createdAt(): IssueResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def createdViaEmail(): IssueResponseProjection = {
        createdViaEmail(null.asInstanceOf[String])
    }

    def createdViaEmail(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias))
        this
    }

    def databaseId(): IssueResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): IssueResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def id(): IssueResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def includesCreatedEdit(): IssueResponseProjection = {
        includesCreatedEdit(null.asInstanceOf[String])
    }

    def includesCreatedEdit(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias))
        this
    }

    def labels(subProjection: LabelConnectionResponseProjection): IssueResponseProjection = {
        labels(null.asInstanceOf[String], subProjection)
    }

    def labels(alias: String, subProjection: LabelConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection))
        this
    }

    def labels(input: IssueLabelsParametrizedInput,subProjection: LabelConnectionResponseProjection): IssueResponseProjection = {
        labels(null.asInstanceOf[String], input, subProjection)
    }

    def labels(alias: String, input: IssueLabelsParametrizedInput , subProjection: LabelConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def lastEditedAt(): IssueResponseProjection = {
        lastEditedAt(null.asInstanceOf[String])
    }

    def lastEditedAt(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias))
        this
    }

    def locked(): IssueResponseProjection = {
        locked(null.asInstanceOf[String])
    }

    def locked(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("locked").alias(alias))
        this
    }

    def milestone(subProjection: MilestoneResponseProjection): IssueResponseProjection = {
        milestone(null.asInstanceOf[String], subProjection)
    }

    def milestone(alias: String, subProjection: MilestoneResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("milestone").alias(alias).projection(subProjection))
        this
    }

    def number(): IssueResponseProjection = {
        number(null.asInstanceOf[String])
    }

    def number(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("number").alias(alias))
        this
    }

    def participants(subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        participants(null.asInstanceOf[String], subProjection)
    }

    def participants(alias: String, subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("participants").alias(alias).projection(subProjection))
        this
    }

    def participants(input: IssueParticipantsParametrizedInput,subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        participants(null.asInstanceOf[String], input, subProjection)
    }

    def participants(alias: String, input: IssueParticipantsParametrizedInput , subProjection: UserConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("participants").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projectCards(subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection = {
        projectCards(null.asInstanceOf[String], subProjection)
    }

    def projectCards(alias: String, subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).projection(subProjection))
        this
    }

    def projectCards(input: IssueProjectCardsParametrizedInput,subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection = {
        projectCards(null.asInstanceOf[String], input, subProjection)
    }

    def projectCards(alias: String, input: IssueProjectCardsParametrizedInput , subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("projectCards").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def publishedAt(): IssueResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def reactionGroups(subProjection: ReactionGroupResponseProjection): IssueResponseProjection = {
        reactionGroups(null.asInstanceOf[String], subProjection)
    }

    def reactionGroups(alias: String, subProjection: ReactionGroupResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        this
    }

    def reactions(subProjection: ReactionConnectionResponseProjection): IssueResponseProjection = {
        reactions(null.asInstanceOf[String], subProjection)
    }

    def reactions(alias: String, subProjection: ReactionConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        this
    }

    def reactions(input: IssueReactionsParametrizedInput,subProjection: ReactionConnectionResponseProjection): IssueResponseProjection = {
        reactions(null.asInstanceOf[String], input, subProjection)
    }

    def reactions(alias: String, input: IssueReactionsParametrizedInput , subProjection: ReactionConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): IssueResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): IssueResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def state(): IssueResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    @deprecated(message = "`timeline` will be removed Use Issue.timelineItems instead. Removal on 2019-10-01 UTC.")
    def timeline(subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection = {
        timeline(null.asInstanceOf[String], subProjection)
    }

    def timeline(alias: String, subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("timeline").alias(alias).projection(subProjection))
        this
    }

    def timeline(input: IssueTimelineParametrizedInput,subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection = {
        timeline(null.asInstanceOf[String], input, subProjection)
    }

    def timeline(alias: String, input: IssueTimelineParametrizedInput , subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("timeline").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def timelineItems(subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection = {
        timelineItems(null.asInstanceOf[String], subProjection)
    }

    def timelineItems(alias: String, subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).projection(subProjection))
        this
    }

    def timelineItems(input: IssueTimelineItemsParametrizedInput,subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection = {
        timelineItems(null.asInstanceOf[String], input, subProjection)
    }

    def timelineItems(alias: String, input: IssueTimelineItemsParametrizedInput , subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("timelineItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def title(): IssueResponseProjection = {
        title(null.asInstanceOf[String])
    }

    def title(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("title").alias(alias))
        this
    }

    def updatedAt(): IssueResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): IssueResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def userContentEdits(subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection = {
        userContentEdits(null.asInstanceOf[String], subProjection)
    }

    def userContentEdits(alias: String, subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        this
    }

    def userContentEdits(input: IssueUserContentEditsParametrizedInput,subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection = {
        userContentEdits(null.asInstanceOf[String], input, subProjection)
    }

    def userContentEdits(alias: String, input: IssueUserContentEditsParametrizedInput , subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerCanReact(): IssueResponseProjection = {
        viewerCanReact(null.asInstanceOf[String])
    }

    def viewerCanReact(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias))
        this
    }

    def viewerCanSubscribe(): IssueResponseProjection = {
        viewerCanSubscribe(null.asInstanceOf[String])
    }

    def viewerCanSubscribe(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias))
        this
    }

    def viewerCanUpdate(): IssueResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def viewerCannotUpdateReasons(): IssueResponseProjection = {
        viewerCannotUpdateReasons(null.asInstanceOf[String])
    }

    def viewerCannotUpdateReasons(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        this
    }

    def viewerDidAuthor(): IssueResponseProjection = {
        viewerDidAuthor(null.asInstanceOf[String])
    }

    def viewerDidAuthor(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias))
        this
    }

    def viewerSubscription(): IssueResponseProjection = {
        viewerSubscription(null.asInstanceOf[String])
    }

    def viewerSubscription(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias))
        this
    }

    def typename(): IssueResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
