package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class AppTO implements java.io.Serializable, SearchResultItemTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    private Integer databaseId;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String logoBackgroundColor;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String slug;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public AppTO() {
    }

    public AppTO(String createdAt, Integer databaseId, String description, String id, String logoBackgroundColor, String name, String slug, String updatedAt, String url) {
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.description = description;
        this.id = id;
        this.logoBackgroundColor = logoBackgroundColor;
        this.name = name;
        this.slug = slug;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getLogoBackgroundColor() {
        return logoBackgroundColor;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
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
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (logoBackgroundColor != null) {
            joiner.add("logoBackgroundColor: " + GraphQLRequestSerializer.getEntry(logoBackgroundColor));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static AppTO.Builder builder() {
        return new AppTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private Integer databaseId;
        private String description;
        private String id;
        private String logoBackgroundColor;
        private String name;
        private String slug;
        private String updatedAt;
        private String url;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLogoBackgroundColor(String logoBackgroundColor) {
            this.logoBackgroundColor = logoBackgroundColor;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
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


        public AppTO build() {
            return new AppTO(createdAt, databaseId, description, id, logoBackgroundColor, name, slug, updatedAt, url);
        }

    }
}
