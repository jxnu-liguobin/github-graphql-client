package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LinkRepositoryToProjectPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectTO project;
    private RepositoryTO repository;

    public LinkRepositoryToProjectPayloadTO() {
    }

    public LinkRepositoryToProjectPayloadTO(String clientMutationId, ProjectTO project, RepositoryTO repository) {
        this.clientMutationId = clientMutationId;
        this.project = project;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectTO getProject() {
        return project;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final LinkRepositoryToProjectPayloadTO that = (LinkRepositoryToProjectPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(project, that.project)
            && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, project, repository);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static LinkRepositoryToProjectPayloadTO.Builder builder() {
        return new LinkRepositoryToProjectPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectTO project;
        private RepositoryTO repository;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }


        public LinkRepositoryToProjectPayloadTO build() {
            return new LinkRepositoryToProjectPayloadTO(clientMutationId, project, repository);
        }

    }
}
