package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TreeEntryTO implements java.io.Serializable {

    private int mode;
    @javax.validation.constraints.NotNull
    private String name;
    private GitObjectTO object;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String type;

    public TreeEntryTO() {
    }

    public TreeEntryTO(int mode, String name, GitObjectTO object, String oid, RepositoryTO repository, String type) {
        this.mode = mode;
        this.name = name;
        this.object = object;
        this.oid = oid;
        this.repository = repository;
        this.type = type;
    }

    public int getMode() {
        return mode;
    }

    public String getName() {
        return name;
    }

    public GitObjectTO getObject() {
        return object;
    }

    public String getOid() {
        return oid;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TreeEntryTO that = (TreeEntryTO) obj;
        return Objects.equals(mode, that.mode)
            && Objects.equals(name, that.name)
            && Objects.equals(object, that.object)
            && Objects.equals(oid, that.oid)
            && Objects.equals(repository, that.repository)
            && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, name, object, oid, repository, type);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("mode: " + GraphQLRequestSerializer.getEntry(mode));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (object != null) {
            joiner.add("object: " + GraphQLRequestSerializer.getEntry(object));
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

    public static TreeEntryTO.Builder builder() {
        return new TreeEntryTO.Builder();
    }

    public static class Builder {

        private int mode;
        private String name;
        private GitObjectTO object;
        private String oid;
        private RepositoryTO repository;
        private String type;

        public Builder() {
        }

        public Builder setMode(int mode) {
            this.mode = mode;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setObject(GitObjectTO object) {
            this.object = object;
            return this;
        }

        public Builder setOid(String oid) {
            this.oid = oid;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }


        public TreeEntryTO build() {
            return new TreeEntryTO(mode, name, object, oid, repository, type);
        }

    }
}
