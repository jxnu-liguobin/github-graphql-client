package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Closable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ClosableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ClosableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ClosableResponseProjection {
        this.closed()
        this.closedAt()
        this.typename()
        return this
    }

    fun closed(): ClosableResponseProjection = closed(null)

    fun closed(alias: String?): ClosableResponseProjection {
        fields.add(GraphQLResponseField("closed").alias(alias))
        return this
    }

    fun closedAt(): ClosableResponseProjection = closedAt(null)

    fun closedAt(alias: String?): ClosableResponseProjection {
        fields.add(GraphQLResponseField("closedAt").alias(alias))
        return this
    }

    fun onProject(subProjection: ProjectResponseProjection): ClosableResponseProjection = onProject(null, subProjection)

    fun onProject(alias: String?, subProjection: ProjectResponseProjection): ClosableResponseProjection {
        fields.add(GraphQLResponseField("...on Project").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): ClosableResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): ClosableResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onMilestone(subProjection: MilestoneResponseProjection): ClosableResponseProjection = onMilestone(null, subProjection)

    fun onMilestone(alias: String?, subProjection: MilestoneResponseProjection): ClosableResponseProjection {
        fields.add(GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): ClosableResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): ClosableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ClosableResponseProjection = typename(null)

    fun typename(alias: String?): ClosableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ClosableResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
