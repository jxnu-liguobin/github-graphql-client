package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RefTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String prefix;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private GitObjectTO target;

    public RefTO() {
    }

    public RefTO(String id, String name, String prefix, RepositoryTO repository, GitObjectTO target) {
        this.id = id;
        this.name = name;
        this.prefix = prefix;
        this.repository = repository;
        this.target = target;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public GitObjectTO getTarget() {
        return target;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RefTO that = (RefTO) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(prefix, that.prefix)
            && Objects.equals(repository, that.repository)
            && Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, prefix, repository, target);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (prefix != null) {
            joiner.add("prefix: " + GraphQLRequestSerializer.getEntry(prefix));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (target != null) {
            joiner.add("target: " + GraphQLRequestSerializer.getEntry(target));
        }
        return joiner.toString();
    }

    public static RefTO.Builder builder() {
        return new RefTO.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String prefix;
        private RepositoryTO repository;
        private GitObjectTO target;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setTarget(GitObjectTO target) {
            this.target = target;
            return this;
        }


        public RefTO build() {
            return new RefTO(id, name, prefix, repository, target);
        }

    }
}
