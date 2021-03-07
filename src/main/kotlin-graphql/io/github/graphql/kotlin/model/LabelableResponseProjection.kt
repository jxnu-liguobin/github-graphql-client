package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Labelable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LabelableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LabelableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LabelableResponseProjection {
        if (projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields["LabelableResponseProjection.LabelConnectionResponseProjection.labels"] = projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1
            this.labels(LabelConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        this.typename()
        return this
    }

    fun labels(subProjection: LabelConnectionResponseProjection): LabelableResponseProjection = labels(null, subProjection)

    fun labels(alias: String?, subProjection: LabelConnectionResponseProjection): LabelableResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).projection(subProjection))
        return this
    }

    fun labels(input: LabelableLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): LabelableResponseProjection = labels(null, input, subProjection)

    fun labels(alias: String?, input: LabelableLabelsParametrizedInput, subProjection: LabelConnectionResponseProjection): LabelableResponseProjection {
        fields.add(GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): LabelableResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): LabelableResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): LabelableResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): LabelableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): LabelableResponseProjection = typename(null)

    fun typename(alias: String?): LabelableResponseProjection {
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
        val that = other as LabelableResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
