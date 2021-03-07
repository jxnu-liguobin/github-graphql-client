package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ChangeUserStatusInputTO implements java.io.Serializable {

    private String clientMutationId;
    private String emoji;
    private String expiresAt;
    private Boolean limitedAvailability = false;
    private String message;
    private String organizationId;

    public ChangeUserStatusInputTO() {
    }

    public ChangeUserStatusInputTO(String clientMutationId, String emoji, String expiresAt, Boolean limitedAvailability, String message, String organizationId) {
        this.clientMutationId = clientMutationId;
        this.emoji = emoji;
        this.expiresAt = expiresAt;
        this.limitedAvailability = limitedAvailability;
        this.message = message;
        this.organizationId = organizationId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public Boolean getLimitedAvailability() {
        return limitedAvailability;
    }

    public String getMessage() {
        return message;
    }

    public String getOrganizationId() {
        return organizationId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (emoji != null) {
            joiner.add("emoji: " + GraphQLRequestSerializer.getEntry(emoji));
        }
        if (expiresAt != null) {
            joiner.add("expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt));
        }
        if (limitedAvailability != null) {
            joiner.add("limitedAvailability: " + GraphQLRequestSerializer.getEntry(limitedAvailability));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        if (organizationId != null) {
            joiner.add("organizationId: " + GraphQLRequestSerializer.getEntry(organizationId));
        }
        return joiner.toString();
    }

    public static ChangeUserStatusInputTO.Builder builder() {
        return new ChangeUserStatusInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String emoji;
        private String expiresAt;
        private Boolean limitedAvailability = false;
        private String message;
        private String organizationId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setEmoji(String emoji) {
            this.emoji = emoji;
            return this;
        }

        public Builder setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder setLimitedAvailability(Boolean limitedAvailability) {
            this.limitedAvailability = limitedAvailability;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }


        public ChangeUserStatusInputTO build() {
            return new ChangeUserStatusInputTO(clientMutationId, emoji, expiresAt, limitedAvailability, message, organizationId);
        }

    }
}
