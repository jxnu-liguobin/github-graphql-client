package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for IssueContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class IssueContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    public IssueContributionsByRepositoryResponseProjection() {
    }

    @Override
    public IssueContributionsByRepositoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueContributionsByRepositoryResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0) + 1);
            this.contributions(new CreatedIssueContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public IssueContributionsByRepositoryResponseProjection contributions(CreatedIssueContributionConnectionResponseProjection subProjection) {
        return contributions((String)null, subProjection);
    }

    public IssueContributionsByRepositoryResponseProjection contributions(String alias, CreatedIssueContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection));
        return this;
    }

    public IssueContributionsByRepositoryResponseProjection contributions(IssueContributionsByRepositoryContributionsParametrizedInput input, CreatedIssueContributionConnectionResponseProjection subProjection) {
        return contributions(null, input, subProjection);
    }

    public IssueContributionsByRepositoryResponseProjection contributions(String alias, IssueContributionsByRepositoryContributionsParametrizedInput input, CreatedIssueContributionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueContributionsByRepositoryResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public IssueContributionsByRepositoryResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public IssueContributionsByRepositoryResponseProjection typename() {
        return typename(null);
    }

    public IssueContributionsByRepositoryResponseProjection typename(String alias) {
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
        final IssueContributionsByRepositoryResponseProjection that = (IssueContributionsByRepositoryResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
