package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RenamedTitleSubject
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RenamedTitleSubjectResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RenamedTitleSubjectResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RenamedTitleSubjectResponseProjection {
        this.typename()
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): RenamedTitleSubjectResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): RenamedTitleSubjectResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): RenamedTitleSubjectResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): RenamedTitleSubjectResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RenamedTitleSubjectResponseProjection = typename(null)

    fun typename(alias: String?): RenamedTitleSubjectResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
