package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeploymentTO implements java.io.Serializable, NodeTO {

    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private String commitOid;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private ActorTO creator;
    private Integer databaseId;
    private String description;
    private String environment;
    @javax.validation.constraints.NotNull
    private String id;
    private DeploymentStatusTO latestStatus;
    private String payload;
    private RefTO ref;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    private DeploymentStateTO state;
    private String task;
    @javax.validation.constraints.NotNull
    private String updatedAt;

    public DeploymentTO() {
    }

    public DeploymentTO(CommitTO commit, String commitOid, String createdAt, ActorTO creator, Integer databaseId, String description, String environment, String id, DeploymentStatusTO latestStatus, String payload, RefTO ref, RepositoryTO repository, DeploymentStateTO state, String task, String updatedAt) {
        this.commit = commit;
        this.commitOid = commitOid;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.description = description;
        this.environment = environment;
        this.id = id;
        this.latestStatus = latestStatus;
        this.payload = payload;
        this.ref = ref;
        this.repository = repository;
        this.state = state;
        this.task = task;
        this.updatedAt = updatedAt;
    }

    public CommitTO getCommit() {
        return commit;
    }

    public String getCommitOid() {
        return commitOid;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ActorTO getCreator() {
        return creator;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getDescription() {
        return description;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getId() {
        return id;
    }

    public DeploymentStatusTO getLatestStatus() {
        return latestStatus;
    }

    public String getPayload() {
        return payload;
    }

    public RefTO getRef() {
        return ref;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public DeploymentStateTO getState() {
        return state;
    }

    public String getTask() {
        return task;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit));
        }
        if (commitOid != null) {
            joiner.add("commitOid: " + GraphQLRequestSerializer.getEntry(commitOid));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (environment != null) {
            joiner.add("environment: " + GraphQLRequestSerializer.getEntry(environment));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (latestStatus != null) {
            joiner.add("latestStatus: " + GraphQLRequestSerializer.getEntry(latestStatus));
        }
        if (payload != null) {
            joiner.add("payload: " + GraphQLRequestSerializer.getEntry(payload));
        }
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (task != null) {
            joiner.add("task: " + GraphQLRequestSerializer.getEntry(task));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        return joiner.toString();
    }

    public static DeploymentTO.Builder builder() {
        return new DeploymentTO.Builder();
    }

    public static class Builder {

        private CommitTO commit;
        private String commitOid;
        private String createdAt;
        private ActorTO creator;
        private Integer databaseId;
        private String description;
        private String environment;
        private String id;
        private DeploymentStatusTO latestStatus;
        private String payload;
        private RefTO ref;
        private RepositoryTO repository;
        private DeploymentStateTO state;
        private String task;
        private String updatedAt;

        public Builder() {
        }

        public Builder setCommit(CommitTO commit) {
            this.commit = commit;
            return this;
        }

        public Builder setCommitOid(String commitOid) {
            this.commitOid = commitOid;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreator(ActorTO creator) {
            this.creator = creator;
            return this;
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLatestStatus(DeploymentStatusTO latestStatus) {
            this.latestStatus = latestStatus;
            return this;
        }

        public Builder setPayload(String payload) {
            this.payload = payload;
            return this;
        }

        public Builder setRef(RefTO ref) {
            this.ref = ref;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setState(DeploymentStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setTask(String task) {
            this.task = task;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public DeploymentTO build() {
            return new DeploymentTO(commit, commitOid, createdAt, creator, databaseId, description, environment, id, latestStatus, payload, ref, repository, state, task, updatedAt);
        }

    }
}
