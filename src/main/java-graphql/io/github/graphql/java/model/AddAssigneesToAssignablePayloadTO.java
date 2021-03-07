package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddAssigneesToAssignablePayloadTO implements java.io.Serializable {

    private AssignableTO assignable;
    private String clientMutationId;

    public AddAssigneesToAssignablePayloadTO() {
    }

    public AddAssigneesToAssignablePayloadTO(AssignableTO assignable, String clientMutationId) {
        this.assignable = assignable;
        this.clientMutationId = clientMutationId;
    }

    public AssignableTO getAssignable() {
        return assignable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddAssigneesToAssignablePayloadTO that = (AddAssigneesToAssignablePayloadTO) obj;
        return Objects.equals(assignable, that.assignable)
            && Objects.equals(clientMutationId, that.clientMutationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignable, clientMutationId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assignable != null) {
            joiner.add("assignable: " + GraphQLRequestSerializer.getEntry(assignable));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static AddAssigneesToAssignablePayloadTO.Builder builder() {
        return new AddAssigneesToAssignablePayloadTO.Builder();
    }

    public static class Builder {

        private AssignableTO assignable;
        private String clientMutationId;

        public Builder() {
        }

        public Builder setAssignable(AssignableTO assignable) {
            this.assignable = assignable;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public AddAssigneesToAssignablePayloadTO build() {
            return new AddAssigneesToAssignablePayloadTO(assignable, clientMutationId);
        }

    }
}
