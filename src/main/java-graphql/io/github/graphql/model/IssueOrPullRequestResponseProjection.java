package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueOrPullRequest
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class IssueOrPullRequestResponseProjection extends GraphQLResponseProjection {

    public IssueOrPullRequestResponseProjection() {
    }

    @Override
    public IssueOrPullRequestResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueOrPullRequestResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public IssueOrPullRequestResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public IssueOrPullRequestResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public IssueOrPullRequestResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public IssueOrPullRequestResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public IssueOrPullRequestResponseProjection typename() {
        return typename(null);
    }

    public IssueOrPullRequestResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
