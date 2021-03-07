package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddProjectCardInputTO implements java.io.Serializable {

    private String clientMutationId;
    private String contentId;
    private String note;
    @javax.validation.constraints.NotNull
    private String projectColumnId;

    public AddProjectCardInputTO() {
    }

    public AddProjectCardInputTO(String clientMutationId, String contentId, String note, String projectColumnId) {
        this.clientMutationId = clientMutationId;
        this.contentId = contentId;
        this.note = note;
        this.projectColumnId = projectColumnId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getContentId() {
        return contentId;
    }

    public String getNote() {
        return note;
    }

    public String getProjectColumnId() {
        return projectColumnId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddProjectCardInputTO that = (AddProjectCardInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(contentId, that.contentId)
            && Objects.equals(note, that.note)
            && Objects.equals(projectColumnId, that.projectColumnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, contentId, note, projectColumnId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (contentId != null) {
            joiner.add("contentId: " + GraphQLRequestSerializer.getEntry(contentId));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (projectColumnId != null) {
            joiner.add("projectColumnId: " + GraphQLRequestSerializer.getEntry(projectColumnId));
        }
        return joiner.toString();
    }

    public static AddProjectCardInputTO.Builder builder() {
        return new AddProjectCardInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String contentId;
        private String note;
        private String projectColumnId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setContentId(String contentId) {
            this.contentId = contentId;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setProjectColumnId(String projectColumnId) {
            this.projectColumnId = projectColumnId;
            return this;
        }


        public AddProjectCardInputTO build() {
            return new AddProjectCardInputTO(clientMutationId, contentId, note, projectColumnId);
        }

    }
}
