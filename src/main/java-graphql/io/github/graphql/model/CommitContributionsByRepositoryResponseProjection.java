package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    public CommitContributionsByRepositoryResponseProjection() {
    }

    @Override
    public CommitContributionsByRepositoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitContributionsByRepositoryResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0) + 1);
            this.contributions(new CreatedCommitContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public CommitContributionsByRepositoryResponseProjection contributions(CreatedCommitContributionConnectionResponseProjection subProjection) {
        return contributions((String)null, subProjection);
    }

    public CommitContributionsByRepositoryResponseProjection contributions(String alias, CreatedCommitContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection));
        return this;
    }

    public CommitContributionsByRepositoryResponseProjection contributions(CommitContributionsByRepositoryContributionsParametrizedInput input, CreatedCommitContributionConnectionResponseProjection subProjection) {
        return contributions(null, input, subProjection);
    }

    public CommitContributionsByRepositoryResponseProjection contributions(String alias, CommitContributionsByRepositoryContributionsParametrizedInput input, CreatedCommitContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitContributionsByRepositoryResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CommitContributionsByRepositoryResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CommitContributionsByRepositoryResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CommitContributionsByRepositoryResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CommitContributionsByRepositoryResponseProjection url() {
        return url(null);
    }

    public CommitContributionsByRepositoryResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CommitContributionsByRepositoryResponseProjection typename() {
        return typename(null);
    }

    public CommitContributionsByRepositoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
