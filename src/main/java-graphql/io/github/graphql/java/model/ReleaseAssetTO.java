package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReleaseAssetTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String contentType;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private int downloadCount;
    @javax.validation.constraints.NotNull
    private String downloadUrl;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private ReleaseTO release;
    private int size;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private UserTO uploadedBy;
    @javax.validation.constraints.NotNull
    private String url;

    public ReleaseAssetTO() {
    }

    public ReleaseAssetTO(String contentType, String createdAt, int downloadCount, String downloadUrl, String id, String name, ReleaseTO release, int size, String updatedAt, UserTO uploadedBy, String url) {
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.downloadCount = downloadCount;
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.name = name;
        this.release = release;
        this.size = size;
        this.updatedAt = updatedAt;
        this.uploadedBy = uploadedBy;
        this.url = url;
    }

    public String getContentType() {
        return contentType;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ReleaseTO getRelease() {
        return release;
    }

    public int getSize() {
        return size;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserTO getUploadedBy() {
        return uploadedBy;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ReleaseAssetTO that = (ReleaseAssetTO) obj;
        return Objects.equals(contentType, that.contentType)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(downloadCount, that.downloadCount)
            && Objects.equals(downloadUrl, that.downloadUrl)
            && Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(release, that.release)
            && Objects.equals(size, that.size)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(uploadedBy, that.uploadedBy)
            && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, createdAt, downloadCount, downloadUrl, id, name, release, size, updatedAt, uploadedBy, url);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (contentType != null) {
            joiner.add("contentType: " + GraphQLRequestSerializer.getEntry(contentType));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        joiner.add("downloadCount: " + GraphQLRequestSerializer.getEntry(downloadCount));
        if (downloadUrl != null) {
            joiner.add("downloadUrl: " + GraphQLRequestSerializer.getEntry(downloadUrl));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (release != null) {
            joiner.add("release: " + GraphQLRequestSerializer.getEntry(release));
        }
        joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (uploadedBy != null) {
            joiner.add("uploadedBy: " + GraphQLRequestSerializer.getEntry(uploadedBy));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static ReleaseAssetTO.Builder builder() {
        return new ReleaseAssetTO.Builder();
    }

    public static class Builder {

        private String contentType;
        private String createdAt;
        private int downloadCount;
        private String downloadUrl;
        private String id;
        private String name;
        private ReleaseTO release;
        private int size;
        private String updatedAt;
        private UserTO uploadedBy;
        private String url;

        public Builder() {
        }

        public Builder setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDownloadCount(int downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        public Builder setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRelease(ReleaseTO release) {
            this.release = release;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUploadedBy(UserTO uploadedBy) {
            this.uploadedBy = uploadedBy;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public ReleaseAssetTO build() {
            return new ReleaseAssetTO(contentType, createdAt, downloadCount, downloadUrl, id, name, release, size, updatedAt, uploadedBy, url);
        }

    }
}
