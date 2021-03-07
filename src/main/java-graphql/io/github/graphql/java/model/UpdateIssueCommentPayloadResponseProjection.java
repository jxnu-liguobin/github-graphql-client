package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UpdateIssueCommentPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateIssueCommentPayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateIssueCommentPayloadResponseProjection() {
    }

    @Override
    public UpdateIssueCommentPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateIssueCommentPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0) + 1);
            this.issueComment(new IssueCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateIssueCommentPayloadResponseProjection.IssueCommentResponseProjection.issueComment", 0)));
        }
        this.typename();
        return this;
    }

    public UpdateIssueCommentPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateIssueCommentPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateIssueCommentPayloadResponseProjection issueComment(IssueCommentResponseProjection subProjection) {
        return issueComment(null, subProjection);
    }

    public UpdateIssueCommentPayloadResponseProjection issueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issueComment").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateIssueCommentPayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateIssueCommentPayloadResponseProjection typename(String alias) {
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
        final UpdateIssueCommentPayloadResponseProjection that = (UpdateIssueCommentPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
