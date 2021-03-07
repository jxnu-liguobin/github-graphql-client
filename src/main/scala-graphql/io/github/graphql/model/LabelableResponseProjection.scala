package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Labelable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class LabelableResponseProjection extends GraphQLResponseProjection {

    override def all$(): LabelableResponseProjection = all$(3)

    override def all$(maxDepth: Int): LabelableResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelableResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1)
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0)))
        }
        this.typename()
        this
    }

    def labels(subProjection: LabelConnectionResponseProjection): LabelableResponseProjection = {
        labels(null.asInstanceOf[String], subProjection)
    }

    def labels(alias: String, subProjection: LabelConnectionResponseProjection): LabelableResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection))
        this
    }

    def labels(input: LabelableLabelsParametrizedInput,subProjection: LabelConnectionResponseProjection): LabelableResponseProjection = {
        labels(null.asInstanceOf[String], input, subProjection)
    }

    def labels(alias: String, input: LabelableLabelsParametrizedInput , subProjection: LabelConnectionResponseProjection): LabelableResponseProjection = {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): LabelableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): LabelableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): LabelableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): LabelableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): LabelableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LabelableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
