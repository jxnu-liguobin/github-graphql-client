package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Lockable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LockableResponseProjection extends GraphQLResponseProjection {

    override def all$(): LockableResponseProjection = all$(3)

    override def all$(maxDepth: Int): LockableResponseProjection = {
        this.activeLockReason()
        this.locked()
        this.typename()
        this
    }

    def activeLockReason(): LockableResponseProjection = {
        activeLockReason(null.asInstanceOf[String])
    }

    def activeLockReason(alias: String): LockableResponseProjection = {
        fields.add(new GraphQLResponseField("activeLockReason").alias(alias))
        this
    }

    def locked(): LockableResponseProjection = {
        locked(null.asInstanceOf[String])
    }

    def locked(alias: String): LockableResponseProjection = {
        fields.add(new GraphQLResponseField("locked").alias(alias))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): LockableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): LockableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): LockableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): LockableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): LockableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LockableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[LockableResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
