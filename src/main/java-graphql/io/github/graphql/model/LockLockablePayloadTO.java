package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LockLockablePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private LockableTO lockedRecord;

    public LockLockablePayloadTO() {
    }

    public LockLockablePayloadTO(String clientMutationId, LockableTO lockedRecord) {
        this.clientMutationId = clientMutationId;
        this.lockedRecord = lockedRecord;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public LockableTO getLockedRecord() {
        return lockedRecord;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (lockedRecord != null) {
            joiner.add("lockedRecord: " + GraphQLRequestSerializer.getEntry(lockedRecord));
        }
        return joiner.toString();
    }

    public static LockLockablePayloadTO.Builder builder() {
        return new LockLockablePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private LockableTO lockedRecord;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setLockedRecord(LockableTO lockedRecord) {
            this.lockedRecord = lockedRecord;
            return this;
        }


        public LockLockablePayloadTO build() {
            return new LockLockablePayloadTO(clientMutationId, lockedRecord);
        }

    }
}
