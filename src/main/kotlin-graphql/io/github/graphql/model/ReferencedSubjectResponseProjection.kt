package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReferencedSubject
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ReferencedSubjectResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReferencedSubjectResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReferencedSubjectResponseProjection {
        this.typename()
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): ReferencedSubjectResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): ReferencedSubjectResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): ReferencedSubjectResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): ReferencedSubjectResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReferencedSubjectResponseProjection = typename(null)

    fun typename(alias: String?): ReferencedSubjectResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
