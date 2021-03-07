package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnmarkIssueAsDuplicateInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String canonicalId;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String duplicateId;

    public UnmarkIssueAsDuplicateInputTO() {
    }

    public UnmarkIssueAsDuplicateInputTO(String canonicalId, String clientMutationId, String duplicateId) {
        this.canonicalId = canonicalId;
        this.clientMutationId = clientMutationId;
        this.duplicateId = duplicateId;
    }

    public String getCanonicalId() {
        return canonicalId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getDuplicateId() {
        return duplicateId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (canonicalId != null) {
            joiner.add("canonicalId: " + GraphQLRequestSerializer.getEntry(canonicalId));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (duplicateId != null) {
            joiner.add("duplicateId: " + GraphQLRequestSerializer.getEntry(duplicateId));
        }
        return joiner.toString();
    }

    public static UnmarkIssueAsDuplicateInputTO.Builder builder() {
        return new UnmarkIssueAsDuplicateInputTO.Builder();
    }

    public static class Builder {

        private String canonicalId;
        private String clientMutationId;
        private String duplicateId;

        public Builder() {
        }

        public Builder setCanonicalId(String canonicalId) {
            this.canonicalId = canonicalId;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setDuplicateId(String duplicateId) {
            this.duplicateId = duplicateId;
            return this;
        }


        public UnmarkIssueAsDuplicateInputTO build() {
            return new UnmarkIssueAsDuplicateInputTO(canonicalId, clientMutationId, duplicateId);
        }

    }
}
