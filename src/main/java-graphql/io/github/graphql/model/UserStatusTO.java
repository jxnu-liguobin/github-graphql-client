package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UserStatusTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    private String emoji;
    private String emojiHTML;
    private String expiresAt;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean indicatesLimitedAvailability;
    private String message;
    private OrganizationTO organization;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private UserTO user;

    public UserStatusTO() {
    }

    public UserStatusTO(String createdAt, String emoji, String emojiHTML, String expiresAt, String id, boolean indicatesLimitedAvailability, String message, OrganizationTO organization, String updatedAt, UserTO user) {
        this.createdAt = createdAt;
        this.emoji = emoji;
        this.emojiHTML = emojiHTML;
        this.expiresAt = expiresAt;
        this.id = id;
        this.indicatesLimitedAvailability = indicatesLimitedAvailability;
        this.message = message;
        this.organization = organization;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getEmojiHTML() {
        return emojiHTML;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public String getId() {
        return id;
    }

    public boolean getIndicatesLimitedAvailability() {
        return indicatesLimitedAvailability;
    }

    public String getMessage() {
        return message;
    }

    public OrganizationTO getOrganization() {
        return organization;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserTO getUser() {
        return user;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (emoji != null) {
            joiner.add("emoji: " + GraphQLRequestSerializer.getEntry(emoji));
        }
        if (emojiHTML != null) {
            joiner.add("emojiHTML: " + GraphQLRequestSerializer.getEntry(emojiHTML));
        }
        if (expiresAt != null) {
            joiner.add("expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("indicatesLimitedAvailability: " + GraphQLRequestSerializer.getEntry(indicatesLimitedAvailability));
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static UserStatusTO.Builder builder() {
        return new UserStatusTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private String emoji;
        private String emojiHTML;
        private String expiresAt;
        private String id;
        private boolean indicatesLimitedAvailability;
        private String message;
        private OrganizationTO organization;
        private String updatedAt;
        private UserTO user;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setEmoji(String emoji) {
            this.emoji = emoji;
            return this;
        }

        public Builder setEmojiHTML(String emojiHTML) {
            this.emojiHTML = emojiHTML;
            return this;
        }

        public Builder setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIndicatesLimitedAvailability(boolean indicatesLimitedAvailability) {
            this.indicatesLimitedAvailability = indicatesLimitedAvailability;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setOrganization(OrganizationTO organization) {
            this.organization = organization;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public UserStatusTO build() {
            return new UserStatusTO(createdAt, emoji, emojiHTML, expiresAt, id, indicatesLimitedAvailability, message, organization, updatedAt, user);
        }

    }
}
