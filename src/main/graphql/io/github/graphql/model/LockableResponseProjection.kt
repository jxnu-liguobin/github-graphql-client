package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Lockable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
open class LockableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LockableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LockableResponseProjection {
        this.activeLockReason()
        this.locked()
        this.typename()
        return this
    }

    fun activeLockReason(): LockableResponseProjection = activeLockReason(null)

    fun activeLockReason(alias: String?): LockableResponseProjection {
        fields.add(GraphQLResponseField("activeLockReason").alias(alias))
        return this
    }

    fun locked(): LockableResponseProjection = locked(null)

    fun locked(alias: String?): LockableResponseProjection {
        fields.add(GraphQLResponseField("locked").alias(alias))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): LockableResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): LockableResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): LockableResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): LockableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): LockableResponseProjection = typename(null)

    fun typename(alias: String?): LockableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
