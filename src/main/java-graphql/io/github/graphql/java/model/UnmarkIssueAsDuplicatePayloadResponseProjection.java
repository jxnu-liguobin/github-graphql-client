package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UnmarkIssueAsDuplicatePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UnmarkIssueAsDuplicatePayloadResponseProjection extends GraphQLResponseProjection {

    public UnmarkIssueAsDuplicatePayloadResponseProjection() {
    }

    @Override
    public UnmarkIssueAsDuplicatePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnmarkIssueAsDuplicatePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0) + 1);
            this.duplicate(new IssueOrPullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnmarkIssueAsDuplicatePayloadResponseProjection.IssueOrPullRequestResponseProjection.duplicate", 0)));
        }
        this.typename();
        return this;
    }

    public UnmarkIssueAsDuplicatePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UnmarkIssueAsDuplicatePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UnmarkIssueAsDuplicatePayloadResponseProjection duplicate(IssueOrPullRequestResponseProjection subProjection) {
        return duplicate(null, subProjection);
    }

    public UnmarkIssueAsDuplicatePayloadResponseProjection duplicate(String alias, IssueOrPullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("duplicate").alias(alias).projection(subProjection));
        return this;
    }

    public UnmarkIssueAsDuplicatePayloadResponseProjection typename() {
        return typename(null);
    }

    public UnmarkIssueAsDuplicatePayloadResponseProjection typename(String alias) {
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
        final UnmarkIssueAsDuplicatePayloadResponseProjection that = (UnmarkIssueAsDuplicatePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
