package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddAssigneesToAssignableInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String assignableId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> assigneeIds;
    private String clientMutationId;

    public AddAssigneesToAssignableInputTO() {
    }

    public AddAssigneesToAssignableInputTO(String assignableId, java.util.List<String> assigneeIds, String clientMutationId) {
        this.assignableId = assignableId;
        this.assigneeIds = assigneeIds;
        this.clientMutationId = clientMutationId;
    }

    public String getAssignableId() {
        return assignableId;
    }

    public java.util.List<String> getAssigneeIds() {
        return assigneeIds;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assignableId != null) {
            joiner.add("assignableId: " + GraphQLRequestSerializer.getEntry(assignableId));
        }
        if (assigneeIds != null) {
            joiner.add("assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static AddAssigneesToAssignableInputTO.Builder builder() {
        return new AddAssigneesToAssignableInputTO.Builder();
    }

    public static class Builder {

        private String assignableId;
        private java.util.List<String> assigneeIds;
        private String clientMutationId;

        public Builder() {
        }

        public Builder setAssignableId(String assignableId) {
            this.assignableId = assignableId;
            return this;
        }

        public Builder setAssigneeIds(java.util.List<String> assigneeIds) {
            this.assigneeIds = assigneeIds;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public AddAssigneesToAssignableInputTO build() {
            return new AddAssigneesToAssignableInputTO(assignableId, assigneeIds, clientMutationId);
        }

    }
}
