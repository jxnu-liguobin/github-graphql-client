package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RemoveStarInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String starrableId;

    public RemoveStarInputTO() {
    }

    public RemoveStarInputTO(String clientMutationId, String starrableId) {
        this.clientMutationId = clientMutationId;
        this.starrableId = starrableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getStarrableId() {
        return starrableId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RemoveStarInputTO that = (RemoveStarInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(starrableId, that.starrableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, starrableId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (starrableId != null) {
            joiner.add("starrableId: " + GraphQLRequestSerializer.getEntry(starrableId));
        }
        return joiner.toString();
    }

    public static RemoveStarInputTO.Builder builder() {
        return new RemoveStarInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String starrableId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setStarrableId(String starrableId) {
            this.starrableId = starrableId;
            return this;
        }


        public RemoveStarInputTO build() {
            return new RemoveStarInputTO(clientMutationId, starrableId);
        }

    }
}
