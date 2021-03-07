package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnlockLockableInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String lockableId;

    public UnlockLockableInputTO() {
    }

    public UnlockLockableInputTO(String clientMutationId, String lockableId) {
        this.clientMutationId = clientMutationId;
        this.lockableId = lockableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
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
        if (lockableId != null) {
            joiner.add("lockableId: " + GraphQLRequestSerializer.getEntry(lockableId));
        }
        return joiner.toString();
    }

    public static UnlockLockableInputTO.Builder builder() {
        return new UnlockLockableInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String lockableId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setLockableId(String lockableId) {
            this.lockableId = lockableId;
            return this;
        }


        public UnlockLockableInputTO build() {
            return new UnlockLockableInputTO(clientMutationId, lockableId);
        }

    }
}
