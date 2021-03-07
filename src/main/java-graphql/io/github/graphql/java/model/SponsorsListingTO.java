package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SponsorsListingTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String fullDescription;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String shortDescription;
    @javax.validation.constraints.NotNull
    private String slug;

    public SponsorsListingTO() {
    }

    public SponsorsListingTO(String fullDescription, String id, String shortDescription, String slug) {
        this.fullDescription = fullDescription;
        this.id = id;
        this.shortDescription = shortDescription;
        this.slug = slug;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public String getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getSlug() {
        return slug;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SponsorsListingTO that = (SponsorsListingTO) obj;
        return Objects.equals(fullDescription, that.fullDescription)
            && Objects.equals(id, that.id)
            && Objects.equals(shortDescription, that.shortDescription)
            && Objects.equals(slug, that.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullDescription, id, shortDescription, slug);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fullDescription != null) {
            joiner.add("fullDescription: " + GraphQLRequestSerializer.getEntry(fullDescription));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (shortDescription != null) {
            joiner.add("shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription));
        }
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        return joiner.toString();
    }

    public static SponsorsListingTO.Builder builder() {
        return new SponsorsListingTO.Builder();
    }

    public static class Builder {

        private String fullDescription;
        private String id;
        private String shortDescription;
        private String slug;

        public Builder() {
        }

        public Builder setFullDescription(String fullDescription) {
            this.fullDescription = fullDescription;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
            return this;
        }


        public SponsorsListingTO build() {
            return new SponsorsListingTO(fullDescription, id, shortDescription, slug);
        }

    }
}
