package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CreatedIssueOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreatedIssueOrRestrictedContributionResponseProjection extends GraphQLResponseProjection {

    public CreatedIssueOrRestrictedContributionResponseProjection() {
    }

    @Override
    public CreatedIssueOrRestrictedContributionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedIssueOrRestrictedContributionResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public CreatedIssueOrRestrictedContributionResponseProjection onRestrictedContribution(RestrictedContributionResponseProjection subProjection) {
        return onRestrictedContribution(null, subProjection);
    }

    public CreatedIssueOrRestrictedContributionResponseProjection onRestrictedContribution(String alias, RestrictedContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueOrRestrictedContributionResponseProjection onCreatedIssueContribution(CreatedIssueContributionResponseProjection subProjection) {
        return onCreatedIssueContribution(null, subProjection);
    }

    public CreatedIssueOrRestrictedContributionResponseProjection onCreatedIssueContribution(String alias, CreatedIssueContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CreatedIssueContribution").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedIssueOrRestrictedContributionResponseProjection typename() {
        return typename(null);
    }

    public CreatedIssueOrRestrictedContributionResponseProjection typename(String alias) {
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
        final CreatedIssueOrRestrictedContributionResponseProjection that = (CreatedIssueOrRestrictedContributionResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
