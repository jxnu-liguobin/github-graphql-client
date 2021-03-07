package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateProjectInputTO implements java.io.Serializable {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String ownerId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> repositoryIds;
    private ProjectTemplateTO template;

    public CreateProjectInputTO() {
    }

    public CreateProjectInputTO(String body, String clientMutationId, String name, String ownerId, java.util.List<String> repositoryIds, ProjectTemplateTO template) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.ownerId = ownerId;
        this.repositoryIds = repositoryIds;
        this.template = template;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getName() {
        return name;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public java.util.List<String> getRepositoryIds() {
        return repositoryIds;
    }

    public ProjectTemplateTO getTemplate() {
        return template;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId));
        }
        if (repositoryIds != null) {
            joiner.add("repositoryIds: " + GraphQLRequestSerializer.getEntry(repositoryIds));
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template));
        }
        return joiner.toString();
    }

    public static CreateProjectInputTO.Builder builder() {
        return new CreateProjectInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String name;
        private String ownerId;
        private java.util.List<String> repositoryIds;
        private ProjectTemplateTO template;

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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setRepositoryIds(java.util.List<String> repositoryIds) {
            this.repositoryIds = repositoryIds;
            return this;
        }

        public Builder setTemplate(ProjectTemplateTO template) {
            this.template = template;
            return this;
        }


        public CreateProjectInputTO build() {
            return new CreateProjectInputTO(body, clientMutationId, name, ownerId, repositoryIds, template);
        }

    }
}
