package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for GistFile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class GistFileResponseProjection extends GraphQLResponseProjection {

    public GistFileResponseProjection() {
    }

    @Override
    public GistFileResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GistFileResponseProjection all$(int maxDepth) {
        this.encodedName();
        this.encoding();
        this.extension();
        this.isImage();
        this.isTruncated();
        if (projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistFileResponseProjection.LanguageResponseProjection.language", projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0) + 1);
            this.language(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0)));
        }
        this.name();
        this.size();
        this.text();
        this.typename();
        return this;
    }

    public GistFileResponseProjection encodedName() {
        return encodedName(null);
    }

    public GistFileResponseProjection encodedName(String alias) {
        fields.add(new GraphQLResponseField("encodedName").alias(alias));
        return this;
    }

    public GistFileResponseProjection encoding() {
        return encoding(null);
    }

    public GistFileResponseProjection encoding(String alias) {
        fields.add(new GraphQLResponseField("encoding").alias(alias));
        return this;
    }

    public GistFileResponseProjection extension() {
        return extension(null);
    }

    public GistFileResponseProjection extension(String alias) {
        fields.add(new GraphQLResponseField("extension").alias(alias));
        return this;
    }

    public GistFileResponseProjection isImage() {
        return isImage(null);
    }

    public GistFileResponseProjection isImage(String alias) {
        fields.add(new GraphQLResponseField("isImage").alias(alias));
        return this;
    }

    public GistFileResponseProjection isTruncated() {
        return isTruncated(null);
    }

    public GistFileResponseProjection isTruncated(String alias) {
        fields.add(new GraphQLResponseField("isTruncated").alias(alias));
        return this;
    }

    public GistFileResponseProjection language(LanguageResponseProjection subProjection) {
        return language(null, subProjection);
    }

    public GistFileResponseProjection language(String alias, LanguageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("language").alias(alias).projection(subProjection));
        return this;
    }

    public GistFileResponseProjection name() {
        return name(null);
    }

    public GistFileResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public GistFileResponseProjection size() {
        return size(null);
    }

    public GistFileResponseProjection size(String alias) {
        fields.add(new GraphQLResponseField("size").alias(alias));
        return this;
    }

    public GistFileResponseProjection text() {
        return text((String)null);
    }

    public GistFileResponseProjection text(String alias) {
        fields.add(new GraphQLResponseField("text").alias(alias));
        return this;
    }

    public GistFileResponseProjection text(GistFileTextParametrizedInput input) {
        return text(null, input);
    }

    public GistFileResponseProjection text(String alias, GistFileTextParametrizedInput input) {
        fields.add(new GraphQLResponseField("text").alias(alias).parameters(input));
        return this;
    }

    public GistFileResponseProjection typename() {
        return typename(null);
    }

    public GistFileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
