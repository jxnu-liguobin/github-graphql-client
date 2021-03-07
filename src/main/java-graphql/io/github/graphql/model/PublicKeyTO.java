package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PublicKeyTO implements java.io.Serializable, NodeTO {

    private String accessedAt;
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String fingerprint;
    @javax.validation.constraints.NotNull
    private String id;
    private Boolean isReadOnly;
    @javax.validation.constraints.NotNull
    private String key;
    private String updatedAt;

    public PublicKeyTO() {
    }

    public PublicKeyTO(String accessedAt, String createdAt, String fingerprint, String id, Boolean isReadOnly, String key, String updatedAt) {
        this.accessedAt = accessedAt;
        this.createdAt = createdAt;
        this.fingerprint = fingerprint;
        this.id = id;
        this.isReadOnly = isReadOnly;
        this.key = key;
        this.updatedAt = updatedAt;
    }

    public String getAccessedAt() {
        return accessedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    public String getKey() {
        return key;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (accessedAt != null) {
            joiner.add("accessedAt: " + GraphQLRequestSerializer.getEntry(accessedAt));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (fingerprint != null) {
            joiner.add("fingerprint: " + GraphQLRequestSerializer.getEntry(fingerprint));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (isReadOnly != null) {
            joiner.add("isReadOnly: " + GraphQLRequestSerializer.getEntry(isReadOnly));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        return joiner.toString();
    }

    public static PublicKeyTO.Builder builder() {
        return new PublicKeyTO.Builder();
    }

    public static class Builder {

        private String accessedAt;
        private String createdAt;
        private String fingerprint;
        private String id;
        private Boolean isReadOnly;
        private String key;
        private String updatedAt;

        public Builder() {
        }

        public Builder setAccessedAt(String accessedAt) {
            this.accessedAt = accessedAt;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public PublicKeyTO build() {
            return new PublicKeyTO(accessedAt, createdAt, fingerprint, id, isReadOnly, key, updatedAt);
        }

    }
}
