package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Issue
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueResponseProjection {
        this.activeLockReason()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.UserConnectionResponseProjection.assignees"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1
            this.assignees(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.assignees", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.closed()
        this.closedAt()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.IssueCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(IssueCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueCommentConnectionResponseProjection.comments", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.LabelConnectionResponseProjection.labels"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1
            this.labels(LabelConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        this.lastEditedAt()
        this.locked()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.MilestoneResponseProjection.milestone"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0) + 1
            this.milestone(MilestoneResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.MilestoneResponseProjection.milestone", 0)))
        }
        this.number()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.UserConnectionResponseProjection.participants"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0) + 1
            this.participants(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserConnectionResponseProjection.participants", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0) + 1
            this.projectCards(ProjectCardConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ProjectCardConnectionResponseProjection.projectCards", 0)))
        }
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1
            this.reactionGroups(ReactionGroupResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.ReactionConnectionResponseProjection.reactions"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1
            this.reactions(ReactionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0) + 1
            this.timeline(IssueTimelineConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineConnectionResponseProjection.timeline", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0) + 1
            this.timelineItems(IssueTimelineItemsConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.IssueTimelineItemsConnectionResponseProjection.timelineItems", 0)))
        }
        this.title()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanReact()
        this.viewerCanSubscribe()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.viewerSubscription()
        this.typename()
        return this
    }

    fun activeLockReason(): IssueResponseProjection = activeLockReason(null)

    fun activeLockReason(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("activeLockReason").alias(alias))
        return this
    }

    fun assignees(subProjection: UserConnectionResponseProjection): IssueResponseProjection = assignees(null, subProjection)

    fun assignees(alias: String?, subProjection: UserConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("assignees").alias(alias).projection(subProjection))
        return this
    }

    fun assignees(input: IssueAssigneesParametrizedInput, subProjection: UserConnectionResponseProjection): IssueResponseProjection = assignees(null, input, subProjection)

    fun assignees(alias: String?, input: IssueAssigneesParametrizedInput, subProjection: UserConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun author(subProjection: ActorResponseProjection): IssueResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): IssueResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun body(): IssueResponseProjection = body(null)

    fun body(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): IssueResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): IssueResponseProjection = bodyText(null)

    fun bodyText(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun closed(): IssueResponseProjection = closed(null)

    fun closed(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("closed").alias(alias))
        return this
    }

    fun closedAt(): IssueResponseProjection = closedAt(null)

    fun closedAt(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("closedAt").alias(alias))
        return this
    }

    fun comments(subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: IssueCommentsParametrizedInput, subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: IssueCommentsParametrizedInput, subProjection: IssueCommentConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createdAt(): IssueResponseProjection = createdAt(null)

    fun createdAt(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): IssueResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun databaseId(): IssueResponseProjection = databaseId(null)

    fun databaseId(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): IssueResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun id(): IssueResponseProjection = id(null)

    fun id(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): IssueResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun labels(subProjection: LabelConnectionResponseProjection): IssueResponseProjection = labels(null, subProjection)

    fun labels(alias: String?, subProjection: LabelConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).projection(subProjection))
        return this
    }

    fun labels(input: IssueLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): IssueResponseProjection = labels(null, input, subProjection)

    fun labels(alias: String?, input: IssueLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun lastEditedAt(): IssueResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun locked(): IssueResponseProjection = locked(null)

    fun locked(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("locked").alias(alias))
        return this
    }

    fun milestone(subProjection: MilestoneResponseProjection): IssueResponseProjection = milestone(null, subProjection)

    fun milestone(alias: String?, subProjection: MilestoneResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("milestone").alias(alias).projection(subProjection))
        return this
    }

    fun number(): IssueResponseProjection = number(null)

    fun number(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("number").alias(alias))
        return this
    }

    fun participants(subProjection: UserConnectionResponseProjection): IssueResponseProjection = participants(null, subProjection)

    fun participants(alias: String?, subProjection: UserConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("participants").alias(alias).projection(subProjection))
        return this
    }

    fun participants(input: IssueParticipantsParametrizedInput, subProjection: UserConnectionResponseProjection): IssueResponseProjection = participants(null, input, subProjection)

    fun participants(alias: String?, input: IssueParticipantsParametrizedInput, subProjection: UserConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("participants").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projectCards(subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection = projectCards(null, subProjection)

    fun projectCards(alias: String?, subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("projectCards").alias(alias).projection(subProjection))
        return this
    }

    fun projectCards(input: IssueProjectCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection = projectCards(null, input, subProjection)

    fun projectCards(alias: String?, input: IssueProjectCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("projectCards").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun publishedAt(): IssueResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun reactionGroups(subProjection: ReactionGroupResponseProjection): IssueResponseProjection = reactionGroups(null, subProjection)

    fun reactionGroups(alias: String?, subProjection: ReactionGroupResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(subProjection: ReactionConnectionResponseProjection): IssueResponseProjection = reactions(null, subProjection)

    fun reactions(alias: String?, subProjection: ReactionConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(input: IssueReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): IssueResponseProjection = reactions(null, input, subProjection)

    fun reactions(alias: String?, input: IssueReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): IssueResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): IssueResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun state(): IssueResponseProjection = state(null)

    fun state(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    @Deprecated(message = "`timeline` will be removed Use Issue.timelineItems instead. Removal on 2019-10-01 UTC.")
    fun timeline(subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection = timeline(null, subProjection)

    fun timeline(alias: String?, subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("timeline").alias(alias).projection(subProjection))
        return this
    }

    fun timeline(input: IssueTimelineParametrizedInput, subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection = timeline(null, input, subProjection)

    fun timeline(alias: String?, input: IssueTimelineParametrizedInput, subProjection: IssueTimelineConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("timeline").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun timelineItems(subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection = timelineItems(null, subProjection)

    fun timelineItems(alias: String?, subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("timelineItems").alias(alias).projection(subProjection))
        return this
    }

    fun timelineItems(input: IssueTimelineItemsParametrizedInput, subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection = timelineItems(null, input, subProjection)

    fun timelineItems(alias: String?, input: IssueTimelineItemsParametrizedInput, subProjection: IssueTimelineItemsConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("timelineItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun title(): IssueResponseProjection = title(null)

    fun title(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("title").alias(alias))
        return this
    }

    fun updatedAt(): IssueResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): IssueResponseProjection = url(null)

    fun url(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: IssueUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: IssueUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): IssueResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerCanReact(): IssueResponseProjection = viewerCanReact(null)

    fun viewerCanReact(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("viewerCanReact").alias(alias))
        return this
    }

    fun viewerCanSubscribe(): IssueResponseProjection = viewerCanSubscribe(null)

    fun viewerCanSubscribe(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("viewerCanSubscribe").alias(alias))
        return this
    }

    fun viewerCanUpdate(): IssueResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun viewerCannotUpdateReasons(): IssueResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun viewerDidAuthor(): IssueResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun viewerSubscription(): IssueResponseProjection = viewerSubscription(null)

    fun viewerSubscription(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("viewerSubscription").alias(alias))
        return this
    }

    fun typename(): IssueResponseProjection = typename(null)

    fun typename(alias: String?): IssueResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
