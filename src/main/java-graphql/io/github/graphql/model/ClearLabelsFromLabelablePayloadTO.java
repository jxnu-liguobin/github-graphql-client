package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ClearLabelsFromLabelablePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private LabelableTO labelable;

    public ClearLabelsFromLabelablePayloadTO() {
    }

    public ClearLabelsFromLabelablePayloadTO(String clientMutationId, LabelableTO labelable) {
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

    public static ClearLabelsFromLabelablePayloadTO.Builder builder() {
        return new ClearLabelsFromLabelablePayloadTO.Builder();
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


        public ClearLabelsFromLabelablePayloadTO build() {
            return new ClearLabelsFromLabelablePayloadTO(clientMutationId, labelable);
        }

    }
}
