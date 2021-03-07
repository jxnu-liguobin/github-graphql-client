package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MergePullRequestInputTO implements java.io.Serializable {

    private String clientMutationId;
    private String commitBody;
    private String commitHeadline;
    private String expectedHeadOid;
    @javax.validation.constraints.NotNull
    private String pullRequestId;

    public MergePullRequestInputTO() {
    }

    public MergePullRequestInputTO(String clientMutationId, String commitBody, String commitHeadline, String expectedHeadOid, String pullRequestId) {
        this.clientMutationId = clientMutationId;
        this.commitBody = commitBody;
        this.commitHeadline = commitHeadline;
        this.expectedHeadOid = expectedHeadOid;
        this.pullRequestId = pullRequestId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getCommitBody() {
        return commitBody;
    }

    public String getCommitHeadline() {
        return commitHeadline;
    }

    public String getExpectedHeadOid() {
        return expectedHeadOid;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MergePullRequestInputTO that = (MergePullRequestInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(commitBody, that.commitBody)
            && Objects.equals(commitHeadline, that.commitHeadline)
            && Objects.equals(expectedHeadOid, that.expectedHeadOid)
            && Objects.equals(pullRequestId, that.pullRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, commitBody, commitHeadline, expectedHeadOid, pullRequestId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (commitBody != null) {
            joiner.add("commitBody: " + GraphQLRequestSerializer.getEntry(commitBody));
        }
        if (commitHeadline != null) {
            joiner.add("commitHeadline: " + GraphQLRequestSerializer.getEntry(commitHeadline));
        }
        if (expectedHeadOid != null) {
            joiner.add("expectedHeadOid: " + GraphQLRequestSerializer.getEntry(expectedHeadOid));
        }
        if (pullRequestId != null) {
            joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId));
        }
        return joiner.toString();
    }

    public static MergePullRequestInputTO.Builder builder() {
        return new MergePullRequestInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String commitBody;
        private String commitHeadline;
        private String expectedHeadOid;
        private String pullRequestId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setCommitBody(String commitBody) {
            this.commitBody = commitBody;
            return this;
        }

        public Builder setCommitHeadline(String commitHeadline) {
            this.commitHeadline = commitHeadline;
            return this;
        }

        public Builder setExpectedHeadOid(String expectedHeadOid) {
            this.expectedHeadOid = expectedHeadOid;
            return this;
        }

        public Builder setPullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }


        public MergePullRequestInputTO build() {
            return new MergePullRequestInputTO(clientMutationId, commitBody, commitHeadline, expectedHeadOid, pullRequestId);
        }

    }
}
