package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreateIssuePayloadTO that = (CreateIssuePayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(issue, that.issue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, issue);
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
