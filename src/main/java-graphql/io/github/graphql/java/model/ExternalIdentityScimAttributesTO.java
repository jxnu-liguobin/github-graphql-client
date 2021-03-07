package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ExternalIdentityScimAttributesTO implements java.io.Serializable {

    private String username;

    public ExternalIdentityScimAttributesTO() {
    }

    public ExternalIdentityScimAttributesTO(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ExternalIdentityScimAttributesTO that = (ExternalIdentityScimAttributesTO) obj;
        return Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (username != null) {
            joiner.add("username: " + GraphQLRequestSerializer.getEntry(username));
        }
        return joiner.toString();
    }

    public static ExternalIdentityScimAttributesTO.Builder builder() {
        return new ExternalIdentityScimAttributesTO.Builder();
    }

    public static class Builder {

        private String username;

        public Builder() {
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }


        public ExternalIdentityScimAttributesTO build() {
            return new ExternalIdentityScimAttributesTO(username);
        }

    }
}
