package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Closable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ClosableResponseProjection extends GraphQLResponseProjection {

    public ClosableResponseProjection() {
    }

    @Override
    public ClosableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ClosableResponseProjection all$(int maxDepth) {
        this.closed();
        this.closedAt();
        this.typename();
        return this;
    }

    public ClosableResponseProjection closed() {
        return closed(null);
    }

    public ClosableResponseProjection closed(String alias) {
        fields.add(new GraphQLResponseField("closed").alias(alias));
        return this;
    }

    public ClosableResponseProjection closedAt() {
        return closedAt(null);
    }

    public ClosableResponseProjection closedAt(String alias) {
        fields.add(new GraphQLResponseField("closedAt").alias(alias));
        return this;
    }

    public ClosableResponseProjection onProject(ProjectResponseProjection subProjection) {
        return onProject(null, subProjection);
    }

    public ClosableResponseProjection onProject(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection));
        return this;
    }

    public ClosableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public ClosableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public ClosableResponseProjection onMilestone(MilestoneResponseProjection subProjection) {
        return onMilestone(null, subProjection);
    }

    public ClosableResponseProjection onMilestone(String alias, MilestoneResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection));
        return this;
    }

    public ClosableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public ClosableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ClosableResponseProjection typename() {
        return typename(null);
    }

    public ClosableResponseProjection typename(String alias) {
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
        final ClosableResponseProjection that = (ClosableResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
