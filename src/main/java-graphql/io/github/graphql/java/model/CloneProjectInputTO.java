package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CloneProjectInputTO implements java.io.Serializable {

    private String body;
    private String clientMutationId;
    private boolean includeWorkflows;
    @javax.validation.constraints.NotNull
    private String name;
    private Boolean Public;
    @javax.validation.constraints.NotNull
    private String sourceId;
    @javax.validation.constraints.NotNull
    private String targetOwnerId;

    public CloneProjectInputTO() {
    }

    public CloneProjectInputTO(String body, String clientMutationId, boolean includeWorkflows, String name, Boolean Public, String sourceId, String targetOwnerId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.includeWorkflows = includeWorkflows;
        this.name = name;
        this.Public = Public;
        this.sourceId = sourceId;
        this.targetOwnerId = targetOwnerId;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public boolean getIncludeWorkflows() {
        return includeWorkflows;
    }

    public String getName() {
        return name;
    }

    public Boolean getPublic() {
        return Public;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getTargetOwnerId() {
        return targetOwnerId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CloneProjectInputTO that = (CloneProjectInputTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(includeWorkflows, that.includeWorkflows)
            && Objects.equals(name, that.name)
            && Objects.equals(Public, that.Public)
            && Objects.equals(sourceId, that.sourceId)
            && Objects.equals(targetOwnerId, that.targetOwnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, clientMutationId, includeWorkflows, name, Public, sourceId, targetOwnerId);
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
        joiner.add("includeWorkflows: " + GraphQLRequestSerializer.getEntry(includeWorkflows));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (Public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(Public));
        }
        if (sourceId != null) {
            joiner.add("sourceId: " + GraphQLRequestSerializer.getEntry(sourceId));
        }
        if (targetOwnerId != null) {
            joiner.add("targetOwnerId: " + GraphQLRequestSerializer.getEntry(targetOwnerId));
        }
        return joiner.toString();
    }

    public static CloneProjectInputTO.Builder builder() {
        return new CloneProjectInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private boolean includeWorkflows;
        private String name;
        private Boolean Public;
        private String sourceId;
        private String targetOwnerId;

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

        public Builder setIncludeWorkflows(boolean includeWorkflows) {
            this.includeWorkflows = includeWorkflows;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPublic(Boolean Public) {
            this.Public = Public;
            return this;
        }

        public Builder setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder setTargetOwnerId(String targetOwnerId) {
            this.targetOwnerId = targetOwnerId;
            return this;
        }


        public CloneProjectInputTO build() {
            return new CloneProjectInputTO(body, clientMutationId, includeWorkflows, name, Public, sourceId, targetOwnerId);
        }

    }
}
