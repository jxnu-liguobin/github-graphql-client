package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LicenseTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private java.util.List<LicenseRuleTO> conditions;
    private String description;
    private boolean featured;
    private boolean hidden;
    @javax.validation.constraints.NotNull
    private String id;
    private String implementation;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private java.util.List<LicenseRuleTO> limitations;
    @javax.validation.constraints.NotNull
    private String name;
    private String nickname;
    @javax.validation.constraints.NotNull
    private java.util.List<LicenseRuleTO> permissions;
    private boolean pseudoLicense;
    private String spdxId;
    private String url;

    public LicenseTO() {
    }

    public LicenseTO(String body, java.util.List<LicenseRuleTO> conditions, String description, boolean featured, boolean hidden, String id, String implementation, String key, java.util.List<LicenseRuleTO> limitations, String name, String nickname, java.util.List<LicenseRuleTO> permissions, boolean pseudoLicense, String spdxId, String url) {
        this.body = body;
        this.conditions = conditions;
        this.description = description;
        this.featured = featured;
        this.hidden = hidden;
        this.id = id;
        this.implementation = implementation;
        this.key = key;
        this.limitations = limitations;
        this.name = name;
        this.nickname = nickname;
        this.permissions = permissions;
        this.pseudoLicense = pseudoLicense;
        this.spdxId = spdxId;
        this.url = url;
    }

    public String getBody() {
        return body;
    }

    public java.util.List<LicenseRuleTO> getConditions() {
        return conditions;
    }

    public String getDescription() {
        return description;
    }

    public boolean getFeatured() {
        return featured;
    }

    public boolean getHidden() {
        return hidden;
    }

    public String getId() {
        return id;
    }

    public String getImplementation() {
        return implementation;
    }

    public String getKey() {
        return key;
    }

    public java.util.List<LicenseRuleTO> getLimitations() {
        return limitations;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public java.util.List<LicenseRuleTO> getPermissions() {
        return permissions;
    }

    public boolean getPseudoLicense() {
        return pseudoLicense;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (conditions != null) {
            joiner.add("conditions: " + GraphQLRequestSerializer.getEntry(conditions));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        joiner.add("featured: " + GraphQLRequestSerializer.getEntry(featured));
        joiner.add("hidden: " + GraphQLRequestSerializer.getEntry(hidden));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (implementation != null) {
            joiner.add("implementation: " + GraphQLRequestSerializer.getEntry(implementation));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (limitations != null) {
            joiner.add("limitations: " + GraphQLRequestSerializer.getEntry(limitations));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (nickname != null) {
            joiner.add("nickname: " + GraphQLRequestSerializer.getEntry(nickname));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        joiner.add("pseudoLicense: " + GraphQLRequestSerializer.getEntry(pseudoLicense));
        if (spdxId != null) {
            joiner.add("spdxId: " + GraphQLRequestSerializer.getEntry(spdxId));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static LicenseTO.Builder builder() {
        return new LicenseTO.Builder();
    }

    public static class Builder {

        private String body;
        private java.util.List<LicenseRuleTO> conditions;
        private String description;
        private boolean featured;
        private boolean hidden;
        private String id;
        private String implementation;
        private String key;
        private java.util.List<LicenseRuleTO> limitations;
        private String name;
        private String nickname;
        private java.util.List<LicenseRuleTO> permissions;
        private boolean pseudoLicense;
        private String spdxId;
        private String url;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setConditions(java.util.List<LicenseRuleTO> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setFeatured(boolean featured) {
            this.featured = featured;
            return this;
        }

        public Builder setHidden(boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setImplementation(String implementation) {
            this.implementation = implementation;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setLimitations(java.util.List<LicenseRuleTO> limitations) {
            this.limitations = limitations;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder setPermissions(java.util.List<LicenseRuleTO> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPseudoLicense(boolean pseudoLicense) {
            this.pseudoLicense = pseudoLicense;
            return this;
        }

        public Builder setSpdxId(String spdxId) {
            this.spdxId = spdxId;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public LicenseTO build() {
            return new LicenseTO(body, conditions, description, featured, hidden, id, implementation, key, limitations, name, nickname, permissions, pseudoLicense, spdxId, url);
        }

    }
}
