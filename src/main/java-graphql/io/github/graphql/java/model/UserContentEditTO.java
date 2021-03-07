package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserContentEditTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    private String deletedAt;
    private ActorTO deletedBy;
    private String diff;
    @javax.validation.constraints.NotNull
    private String editedAt;
    private ActorTO editor;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String updatedAt;

    public UserContentEditTO() {
    }

    public UserContentEditTO(String createdAt, String deletedAt, ActorTO deletedBy, String diff, String editedAt, ActorTO editor, String id, String updatedAt) {
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.deletedBy = deletedBy;
        this.diff = diff;
        this.editedAt = editedAt;
        this.editor = editor;
        this.id = id;
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public ActorTO getDeletedBy() {
        return deletedBy;
    }

    public String getDiff() {
        return diff;
    }

    public String getEditedAt() {
        return editedAt;
    }

    public ActorTO getEditor() {
        return editor;
    }

    public String getId() {
        return id;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UserContentEditTO that = (UserContentEditTO) obj;
        return Objects.equals(createdAt, that.createdAt)
            && Objects.equals(deletedAt, that.deletedAt)
            && Objects.equals(deletedBy, that.deletedBy)
            && Objects.equals(diff, that.diff)
            && Objects.equals(editedAt, that.editedAt)
            && Objects.equals(editor, that.editor)
            && Objects.equals(id, that.id)
            && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, deletedAt, deletedBy, diff, editedAt, editor, id, updatedAt);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (deletedAt != null) {
            joiner.add("deletedAt: " + GraphQLRequestSerializer.getEntry(deletedAt));
        }
        if (deletedBy != null) {
            joiner.add("deletedBy: " + GraphQLRequestSerializer.getEntry(deletedBy));
        }
        if (diff != null) {
            joiner.add("diff: " + GraphQLRequestSerializer.getEntry(diff));
        }
        if (editedAt != null) {
            joiner.add("editedAt: " + GraphQLRequestSerializer.getEntry(editedAt));
        }
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        return joiner.toString();
    }

    public static UserContentEditTO.Builder builder() {
        return new UserContentEditTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private String deletedAt;
        private ActorTO deletedBy;
        private String diff;
        private String editedAt;
        private ActorTO editor;
        private String id;
        private String updatedAt;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDeletedAt(String deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public Builder setDeletedBy(ActorTO deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public Builder setDiff(String diff) {
            this.diff = diff;
            return this;
        }

        public Builder setEditedAt(String editedAt) {
            this.editedAt = editedAt;
            return this;
        }

        public Builder setEditor(ActorTO editor) {
            this.editor = editor;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public UserContentEditTO build() {
            return new UserContentEditTO(createdAt, deletedAt, deletedBy, diff, editedAt, editor, id, updatedAt);
        }

    }
}
