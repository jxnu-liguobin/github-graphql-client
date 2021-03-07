package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for DeleteBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteBranchProtectionRulePayloadResponseProjection extends GraphQLResponseProjection {

    public DeleteBranchProtectionRulePayloadResponseProjection() {
    }

    @Override
    public DeleteBranchProtectionRulePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public DeleteBranchProtectionRulePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        this.typename();
        return this;
    }

    public DeleteBranchProtectionRulePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public DeleteBranchProtectionRulePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public DeleteBranchProtectionRulePayloadResponseProjection typename() {
        return typename(null);
    }

    public DeleteBranchProtectionRulePayloadResponseProjection typename(String alias) {
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
        final DeleteBranchProtectionRulePayloadResponseProjection that = (DeleteBranchProtectionRulePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
