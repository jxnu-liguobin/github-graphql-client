package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    public PullRequestContributionsByRepositoryResponseProjection() {
    }

    @Override
    public PullRequestContributionsByRepositoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestContributionsByRepositoryResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0) + 1);
            this.contributions(new CreatedPullRequestContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.CreatedPullRequestContributionConnectionResponseProjection.contributions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public PullRequestContributionsByRepositoryResponseProjection contributions(CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        return contributions((String)null, subProjection);
    }

    public PullRequestContributionsByRepositoryResponseProjection contributions(String alias, CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestContributionsByRepositoryResponseProjection contributions(PullRequestContributionsByRepositoryContributionsParametrizedInput input, CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        return contributions(null, input, subProjection);
    }

    public PullRequestContributionsByRepositoryResponseProjection contributions(String alias, PullRequestContributionsByRepositoryContributionsParametrizedInput input, CreatedPullRequestContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestContributionsByRepositoryResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public PullRequestContributionsByRepositoryResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestContributionsByRepositoryResponseProjection typename() {
        return typename(null);
    }

    public PullRequestContributionsByRepositoryResponseProjection typename(String alias) {
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
        final PullRequestContributionsByRepositoryResponseProjection that = (PullRequestContributionsByRepositoryResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
