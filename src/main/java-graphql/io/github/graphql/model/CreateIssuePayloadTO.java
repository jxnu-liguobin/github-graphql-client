package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreateIssuePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private IssueTO issue;

    public CreateIssuePayloadTO() {
    }

    public CreateIssuePayloadTO(String clientMutationId, IssueTO issue) {
        this.clientMutationId = clientMutationId;
        this.issue = issue;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public IssueTO getIssue() {
        return issue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (issue != null) {
            joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue));
        }
        return joiner.toString();
    }

    public static CreateIssuePayloadTO.Builder builder() {
        return new CreateIssuePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private IssueTO issue;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setIssue(IssueTO issue) {
            this.issue = issue;
            return this;
        }


        public CreateIssuePayloadTO build() {
            return new CreateIssuePayloadTO(clientMutationId, issue);
        }

    }
}
