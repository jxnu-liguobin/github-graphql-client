package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Subscribable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SubscribableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SubscribableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SubscribableResponseProjection {
        this.id()
        this.viewerCanSubscribe()
        this.viewerSubscription()
        this.typename()
        return this
    }

    fun id(): SubscribableResponseProjection = id(null)

    fun id(alias: String?): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun viewerCanSubscribe(): SubscribableResponseProjection = viewerCanSubscribe(null)

    fun viewerCanSubscribe(alias: String?): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("viewerCanSubscribe").alias(alias))
        return this
    }

    fun viewerSubscription(): SubscribableResponseProjection = viewerSubscription(null)

    fun viewerSubscription(alias: String?): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("viewerSubscription").alias(alias))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): SubscribableResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): SubscribableResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onCommit(subProjection: CommitResponseProjection): SubscribableResponseProjection = onCommit(null, subProjection)

    fun onCommit(alias: String?, subProjection: CommitResponseProjection): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): SubscribableResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): SubscribableResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SubscribableResponseProjection = typename(null)

    fun typename(alias: String?): SubscribableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
