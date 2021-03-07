package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for DeleteIssueCommentPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteIssueCommentPayloadResponseProjection extends GraphQLResponseProjection {

    public DeleteIssueCommentPayloadResponseProjection() {
    }

    @Override
    public DeleteIssueCommentPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeleteIssueCommentPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        this.typename();
        return this;
    }

    public DeleteIssueCommentPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteIssueCommentPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteIssueCommentPayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteIssueCommentPayloadResponseProjection typename(String alias) {
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
        final DeleteIssueCommentPayloadResponseProjection that = (DeleteIssueCommentPayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
