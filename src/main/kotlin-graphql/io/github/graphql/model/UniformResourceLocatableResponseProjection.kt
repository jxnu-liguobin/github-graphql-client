package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UniformResourceLocatable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UniformResourceLocatableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UniformResourceLocatableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UniformResourceLocatableResponseProjection {
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun resourcePath(): UniformResourceLocatableResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): UniformResourceLocatableResponseProjection = url(null)

    fun url(alias: String?): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun onGist(subProjection: GistResponseProjection): UniformResourceLocatableResponseProjection = onGist(null, subProjection)

    fun onGist(alias: String?, subProjection: GistResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): UniformResourceLocatableResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): UniformResourceLocatableResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): UniformResourceLocatableResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestone(subProjection: MilestoneResponseProjection): UniformResourceLocatableResponseProjection = onMilestone(null, subProjection)

    fun onMilestone(alias: String?, subProjection: MilestoneResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection))
        return this
    }

    fun onBot(subProjection: BotResponseProjection): UniformResourceLocatableResponseProjection = onBot(null, subProjection)

    fun onBot(alias: String?, subProjection: BotResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): UniformResourceLocatableResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onClosedEvent(subProjection: ClosedEventResponseProjection): UniformResourceLocatableResponseProjection = onClosedEvent(null, subProjection)

    fun onClosedEvent(alias: String?, subProjection: ClosedEventResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on ClosedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCrossReferencedEvent(subProjection: CrossReferencedEventResponseProjection): UniformResourceLocatableResponseProjection = onCrossReferencedEvent(null, subProjection)

    fun onCrossReferencedEvent(alias: String?, subProjection: CrossReferencedEventResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on CrossReferencedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestCommit(subProjection: PullRequestCommitResponseProjection): UniformResourceLocatableResponseProjection = onPullRequestCommit(null, subProjection)

    fun onPullRequestCommit(alias: String?, subProjection: PullRequestCommitResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestCommit").alias(alias).projection(subProjection))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): UniformResourceLocatableResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onRepositoryTopic(subProjection: RepositoryTopicResponseProjection): UniformResourceLocatableResponseProjection = onRepositoryTopic(null, subProjection)

    fun onRepositoryTopic(alias: String?, subProjection: RepositoryTopicResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on RepositoryTopic").alias(alias).projection(subProjection))
        return this
    }

    fun onReviewDismissedEvent(subProjection: ReviewDismissedEventResponseProjection): UniformResourceLocatableResponseProjection = onReviewDismissedEvent(null, subProjection)

    fun onReviewDismissedEvent(alias: String?, subProjection: ReviewDismissedEventResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on ReviewDismissedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onCommit(subProjection: CommitResponseProjection): UniformResourceLocatableResponseProjection = onCommit(null, subProjection)

    fun onCommit(alias: String?, subProjection: CommitResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        return this
    }

    fun onMannequin(subProjection: MannequinResponseProjection): UniformResourceLocatableResponseProjection = onMannequin(null, subProjection)

    fun onMannequin(alias: String?, subProjection: MannequinResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        return this
    }

    fun onReadyForReviewEvent(subProjection: ReadyForReviewEventResponseProjection): UniformResourceLocatableResponseProjection = onReadyForReviewEvent(null, subProjection)

    fun onReadyForReviewEvent(alias: String?, subProjection: ReadyForReviewEventResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on ReadyForReviewEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onMergedEvent(subProjection: MergedEventResponseProjection): UniformResourceLocatableResponseProjection = onMergedEvent(null, subProjection)

    fun onMergedEvent(alias: String?, subProjection: MergedEventResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on MergedEvent").alias(alias).projection(subProjection))
        return this
    }

    fun onRelease(subProjection: ReleaseResponseProjection): UniformResourceLocatableResponseProjection = onRelease(null, subProjection)

    fun onRelease(alias: String?, subProjection: ReleaseResponseProjection): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("...on Release").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UniformResourceLocatableResponseProjection = typename(null)

    fun typename(alias: String?): UniformResourceLocatableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
