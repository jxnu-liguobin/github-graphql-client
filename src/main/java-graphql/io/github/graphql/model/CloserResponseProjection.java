package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Closer
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CloserResponseProjection extends GraphQLResponseProjection {

    public CloserResponseProjection() {
    }

    @Override
    public CloserResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CloserResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public CloserResponseProjection onCommit(CommitResponseProjection subProjection) {
        return onCommit(null, subProjection);
    }

    public CloserResponseProjection onCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection));
        return this;
    }

    public CloserResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public CloserResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public CloserResponseProjection typename() {
        return typename(null);
    }

    public CloserResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
