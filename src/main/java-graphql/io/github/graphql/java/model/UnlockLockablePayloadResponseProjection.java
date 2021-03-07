package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UnlockLockablePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UnlockLockablePayloadResponseProjection extends GraphQLResponseProjection {

    public UnlockLockablePayloadResponseProjection() {
    }

    @Override
    public UnlockLockablePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnlockLockablePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0) + 1);
            this.unlockedRecord(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlockLockablePayloadResponseProjection.LockableResponseProjection.unlockedRecord", 0)));
        }
        this.typename();
        return this;
    }

    public UnlockLockablePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UnlockLockablePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UnlockLockablePayloadResponseProjection unlockedRecord(LockableResponseProjection subProjection) {
        return unlockedRecord(null, subProjection);
    }

    public UnlockLockablePayloadResponseProjection unlockedRecord(String alias, LockableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("unlockedRecord").alias(alias).projection(subProjection));
        return this;
    }

    public UnlockLockablePayloadResponseProjection typename() {
        return typename(null);
    }

    public UnlockLockablePayloadResponseProjection typename(String alias) {
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
        final UnlockLockablePayloadResponseProjection that = (UnlockLockablePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
