package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Assignable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class AssignableResponseProjection extends GraphQLResponseProjection {

    override def all$(): AssignableResponseProjection = all$(3)

    override def all$(maxDepth: Int): AssignableResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignableResponseProjection.UserConnectionResponseProjection.assignees", projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1)
            this.assignees(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0)))
        }
        this.typename()
        this
    }

    def assignees(subProjection: UserConnectionResponseProjection): AssignableResponseProjection = {
        assignees(null.asInstanceOf[String], subProjection)
    }

    def assignees(alias: String, subProjection: UserConnectionResponseProjection): AssignableResponseProjection = {
        fields.add(new GraphQLResponseField("assignees").alias(alias).projection(subProjection))
        this
    }

    def assignees(input: AssignableAssigneesParametrizedInput,subProjection: UserConnectionResponseProjection): AssignableResponseProjection = {
        assignees(null.asInstanceOf[String], input, subProjection)
    }

    def assignees(alias: String, input: AssignableAssigneesParametrizedInput , subProjection: UserConnectionResponseProjection): AssignableResponseProjection = {
        fields.add(new GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): AssignableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): AssignableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): AssignableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): AssignableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): AssignableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AssignableResponseProjection = {
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
        val that = obj.asInstanceOf[AssignableResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
