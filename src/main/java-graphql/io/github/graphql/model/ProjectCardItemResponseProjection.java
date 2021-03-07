package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectCardItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ProjectCardItemResponseProjection extends GraphQLResponseProjection {

    public ProjectCardItemResponseProjection() {
    }

    @Override
    public ProjectCardItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectCardItemResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public ProjectCardItemResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public ProjectCardItemResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardItemResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public ProjectCardItemResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardItemResponseProjection typename() {
        return typename(null);
    }

    public ProjectCardItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
