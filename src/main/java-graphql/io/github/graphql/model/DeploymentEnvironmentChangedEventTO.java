package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeploymentEnvironmentChangedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private DeploymentStatusTO deploymentStatus;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;

    public DeploymentEnvironmentChangedEventTO() {
    }

    public DeploymentEnvironmentChangedEventTO(ActorTO actor, String createdAt, DeploymentStatusTO deploymentStatus, String id, PullRequestTO pullRequest) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.deploymentStatus = deploymentStatus;
        this.id = id;
        this.pullRequest = pullRequest;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DeploymentStatusTO getDeploymentStatus() {
        return deploymentStatus;
    }

    public String getId() {
        return id;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (deploymentStatus != null) {
            joiner.add("deploymentStatus: " + GraphQLRequestSerializer.getEntry(deploymentStatus));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        return joiner.toString();
    }

    public static DeploymentEnvironmentChangedEventTO.Builder builder() {
        return new DeploymentEnvironmentChangedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private DeploymentStatusTO deploymentStatus;
        private String id;
        private PullRequestTO pullRequest;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDeploymentStatus(DeploymentStatusTO deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }


        public DeploymentEnvironmentChangedEventTO build() {
            return new DeploymentEnvironmentChangedEventTO(actor, createdAt, deploymentStatus, id, pullRequest);
        }

    }
}
