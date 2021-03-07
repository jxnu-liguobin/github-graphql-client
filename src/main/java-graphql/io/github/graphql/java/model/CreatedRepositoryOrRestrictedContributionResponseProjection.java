package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedRepositoryOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedRepositoryOrRestrictedContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedRepositoryOrRestrictedContributionResponseProjection() {
    }

    @Override
    public CreatedRepositoryOrRestrictedContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedRepositoryOrRestrictedContributionResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public CreatedRepositoryOrRestrictedContributionResponseProjection onRestrictedContribution(RestrictedContributionResponseProjection subProjection) {
        return onRestrictedContribution(null, subProjection);
    }

    public CreatedRepositoryOrRestrictedContributionResponseProjection onRestrictedContribution(String alias, RestrictedContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryOrRestrictedContributionResponseProjection onCreatedRepositoryContribution(CreatedRepositoryContributionResponseProjection subProjection) {
        return onCreatedRepositoryContribution(null, subProjection);
    }

    public CreatedRepositoryOrRestrictedContributionResponseProjection onCreatedRepositoryContribution(String alias, CreatedRepositoryContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedRepositoryContribution").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedRepositoryOrRestrictedContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedRepositoryOrRestrictedContributionResponseProjection typename(String alias) {
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
        final CreatedRepositoryOrRestrictedContributionResponseProjection that = (CreatedRepositoryOrRestrictedContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
