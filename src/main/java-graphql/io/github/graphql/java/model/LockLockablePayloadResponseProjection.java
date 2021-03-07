package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for LockLockablePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LockLockablePayloadResponseProjection extends GraphQLResponseProjection {

    public LockLockablePayloadResponseProjection() {
    }

    @Override
    public LockLockablePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LockLockablePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0) <= maxDepth) {
            projectionDepthOnFields.put("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0) + 1);
            this.lockedRecord(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LockLockablePayloadResponseProjection.LockableResponseProjection.lockedRecord", 0)));
        }
        this.typename();
        return this;
    }

    public LockLockablePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public LockLockablePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public LockLockablePayloadResponseProjection lockedRecord(LockableResponseProjection subProjection) {
        return lockedRecord(null, subProjection);
    }

    public LockLockablePayloadResponseProjection lockedRecord(String alias, LockableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lockedRecord").alias(alias).projection(subProjection));
        return this;
    }

    public LockLockablePayloadResponseProjection typename() {
        return typename(null);
    }

    public LockLockablePayloadResponseProjection typename(String alias) {
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
        final LockLockablePayloadResponseProjection that = (LockLockablePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
