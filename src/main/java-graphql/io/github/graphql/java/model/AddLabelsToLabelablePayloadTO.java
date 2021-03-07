package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddLabelsToLabelablePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private LabelableTO labelable;

    public AddLabelsToLabelablePayloadTO() {
    }

    public AddLabelsToLabelablePayloadTO(String clientMutationId, LabelableTO labelable) {
        this.clientMutationId = clientMutationId;
        this.labelable = labelable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public LabelableTO getLabelable() {
        return labelable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddLabelsToLabelablePayloadTO that = (AddLabelsToLabelablePayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(labelable, that.labelable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, labelable);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (labelable != null) {
            joiner.add("labelable: " + GraphQLRequestSerializer.getEntry(labelable));
        }
        return joiner.toString();
    }

    public static AddLabelsToLabelablePayloadTO.Builder builder() {
        return new AddLabelsToLabelablePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private LabelableTO labelable;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setLabelable(LabelableTO labelable) {
            this.labelable = labelable;
            return this;
        }


        public AddLabelsToLabelablePayloadTO build() {
            return new AddLabelsToLabelablePayloadTO(clientMutationId, labelable);
        }

    }
}
