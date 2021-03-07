package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateProjectCardInputTO implements java.io.Serializable {

    private String clientMutationId;
    private Boolean isArchived;
    private String note;
    @javax.validation.constraints.NotNull
    private String projectCardId;

    public UpdateProjectCardInputTO() {
    }

    public UpdateProjectCardInputTO(String clientMutationId, Boolean isArchived, String note, String projectCardId) {
        this.clientMutationId = clientMutationId;
        this.isArchived = isArchived;
        this.note = note;
        this.projectCardId = projectCardId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }

    public String getNote() {
        return note;
    }

    public String getProjectCardId() {
        return projectCardId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateProjectCardInputTO that = (UpdateProjectCardInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(isArchived, that.isArchived)
            && Objects.equals(note, that.note)
            && Objects.equals(projectCardId, that.projectCardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, isArchived, note, projectCardId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (isArchived != null) {
            joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (projectCardId != null) {
            joiner.add("projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId));
        }
        return joiner.toString();
    }

    public static UpdateProjectCardInputTO.Builder builder() {
        return new UpdateProjectCardInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private Boolean isArchived;
        private String note;
        private String projectCardId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setIsArchived(Boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setProjectCardId(String projectCardId) {
            this.projectCardId = projectCardId;
            return this;
        }


        public UpdateProjectCardInputTO build() {
            return new UpdateProjectCardInputTO(clientMutationId, isArchived, note, projectCardId);
        }

    }
}
