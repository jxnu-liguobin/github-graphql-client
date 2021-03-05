package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Closer
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CloserResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CloserResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CloserResponseProjection {
        this.typename()
        return this
    }

    fun onCommit(subProjection: CommitResponseProjection): CloserResponseProjection = onCommit(null, subProjection)

    fun onCommit(alias: String?, subProjection: CommitResponseProjection): CloserResponseProjection {
        fields.add(GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): CloserResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): CloserResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CloserResponseProjection = typename(null)

    fun typename(alias: String?): CloserResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
