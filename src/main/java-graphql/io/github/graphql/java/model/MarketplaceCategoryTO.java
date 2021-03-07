package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MarketplaceCategoryTO implements java.io.Serializable, NodeTO {

    private String description;
    private String howItWorks;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private int primaryListingCount;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private int secondaryListingCount;
    @javax.validation.constraints.NotNull
    private String slug;
    @javax.validation.constraints.NotNull
    private String url;

    public MarketplaceCategoryTO() {
    }

    public MarketplaceCategoryTO(String description, String howItWorks, String id, String name, int primaryListingCount, String resourcePath, int secondaryListingCount, String slug, String url) {
        this.description = description;
        this.howItWorks = howItWorks;
        this.id = id;
        this.name = name;
        this.primaryListingCount = primaryListingCount;
        this.resourcePath = resourcePath;
        this.secondaryListingCount = secondaryListingCount;
        this.slug = slug;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public String getHowItWorks() {
        return howItWorks;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrimaryListingCount() {
        return primaryListingCount;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public int getSecondaryListingCount() {
        return secondaryListingCount;
    }

    public String getSlug() {
        return slug;
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
        final MarketplaceCategoryTO that = (MarketplaceCategoryTO) obj;
        return Objects.equals(description, that.description)
            && Objects.equals(howItWorks, that.howItWorks)
            && Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(primaryListingCount, that.primaryListingCount)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(secondaryListingCount, that.secondaryListingCount)
            && Objects.equals(slug, that.slug)
            && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, howItWorks, id, name, primaryListingCount, resourcePath, secondaryListingCount, slug, url);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (howItWorks != null) {
            joiner.add("howItWorks: " + GraphQLRequestSerializer.getEntry(howItWorks));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("primaryListingCount: " + GraphQLRequestSerializer.getEntry(primaryListingCount));
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        joiner.add("secondaryListingCount: " + GraphQLRequestSerializer.getEntry(secondaryListingCount));
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static MarketplaceCategoryTO.Builder builder() {
        return new MarketplaceCategoryTO.Builder();
    }

    public static class Builder {

        private String description;
        private String howItWorks;
        private String id;
        private String name;
        private int primaryListingCount;
        private String resourcePath;
        private int secondaryListingCount;
        private String slug;
        private String url;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setHowItWorks(String howItWorks) {
            this.howItWorks = howItWorks;
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

        public Builder setPrimaryListingCount(int primaryListingCount) {
            this.primaryListingCount = primaryListingCount;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setSecondaryListingCount(int secondaryListingCount) {
            this.secondaryListingCount = secondaryListingCount;
            return this;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public MarketplaceCategoryTO build() {
            return new MarketplaceCategoryTO(description, howItWorks, id, name, primaryListingCount, resourcePath, secondaryListingCount, slug, url);
        }

    }
}
