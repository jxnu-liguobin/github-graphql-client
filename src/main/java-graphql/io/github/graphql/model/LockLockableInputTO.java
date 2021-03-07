package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class LockLockableInputTO implements java.io.Serializable {

    private String clientMutationId;
    private LockReasonTO lockReason;
    @javax.validation.constraints.NotNull
    private String lockableId;

    public LockLockableInputTO() {
    }

    public LockLockableInputTO(String clientMutationId, LockReasonTO lockReason, String lockableId) {
        this.clientMutationId = clientMutationId;
        this.lockReason = lockReason;
        this.lockableId = lockableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public LockReasonTO getLockReason() {
        return lockReason;
    }

    public String getLockableId() {
        return lockableId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (lockReason != null) {
            joiner.add("lockReason: " + GraphQLRequestSerializer.getEntry(lockReason));
        }
        if (lockableId != null) {
            joiner.add("lockableId: " + GraphQLRequestSerializer.getEntry(lockableId));
        }
        return joiner.toString();
    }

    public static LockLockableInputTO.Builder builder() {
        return new LockLockableInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private LockReasonTO lockReason;
        private String lockableId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setLockReason(LockReasonTO lockReason) {
            this.lockReason = lockReason;
            return this;
        }

        public Builder setLockableId(String lockableId) {
            this.lockableId = lockableId;
            return this;
        }


        public LockLockableInputTO build() {
            return new LockLockableInputTO(clientMutationId, lockReason, lockableId);
        }

    }
}
