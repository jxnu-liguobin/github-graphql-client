package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class BlobTO implements java.io.Serializable, GitObjectTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    private int byteSize;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isBinary;
    private boolean isTruncated;
    @javax.validation.constraints.NotNull
    private String oid;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    private String text;

    public BlobTO() {
    }

    public BlobTO(String abbreviatedOid, int byteSize, String commitResourcePath, String commitUrl, String id, boolean isBinary, boolean isTruncated, String oid, RepositoryTO repository, String text) {
        this.abbreviatedOid = abbreviatedOid;
        this.byteSize = byteSize;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.id = id;
        this.isBinary = isBinary;
        this.isTruncated = isTruncated;
        this.oid = oid;
        this.repository = repository;
        this.text = text;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }

    public int getByteSize() {
        return byteSize;
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

    public boolean getIsBinary() {
        return isBinary;
    }

    public boolean getIsTruncated() {
        return isTruncated;
    }

    public String getOid() {
        return oid;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BlobTO that = (BlobTO) obj;
        return Objects.equals(abbreviatedOid, that.abbreviatedOid)
            && Objects.equals(byteSize, that.byteSize)
            && Objects.equals(commitResourcePath, that.commitResourcePath)
            && Objects.equals(commitUrl, that.commitUrl)
            && Objects.equals(id, that.id)
            && Objects.equals(isBinary, that.isBinary)
            && Objects.equals(isTruncated, that.isTruncated)
            && Objects.equals(oid, that.oid)
            && Objects.equals(repository, that.repository)
            && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abbreviatedOid, byteSize, commitResourcePath, commitUrl, id, isBinary, isTruncated, oid, repository, text);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (abbreviatedOid != null) {
            joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid));
        }
        joiner.add("byteSize: " + GraphQLRequestSerializer.getEntry(byteSize));
        if (commitResourcePath != null) {
            joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath));
        }
        if (commitUrl != null) {
            joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isBinary: " + GraphQLRequestSerializer.getEntry(isBinary));
        joiner.add("isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated));
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (text != null) {
            joiner.add("text: " + GraphQLRequestSerializer.getEntry(text));
        }
        return joiner.toString();
    }

    public static BlobTO.Builder builder() {
        return new BlobTO.Builder();
    }

    public static class Builder {

        private String abbreviatedOid;
        private int byteSize;
        private String commitResourcePath;
        private String commitUrl;
        private String id;
        private boolean isBinary;
        private boolean isTruncated;
        private String oid;
        private RepositoryTO repository;
        private String text;

        public Builder() {
        }

        public Builder setAbbreviatedOid(String abbreviatedOid) {
            this.abbreviatedOid = abbreviatedOid;
            return this;
        }

        public Builder setByteSize(int byteSize) {
            this.byteSize = byteSize;
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

        public Builder setIsBinary(boolean isBinary) {
            this.isBinary = isBinary;
            return this;
        }

        public Builder setIsTruncated(boolean isTruncated) {
            this.isTruncated = isTruncated;
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

        public Builder setText(String text) {
            this.text = text;
            return this;
        }


        public BlobTO build() {
            return new BlobTO(abbreviatedOid, byteSize, commitResourcePath, commitUrl, id, isBinary, isTruncated, oid, repository, text);
        }

    }
}
