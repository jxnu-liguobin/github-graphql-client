package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CloneProjectPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private String jobStatusId;
    private ProjectTO project;

    public CloneProjectPayloadTO() {
    }

    public CloneProjectPayloadTO(String clientMutationId, String jobStatusId, ProjectTO project) {
        this.clientMutationId = clientMutationId;
        this.jobStatusId = jobStatusId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getJobStatusId() {
        return jobStatusId;
    }

    public ProjectTO getProject() {
        return project;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CloneProjectPayloadTO that = (CloneProjectPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(jobStatusId, that.jobStatusId)
            && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, jobStatusId, project);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (jobStatusId != null) {
            joiner.add("jobStatusId: " + GraphQLRequestSerializer.getEntry(jobStatusId));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        return joiner.toString();
    }

    public static CloneProjectPayloadTO.Builder builder() {
        return new CloneProjectPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String jobStatusId;
        private ProjectTO project;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setJobStatusId(String jobStatusId) {
            this.jobStatusId = jobStatusId;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }


        public CloneProjectPayloadTO build() {
            return new CloneProjectPayloadTO(clientMutationId, jobStatusId, project);
        }

    }
}
