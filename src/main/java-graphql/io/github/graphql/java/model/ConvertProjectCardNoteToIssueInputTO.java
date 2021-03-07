package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ConvertProjectCardNoteToIssueInputTO implements java.io.Serializable {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String projectCardId;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    private String title;

    public ConvertProjectCardNoteToIssueInputTO() {
    }

    public ConvertProjectCardNoteToIssueInputTO(String body, String clientMutationId, String projectCardId, String repositoryId, String title) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.projectCardId = projectCardId;
        this.repositoryId = repositoryId;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getProjectCardId() {
        return projectCardId;
    }

    public String getRepositoryId() {
        return repositoryId;
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
        final ConvertProjectCardNoteToIssueInputTO that = (ConvertProjectCardNoteToIssueInputTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(projectCardId, that.projectCardId)
            && Objects.equals(repositoryId, that.repositoryId)
            && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, clientMutationId, projectCardId, repositoryId, title);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (projectCardId != null) {
            joiner.add("projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static ConvertProjectCardNoteToIssueInputTO.Builder builder() {
        return new ConvertProjectCardNoteToIssueInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String projectCardId;
        private String repositoryId;
        private String title;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setProjectCardId(String projectCardId) {
            this.projectCardId = projectCardId;
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


        public ConvertProjectCardNoteToIssueInputTO build() {
            return new ConvertProjectCardNoteToIssueInputTO(body, clientMutationId, projectCardId, repositoryId, title);
        }

    }
}
