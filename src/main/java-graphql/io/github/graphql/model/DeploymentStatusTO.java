package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeploymentStatusTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    private ActorTO creator;
    @javax.validation.constraints.NotNull
    private DeploymentTO deployment;
    private String description;
    private String environmentUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private String logUrl;
    @javax.validation.constraints.NotNull
    private DeploymentStatusStateTO state;
    @javax.validation.constraints.NotNull
    private String updatedAt;

    public DeploymentStatusTO() {
    }

    public DeploymentStatusTO(String createdAt, ActorTO creator, DeploymentTO deployment, String description, String environmentUrl, String id, String logUrl, DeploymentStatusStateTO state, String updatedAt) {
        this.createdAt = createdAt;
        this.creator = creator;
        this.deployment = deployment;
        this.description = description;
        this.environmentUrl = environmentUrl;
        this.id = id;
        this.logUrl = logUrl;
        this.state = state;
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ActorTO getCreator() {
        return creator;
    }

    public DeploymentTO getDeployment() {
        return deployment;
    }

    public String getDescription() {
        return description;
    }

    public String getEnvironmentUrl() {
        return environmentUrl;
    }

    public String getId() {
        return id;
    }

    public String getLogUrl() {
        return logUrl;
    }

    public DeploymentStatusStateTO getState() {
        return state;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (deployment != null) {
            joiner.add("deployment: " + GraphQLRequestSerializer.getEntry(deployment));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (environmentUrl != null) {
            joiner.add("environmentUrl: " + GraphQLRequestSerializer.getEntry(environmentUrl));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (logUrl != null) {
            joiner.add("logUrl: " + GraphQLRequestSerializer.getEntry(logUrl));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        return joiner.toString();
    }

    public static DeploymentStatusTO.Builder builder() {
        return new DeploymentStatusTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private ActorTO creator;
        private DeploymentTO deployment;
        private String description;
        private String environmentUrl;
        private String id;
        private String logUrl;
        private DeploymentStatusStateTO state;
        private String updatedAt;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreator(ActorTO creator) {
            this.creator = creator;
            return this;
        }

        public Builder setDeployment(DeploymentTO deployment) {
            this.deployment = deployment;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setEnvironmentUrl(String environmentUrl) {
            this.environmentUrl = environmentUrl;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLogUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }

        public Builder setState(DeploymentStatusStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public DeploymentStatusTO build() {
            return new DeploymentStatusTO(createdAt, creator, deployment, description, environmentUrl, id, logUrl, state, updatedAt);
        }

    }
}
