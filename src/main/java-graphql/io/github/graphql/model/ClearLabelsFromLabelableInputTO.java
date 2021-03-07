package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ClearLabelsFromLabelableInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String labelableId;

    public ClearLabelsFromLabelableInputTO() {
    }

    public ClearLabelsFromLabelableInputTO(String clientMutationId, String labelableId) {
        this.clientMutationId = clientMutationId;
        this.labelableId = labelableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getLabelableId() {
        return labelableId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (labelableId != null) {
            joiner.add("labelableId: " + GraphQLRequestSerializer.getEntry(labelableId));
        }
        return joiner.toString();
    }

    public static ClearLabelsFromLabelableInputTO.Builder builder() {
        return new ClearLabelsFromLabelableInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String labelableId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setLabelableId(String labelableId) {
            this.labelableId = labelableId;
            return this;
        }


        public ClearLabelsFromLabelableInputTO build() {
            return new ClearLabelsFromLabelableInputTO(clientMutationId, labelableId);
        }

    }
}
