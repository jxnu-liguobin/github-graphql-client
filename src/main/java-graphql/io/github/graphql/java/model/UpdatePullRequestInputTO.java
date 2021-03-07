package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdatePullRequestInputTO implements java.io.Serializable {

    private String baseRefName;
    private String body;
    private String clientMutationId;
    private Boolean maintainerCanModify;
    @javax.validation.constraints.NotNull
    private String pullRequestId;
    private String title;

    public UpdatePullRequestInputTO() {
    }

    public UpdatePullRequestInputTO(String baseRefName, String body, String clientMutationId, Boolean maintainerCanModify, String pullRequestId, String title) {
        this.baseRefName = baseRefName;
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.maintainerCanModify = maintainerCanModify;
        this.pullRequestId = pullRequestId;
        this.title = title;
    }

    public String getBaseRefName() {
        return baseRefName;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdatePullRequestInputTO that = (UpdatePullRequestInputTO) obj;
        return Objects.equals(baseRefName, that.baseRefName)
            && Objects.equals(body, that.body)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(maintainerCanModify, that.maintainerCanModify)
            && Objects.equals(pullRequestId, that.pullRequestId)
            && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseRefName, body, clientMutationId, maintainerCanModify, pullRequestId, title);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (baseRefName != null) {
            joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName));
        }
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (maintainerCanModify != null) {
            joiner.add("maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify));
        }
        if (pullRequestId != null) {
            joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static UpdatePullRequestInputTO.Builder builder() {
        return new UpdatePullRequestInputTO.Builder();
    }

    public static class Builder {

        private String baseRefName;
        private String body;
        private String clientMutationId;
        private Boolean maintainerCanModify;
        private String pullRequestId;
        private String title;

        public Builder() {
        }

        public Builder setBaseRefName(String baseRefName) {
            this.baseRefName = baseRefName;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setMaintainerCanModify(Boolean maintainerCanModify) {
            this.maintainerCanModify = maintainerCanModify;
            return this;
        }

        public Builder setPullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public UpdatePullRequestInputTO build() {
            return new UpdatePullRequestInputTO(baseRefName, body, clientMutationId, maintainerCanModify, pullRequestId, title);
        }

    }
}
