package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Release
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReleaseResponseProjection extends GraphQLResponseProjection {

    public ReleaseResponseProjection() {
    }

    @Override
    public ReleaseResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReleaseResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseResponseProjection.UserResponseProjection.author", projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0) + 1);
            this.author(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0)));
        }
        this.createdAt();
        this.description();
        this.id();
        this.isDraft();
        this.isPrerelease();
        this.name();
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0) + 1);
            this.releaseAssets(new ReleaseAssetConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0)));
        }
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseResponseProjection.RefResponseProjection.tag", projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0) + 1);
            this.tag(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0)));
        }
        this.tagName();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public ReleaseResponseProjection author(UserResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public ReleaseResponseProjection author(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReleaseResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReleaseResponseProjection description() {
        return description(null);
    }

    public ReleaseResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ReleaseResponseProjection id() {
        return id(null);
    }

    public ReleaseResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReleaseResponseProjection isDraft() {
        return isDraft(null);
    }

    public ReleaseResponseProjection isDraft(String alias) {
        fields.add(new GraphQLResponseField("isDraft").alias(alias));
        return this;
    }

    public ReleaseResponseProjection isPrerelease() {
        return isPrerelease(null);
    }

    public ReleaseResponseProjection isPrerelease(String alias) {
        fields.add(new GraphQLResponseField("isPrerelease").alias(alias));
        return this;
    }

    public ReleaseResponseProjection name() {
        return name(null);
    }

    public ReleaseResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ReleaseResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public ReleaseResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public ReleaseResponseProjection releaseAssets(ReleaseAssetConnectionResponseProjection subProjection) {
        return releaseAssets((String)null, subProjection);
    }

    public ReleaseResponseProjection releaseAssets(String alias, ReleaseAssetConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("releaseAssets").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseResponseProjection releaseAssets(ReleaseReleaseAssetsParametrizedInput input, ReleaseAssetConnectionResponseProjection subProjection) {
        return releaseAssets(null, input, subProjection);
    }

    public ReleaseResponseProjection releaseAssets(String alias, ReleaseReleaseAssetsParametrizedInput input, ReleaseAssetConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("releaseAssets").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ReleaseResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ReleaseResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ReleaseResponseProjection tag(RefResponseProjection subProjection) {
        return tag(null, subProjection);
    }

    public ReleaseResponseProjection tag(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tag").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseResponseProjection tagName() {
        return tagName(null);
    }

    public ReleaseResponseProjection tagName(String alias) {
        fields.add(new GraphQLResponseField("tagName").alias(alias));
        return this;
    }

    public ReleaseResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ReleaseResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ReleaseResponseProjection url() {
        return url(null);
    }

    public ReleaseResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ReleaseResponseProjection typename() {
        return typename(null);
    }

    public ReleaseResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
