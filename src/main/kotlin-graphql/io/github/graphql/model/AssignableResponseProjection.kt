package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Assignable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class AssignableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AssignableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AssignableResponseProjection {
        if (projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields["AssignableResponseProjection.UserConnectionResponseProjection.assignees"] = projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1
            this.assignees(UserConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0)))
        }
        this.typename()
        return this
    }

    fun assignees(subProjection: UserConnectionResponseProjection): AssignableResponseProjection = assignees(null, subProjection)

    fun assignees(alias: String?, subProjection: UserConnectionResponseProjection): AssignableResponseProjection {
        fields.add(GraphQLResponseField("assignees").alias(alias).projection(subProjection))
        return this
    }

    fun assignees(input: AssignableAssigneesParametrizedInput, subProjection: UserConnectionResponseProjection): AssignableResponseProjection = assignees(null, input, subProjection)

    fun assignees(alias: String?, input: AssignableAssigneesParametrizedInput, subProjection: UserConnectionResponseProjection): AssignableResponseProjection {
        fields.add(GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): AssignableResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): AssignableResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): AssignableResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): AssignableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AssignableResponseProjection = typename(null)

    fun typename(alias: String?): AssignableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
