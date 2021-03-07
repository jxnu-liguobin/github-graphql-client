package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectCardItem
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ProjectCardItemResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectCardItemResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectCardItemResponseProjection {
        this.typename()
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): ProjectCardItemResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): ProjectCardItemResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): ProjectCardItemResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): ProjectCardItemResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ProjectCardItemResponseProjection = typename(null)

    fun typename(alias: String?): ProjectCardItemResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
