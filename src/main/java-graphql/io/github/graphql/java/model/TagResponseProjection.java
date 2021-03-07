package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Tag
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TagResponseProjection extends GraphQLResponseProjection {

    public TagResponseProjection() {
    }

    @Override
    public TagResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TagResponseProjection all$(int maxDepth) {
        this.abbreviatedOid();
        this.commitResourcePath();
        this.commitUrl();
        this.id();
        this.message();
        this.name();
        this.oid();
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagResponseProjection.GitActorResponseProjection.tagger", projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0) + 1);
            this.tagger(new GitActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagResponseProjection.GitObjectResponseProjection.target", projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0) + 1);
            this.target(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0)));
        }
        this.typename();
        return this;
    }

    public TagResponseProjection abbreviatedOid() {
        return abbreviatedOid(null);
    }

    public TagResponseProjection abbreviatedOid(String alias) {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias));
        return this;
    }

    public TagResponseProjection commitResourcePath() {
        return commitResourcePath(null);
    }

    public TagResponseProjection commitResourcePath(String alias) {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias));
        return this;
    }

    public TagResponseProjection commitUrl() {
        return commitUrl(null);
    }

    public TagResponseProjection commitUrl(String alias) {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias));
        return this;
    }

    public TagResponseProjection id() {
        return id(null);
    }

    public TagResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TagResponseProjection message() {
        return message(null);
    }

    public TagResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public TagResponseProjection name() {
        return name(null);
    }

    public TagResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TagResponseProjection oid() {
        return oid(null);
    }

    public TagResponseProjection oid(String alias) {
        fields.add(new GraphQLResponseField("oid").alias(alias));
        return this;
    }

    public TagResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public TagResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public TagResponseProjection tagger(GitActorResponseProjection subProjection) {
        return tagger(null, subProjection);
    }

    public TagResponseProjection tagger(String alias, GitActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tagger").alias(alias).projection(subProjection));
        return this;
    }

    public TagResponseProjection target(GitObjectResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public TagResponseProjection target(String alias, GitObjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }

    public TagResponseProjection typename() {
        return typename(null);
    }

    public TagResponseProjection typename(String alias) {
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
        final TagResponseProjection that = (TagResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
