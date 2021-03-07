package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class DeployKeyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String key;
    private boolean readOnly;
    @javax.validation.constraints.NotNull
    private String title;
    private boolean verified;

    public DeployKeyTO() {
    }

    public DeployKeyTO(String createdAt, String id, String key, boolean readOnly, String title, boolean verified) {
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.readOnly = readOnly;
        this.title = title;
        this.verified = verified;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public boolean getReadOnly() {
        return readOnly;
    }

    public String getTitle() {
        return title;
    }

    public boolean getVerified() {
        return verified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        joiner.add("readOnly: " + GraphQLRequestSerializer.getEntry(readOnly));
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        joiner.add("verified: " + GraphQLRequestSerializer.getEntry(verified));
        return joiner.toString();
    }

    public static DeployKeyTO.Builder builder() {
        return new DeployKeyTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private String id;
        private String key;
        private boolean readOnly;
        private String title;
        private boolean verified;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setReadOnly(boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setVerified(boolean verified) {
            this.verified = verified;
            return this;
        }


        public DeployKeyTO build() {
            return new DeployKeyTO(createdAt, id, key, readOnly, title, verified);
        }

    }
}
