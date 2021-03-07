package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TagTO implements java.io.Serializable, GitObjectTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private String message;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    private GitActorTO tagger;
    @javax.validation.constraints.NotNull
    private GitObjectTO target;

    public TagTO() {
    }

    public TagTO(String abbreviatedOid, String commitResourcePath, String commitUrl, String id, String message, String name, String oid, RepositoryTO repository, GitActorTO tagger, GitObjectTO target) {
        this.abbreviatedOid = abbreviatedOid;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.id = id;
        this.message = message;
        this.name = name;
        this.oid = oid;
        this.repository = repository;
        this.tagger = tagger;
        this.target = target;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }

    public String getCommitResourcePath() {
        return commitResourcePath;
    }

    public String getCommitUrl() {
        return commitUrl;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getOid() {
        return oid;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public GitActorTO getTagger() {
        return tagger;
    }

    public GitObjectTO getTarget() {
        return target;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (abbreviatedOid != null) {
            joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid));
        }
        if (commitResourcePath != null) {
            joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath));
        }
        if (commitUrl != null) {
            joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (tagger != null) {
            joiner.add("tagger: " + GraphQLRequestSerializer.getEntry(tagger));
        }
        if (target != null) {
            joiner.add("target: " + GraphQLRequestSerializer.getEntry(target));
        }
        return joiner.toString();
    }

    public static TagTO.Builder builder() {
        return new TagTO.Builder();
    }

    public static class Builder {

        private String abbreviatedOid;
        private String commitResourcePath;
        private String commitUrl;
        private String id;
        private String message;
        private String name;
        private String oid;
        private RepositoryTO repository;
        private GitActorTO tagger;
        private GitObjectTO target;

        public Builder() {
        }

        public Builder setAbbreviatedOid(String abbreviatedOid) {
            this.abbreviatedOid = abbreviatedOid;
            return this;
        }

        public Builder setCommitResourcePath(String commitResourcePath) {
            this.commitResourcePath = commitResourcePath;
            return this;
        }

        public Builder setCommitUrl(String commitUrl) {
            this.commitUrl = commitUrl;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
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

        public Builder setTagger(GitActorTO tagger) {
            this.tagger = tagger;
            return this;
        }

        public Builder setTarget(GitObjectTO target) {
            this.target = target;
            return this;
        }


        public TagTO build() {
            return new TagTO(abbreviatedOid, commitResourcePath, commitUrl, id, message, name, oid, repository, tagger, target);
        }

    }
}
