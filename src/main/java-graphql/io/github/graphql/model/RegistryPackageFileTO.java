package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageFileTO implements java.io.Serializable, NodeTO {

    private String guid;
    @javax.validation.constraints.NotNull
    private String id;
    private String md5;
    @javax.validation.constraints.NotNull
    private String metadataUrl;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private RegistryPackageVersionTO packageVersion;
    private String sha1;
    private String sha256;
    private Integer size;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public RegistryPackageFileTO() {
    }

    public RegistryPackageFileTO(String guid, String id, String md5, String metadataUrl, String name, RegistryPackageVersionTO packageVersion, String sha1, String sha256, Integer size, String updatedAt, String url) {
        this.guid = guid;
        this.id = id;
        this.md5 = md5;
        this.metadataUrl = metadataUrl;
        this.name = name;
        this.packageVersion = packageVersion;
        this.sha1 = sha1;
        this.sha256 = sha256;
        this.size = size;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getGuid() {
        return guid;
    }

    public String getId() {
        return id;
    }

    public String getMd5() {
        return md5;
    }

    public String getMetadataUrl() {
        return metadataUrl;
    }

    public String getName() {
        return name;
    }

    public RegistryPackageVersionTO getPackageVersion() {
        return packageVersion;
    }

    public String getSha1() {
        return sha1;
    }

    public String getSha256() {
        return sha256;
    }

    public Integer getSize() {
        return size;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (guid != null) {
            joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (md5 != null) {
            joiner.add("md5: " + GraphQLRequestSerializer.getEntry(md5));
        }
        if (metadataUrl != null) {
            joiner.add("metadataUrl: " + GraphQLRequestSerializer.getEntry(metadataUrl));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (packageVersion != null) {
            joiner.add("packageVersion: " + GraphQLRequestSerializer.getEntry(packageVersion));
        }
        if (sha1 != null) {
            joiner.add("sha1: " + GraphQLRequestSerializer.getEntry(sha1));
        }
        if (sha256 != null) {
            joiner.add("sha256: " + GraphQLRequestSerializer.getEntry(sha256));
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static RegistryPackageFileTO.Builder builder() {
        return new RegistryPackageFileTO.Builder();
    }

    public static class Builder {

        private String guid;
        private String id;
        private String md5;
        private String metadataUrl;
        private String name;
        private RegistryPackageVersionTO packageVersion;
        private String sha1;
        private String sha256;
        private Integer size;
        private String updatedAt;
        private String url;

        public Builder() {
        }

        public Builder setGuid(String guid) {
            this.guid = guid;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMd5(String md5) {
            this.md5 = md5;
            return this;
        }

        public Builder setMetadataUrl(String metadataUrl) {
            this.metadataUrl = metadataUrl;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPackageVersion(RegistryPackageVersionTO packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }

        public Builder setSha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }

        public Builder setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public RegistryPackageFileTO build() {
            return new RegistryPackageFileTO(guid, id, md5, metadataUrl, name, packageVersion, sha1, sha256, size, updatedAt, url);
        }

    }
}
