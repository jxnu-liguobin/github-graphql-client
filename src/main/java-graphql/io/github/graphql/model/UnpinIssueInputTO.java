package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnpinIssueInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String issueId;

    public UnpinIssueInputTO() {
    }

    public UnpinIssueInputTO(String clientMutationId, String issueId) {
        this.clientMutationId = clientMutationId;
        this.issueId = issueId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getIssueId() {
        return issueId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (issueId != null) {
            joiner.add("issueId: " + GraphQLRequestSerializer.getEntry(issueId));
        }
        return joiner.toString();
    }

    public static UnpinIssueInputTO.Builder builder() {
        return new UnpinIssueInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String issueId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }


        public UnpinIssueInputTO build() {
            return new UnpinIssueInputTO(clientMutationId, issueId);
        }

    }
}
