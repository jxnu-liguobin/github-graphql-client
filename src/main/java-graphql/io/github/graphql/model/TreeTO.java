package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TreeTO implements java.io.Serializable, GitObjectTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private java.util.List<TreeEntryTO> entries;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;

    public TreeTO() {
    }

    public TreeTO(String abbreviatedOid, String commitResourcePath, String commitUrl, java.util.List<TreeEntryTO> entries, String id, String oid, RepositoryTO repository) {
        this.abbreviatedOid = abbreviatedOid;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.entries = entries;
        this.id = id;
        this.oid = oid;
        this.repository = repository;
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

    public java.util.List<TreeEntryTO> getEntries() {
        return entries;
    }

    public String getId() {
        return id;
    }

    public String getOid() {
        return oid;
    }

    public RepositoryTO getRepository() {
        return repository;
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
        if (entries != null) {
            joiner.add("entries: " + GraphQLRequestSerializer.getEntry(entries));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static TreeTO.Builder builder() {
        return new TreeTO.Builder();
    }

    public static class Builder {

        private String abbreviatedOid;
        private String commitResourcePath;
        private String commitUrl;
        private java.util.List<TreeEntryTO> entries;
        private String id;
        private String oid;
        private RepositoryTO repository;

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

        public Builder setEntries(java.util.List<TreeEntryTO> entries) {
            this.entries = entries;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
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


        public TreeTO build() {
            return new TreeTO(abbreviatedOid, commitResourcePath, commitUrl, entries, id, oid, repository);
        }

    }
}
