package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedPullRequestOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreatedPullRequestOrRestrictedContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedPullRequestOrRestrictedContributionResponseProjection() {
    }

    @Override
    public CreatedPullRequestOrRestrictedContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedPullRequestOrRestrictedContributionResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public CreatedPullRequestOrRestrictedContributionResponseProjection onRestrictedContribution(RestrictedContributionResponseProjection subProjection) {
        return onRestrictedContribution(null, subProjection);
    }

    public CreatedPullRequestOrRestrictedContributionResponseProjection onRestrictedContribution(String alias, RestrictedContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestOrRestrictedContributionResponseProjection onCreatedPullRequestContribution(CreatedPullRequestContributionResponseProjection subProjection) {
        return onCreatedPullRequestContribution(null, subProjection);
    }

    public CreatedPullRequestOrRestrictedContributionResponseProjection onCreatedPullRequestContribution(String alias, CreatedPullRequestContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedPullRequestContribution").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestOrRestrictedContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedPullRequestOrRestrictedContributionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
