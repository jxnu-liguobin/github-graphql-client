package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ChangeUserStatusPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private UserStatusTO status;

    public ChangeUserStatusPayloadTO() {
    }

    public ChangeUserStatusPayloadTO(String clientMutationId, UserStatusTO status) {
        this.clientMutationId = clientMutationId;
        this.status = status;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public UserStatusTO getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ChangeUserStatusPayloadTO that = (ChangeUserStatusPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, status);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        return joiner.toString();
    }

    public static ChangeUserStatusPayloadTO.Builder builder() {
        return new ChangeUserStatusPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private UserStatusTO status;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setStatus(UserStatusTO status) {
            this.status = status;
            return this;
        }


        public ChangeUserStatusPayloadTO build() {
            return new ChangeUserStatusPayloadTO(clientMutationId, status);
        }

    }
}
