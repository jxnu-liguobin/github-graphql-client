package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for App
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AppResponseProjection extends GraphQLResponseProjection {

    public AppResponseProjection() {
    }

    @Override
    public AppResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AppResponseProjection all$(int maxDepth) {
        this.createdAt();
        this.databaseId();
        this.description();
        this.id();
        this.logoBackgroundColor();
        this.logoUrl();
        this.name();
        this.slug();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public AppResponseProjection createdAt() {
        return createdAt(null);
    }

    public AppResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public AppResponseProjection databaseId() {
        return databaseId(null);
    }

    public AppResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public AppResponseProjection description() {
        return description(null);
    }

    public AppResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public AppResponseProjection id() {
        return id(null);
    }

    public AppResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AppResponseProjection logoBackgroundColor() {
        return logoBackgroundColor(null);
    }

    public AppResponseProjection logoBackgroundColor(String alias) {
        fields.add(new GraphQLResponseField("logoBackgroundColor").alias(alias));
        return this;
    }

    public AppResponseProjection logoUrl() {
        return logoUrl((String)null);
    }

    public AppResponseProjection logoUrl(String alias) {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias));
        return this;
    }

    public AppResponseProjection logoUrl(AppLogoUrlParametrizedInput input) {
        return logoUrl(null, input);
    }

    public AppResponseProjection logoUrl(String alias, AppLogoUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias).parameters(input));
        return this;
    }

    public AppResponseProjection name() {
        return name(null);
    }

    public AppResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AppResponseProjection slug() {
        return slug(null);
    }

    public AppResponseProjection slug(String alias) {
        fields.add(new GraphQLResponseField("slug").alias(alias));
        return this;
    }

    public AppResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public AppResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public AppResponseProjection url() {
        return url(null);
    }

    public AppResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public AppResponseProjection typename() {
        return typename(null);
    }

    public AppResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AppResponseProjection that = (AppResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
