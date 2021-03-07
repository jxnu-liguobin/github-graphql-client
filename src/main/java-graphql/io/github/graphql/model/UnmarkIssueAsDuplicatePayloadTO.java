package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UnmarkIssueAsDuplicatePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private IssueOrPullRequestTO duplicate;

    public UnmarkIssueAsDuplicatePayloadTO() {
    }

    public UnmarkIssueAsDuplicatePayloadTO(String clientMutationId, IssueOrPullRequestTO duplicate) {
        this.clientMutationId = clientMutationId;
        this.duplicate = duplicate;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public IssueOrPullRequestTO getDuplicate() {
        return duplicate;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (duplicate != null) {
            joiner.add("duplicate: " + GraphQLRequestSerializer.getEntry(duplicate));
        }
        return joiner.toString();
    }

    public static UnmarkIssueAsDuplicatePayloadTO.Builder builder() {
        return new UnmarkIssueAsDuplicatePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private IssueOrPullRequestTO duplicate;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setDuplicate(IssueOrPullRequestTO duplicate) {
            this.duplicate = duplicate;
            return this;
        }


        public UnmarkIssueAsDuplicatePayloadTO build() {
            return new UnmarkIssueAsDuplicatePayloadTO(clientMutationId, duplicate);
        }

    }
}
