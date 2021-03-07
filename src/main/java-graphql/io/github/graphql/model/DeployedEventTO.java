package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeployedEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private DeploymentTO deployment;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    private RefTO ref;

    public DeployedEventTO() {
    }

    public DeployedEventTO(ActorTO actor, String createdAt, Integer databaseId, DeploymentTO deployment, String id, PullRequestTO pullRequest, RefTO ref) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.deployment = deployment;
        this.id = id;
        this.pullRequest = pullRequest;
        this.ref = ref;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public DeploymentTO getDeployment() {
        return deployment;
    }

    public String getId() {
        return id;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public RefTO getRef() {
        return ref;
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
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (deployment != null) {
            joiner.add("deployment: " + GraphQLRequestSerializer.getEntry(deployment));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref));
        }
        return joiner.toString();
    }

    public static DeployedEventTO.Builder builder() {
        return new DeployedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private Integer databaseId;
        private DeploymentTO deployment;
        private String id;
        private PullRequestTO pullRequest;
        private RefTO ref;

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

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDeployment(DeploymentTO deployment) {
            this.deployment = deployment;
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

        public Builder setRef(RefTO ref) {
            this.ref = ref;
            return this;
        }


        public DeployedEventTO build() {
            return new DeployedEventTO(actor, createdAt, databaseId, deployment, id, pullRequest, ref);
        }

    }
}
