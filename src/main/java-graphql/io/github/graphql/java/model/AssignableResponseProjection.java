package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Assignable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AssignableResponseProjection extends GraphQLResponseProjection {

    public AssignableResponseProjection() {
    }

    @Override
    public AssignableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AssignableResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignableResponseProjection.UserConnectionResponseProjection.assignees", projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0) + 1);
            this.assignees(new UserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignableResponseProjection.UserConnectionResponseProjection.assignees", 0)));
        }
        this.typename();
        return this;
    }

    public AssignableResponseProjection assignees(UserConnectionResponseProjection subProjection) {
        return assignees((String)null, subProjection);
    }

    public AssignableResponseProjection assignees(String alias, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignees").alias(alias).projection(subProjection));
        return this;
    }

    public AssignableResponseProjection assignees(AssignableAssigneesParametrizedInput input, UserConnectionResponseProjection subProjection) {
        return assignees(null, input, subProjection);
    }

    public AssignableResponseProjection assignees(String alias, AssignableAssigneesParametrizedInput input, UserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignees").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public AssignableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public AssignableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public AssignableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public AssignableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public AssignableResponseProjection typename() {
        return typename(null);
    }

    public AssignableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AssignableResponseProjection that = (AssignableResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
