package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddLabelsToLabelableInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> labelIds;
    @javax.validation.constraints.NotNull
    private String labelableId;

    public AddLabelsToLabelableInputTO() {
    }

    public AddLabelsToLabelableInputTO(String clientMutationId, java.util.List<String> labelIds, String labelableId) {
        this.clientMutationId = clientMutationId;
        this.labelIds = labelIds;
        this.labelableId = labelableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public java.util.List<String> getLabelIds() {
        return labelIds;
    }

    public String getLabelableId() {
        return labelableId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddLabelsToLabelableInputTO that = (AddLabelsToLabelableInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(labelIds, that.labelIds)
            && Objects.equals(labelableId, that.labelableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, labelIds, labelableId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (labelIds != null) {
            joiner.add("labelIds: " + GraphQLRequestSerializer.getEntry(labelIds));
        }
        if (labelableId != null) {
            joiner.add("labelableId: " + GraphQLRequestSerializer.getEntry(labelableId));
        }
        return joiner.toString();
    }

    public static AddLabelsToLabelableInputTO.Builder builder() {
        return new AddLabelsToLabelableInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private java.util.List<String> labelIds;
        private String labelableId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setLabelIds(java.util.List<String> labelIds) {
            this.labelIds = labelIds;
            return this;
        }

        public Builder setLabelableId(String labelableId) {
            this.labelableId = labelableId;
            return this;
        }


        public AddLabelsToLabelableInputTO build() {
            return new AddLabelsToLabelableInputTO(clientMutationId, labelIds, labelableId);
        }

    }
}
