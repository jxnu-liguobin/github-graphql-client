package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreatePullRequestInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String baseRefName;
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String headRefName;
    private Boolean maintainerCanModify = true;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private String title;

    public CreatePullRequestInputTO() {
    }

    public CreatePullRequestInputTO(String baseRefName, String body, String clientMutationId, String headRefName, Boolean maintainerCanModify, String repositoryId, String title) {
        this.baseRefName = baseRefName;
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.headRefName = headRefName;
        this.maintainerCanModify = maintainerCanModify;
        this.repositoryId = repositoryId;
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

    public String getHeadRefName() {
        return headRefName;
    }

    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public String getTitle() {
        return title;
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
        if (headRefName != null) {
            joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName));
        }
        if (maintainerCanModify != null) {
            joiner.add("maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static CreatePullRequestInputTO.Builder builder() {
        return new CreatePullRequestInputTO.Builder();
    }

    public static class Builder {

        private String baseRefName;
        private String body;
        private String clientMutationId;
        private String headRefName;
        private Boolean maintainerCanModify = true;
        private String repositoryId;
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

        public Builder setHeadRefName(String headRefName) {
            this.headRefName = headRefName;
            return this;
        }

        public Builder setMaintainerCanModify(Boolean maintainerCanModify) {
            this.maintainerCanModify = maintainerCanModify;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public CreatePullRequestInputTO build() {
            return new CreatePullRequestInputTO(baseRefName, body, clientMutationId, headRefName, maintainerCanModify, repositoryId, title);
        }

    }
}
