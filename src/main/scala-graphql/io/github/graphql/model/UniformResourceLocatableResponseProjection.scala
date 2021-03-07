package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UniformResourceLocatable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UniformResourceLocatableResponseProjection extends GraphQLResponseProjection {

    override def all$(): UniformResourceLocatableResponseProjection = all$(3)

    override def all$(maxDepth: Int): UniformResourceLocatableResponseProjection = {
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def resourcePath(): UniformResourceLocatableResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): UniformResourceLocatableResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def onGist(subProjection: GistResponseProjection): UniformResourceLocatableResponseProjection = {
        onGist(null.asInstanceOf[String], subProjection)
    }

    def onGist(alias: String, subProjection: GistResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): UniformResourceLocatableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): UniformResourceLocatableResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): UniformResourceLocatableResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onMilestone(subProjection: MilestoneResponseProjection): UniformResourceLocatableResponseProjection = {
        onMilestone(null.asInstanceOf[String], subProjection)
    }

    def onMilestone(alias: String, subProjection: MilestoneResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection))
        this
    }

    def onBot(subProjection: BotResponseProjection): UniformResourceLocatableResponseProjection = {
        onBot(null.asInstanceOf[String], subProjection)
    }

    def onBot(alias: String, subProjection: BotResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): UniformResourceLocatableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onClosedEvent(subProjection: ClosedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        onClosedEvent(null.asInstanceOf[String], subProjection)
    }

    def onClosedEvent(alias: String, subProjection: ClosedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        onCrossReferencedEvent(null.asInstanceOf[String], subProjection)
    }

    def onCrossReferencedEvent(alias: String, subProjection: CrossReferencedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestCommit(subProjection: PullRequestCommitResponseProjection): UniformResourceLocatableResponseProjection = {
        onPullRequestCommit(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestCommit(alias: String, subProjection: PullRequestCommitResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): UniformResourceLocatableResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onRepositoryTopic(subProjection: RepositoryTopicResponseProjection): UniformResourceLocatableResponseProjection = {
        onRepositoryTopic(null.asInstanceOf[String], subProjection)
    }

    def onRepositoryTopic(alias: String, subProjection: RepositoryTopicResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on RepositoryTopic").alias(alias).projection(subProjection))
        this
    }

    def onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        onReviewDismissedEvent(null.asInstanceOf[String], subProjection)
    }

    def onReviewDismissedEvent(alias: String, subProjection: ReviewDismissedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        this
    }

    def onCommit(subProjection: CommitResponseProjection): UniformResourceLocatableResponseProjection = {
        onCommit(null.asInstanceOf[String], subProjection)
    }

    def onCommit(alias: String, subProjection: CommitResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        this
    }

    def onMannequin(subProjection: MannequinResponseProjection): UniformResourceLocatableResponseProjection = {
        onMannequin(null.asInstanceOf[String], subProjection)
    }

    def onMannequin(alias: String, subProjection: MannequinResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        this
    }

    def onReadyForReviewEvent(subProjection: ReadyForReviewEventResponseProjection): UniformResourceLocatableResponseProjection = {
        onReadyForReviewEvent(null.asInstanceOf[String], subProjection)
    }

    def onReadyForReviewEvent(alias: String, subProjection: ReadyForReviewEventResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection))
        this
    }

    def onMergedEvent(subProjection: MergedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        onMergedEvent(null.asInstanceOf[String], subProjection)
    }

    def onMergedEvent(alias: String, subProjection: MergedEventResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        this
    }

    def onRelease(subProjection: ReleaseResponseProjection): UniformResourceLocatableResponseProjection = {
        onRelease(null.asInstanceOf[String], subProjection)
    }

    def onRelease(alias: String, subProjection: ReleaseResponseProjection): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Release").alias(alias).projection(subProjection))
        this
    }

    def typename(): UniformResourceLocatableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UniformResourceLocatableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
