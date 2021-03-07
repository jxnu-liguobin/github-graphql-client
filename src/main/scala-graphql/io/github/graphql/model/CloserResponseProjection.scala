package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Closer
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloserResponseProjection extends GraphQLResponseProjection {

    override def all$(): CloserResponseProjection = all$(3)

    override def all$(maxDepth: Int): CloserResponseProjection = {
        this.typename()
        this
    }

    def onCommit(subProjection: CommitResponseProjection): CloserResponseProjection = {
        onCommit(null.asInstanceOf[String], subProjection)
    }

    def onCommit(alias: String, subProjection: CommitResponseProjection): CloserResponseProjection = {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): CloserResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): CloserResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): CloserResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CloserResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
