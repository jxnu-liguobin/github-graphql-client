package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnlockLockablePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private LockableTO unlockedRecord;

    public UnlockLockablePayloadTO() {
    }

    public UnlockLockablePayloadTO(String clientMutationId, LockableTO unlockedRecord) {
        this.clientMutationId = clientMutationId;
        this.unlockedRecord = unlockedRecord;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public LockableTO getUnlockedRecord() {
        return unlockedRecord;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (unlockedRecord != null) {
            joiner.add("unlockedRecord: " + GraphQLRequestSerializer.getEntry(unlockedRecord));
        }
        return joiner.toString();
    }

    public static UnlockLockablePayloadTO.Builder builder() {
        return new UnlockLockablePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private LockableTO unlockedRecord;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setUnlockedRecord(LockableTO unlockedRecord) {
            this.unlockedRecord = unlockedRecord;
            return this;
        }


        public UnlockLockablePayloadTO build() {
            return new UnlockLockablePayloadTO(clientMutationId, unlockedRecord);
        }

    }
}
