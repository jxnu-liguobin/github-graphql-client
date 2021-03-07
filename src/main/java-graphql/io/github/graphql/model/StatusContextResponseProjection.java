package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for StatusContext
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class StatusContextResponseProjection extends GraphQLResponseProjection {

    public StatusContextResponseProjection() {
    }

    @Override
    public StatusContextResponseProjection all$() {
        return all$(3);
    }

    @Override
    public StatusContextResponseProjection all$(int maxDepth) {
        this.avatarUrl();
        if (projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusContextResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.context();
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusContextResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0) + 1);
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusContextResponseProjection.ActorResponseProjection.creator", 0)));
        }
        this.description();
        this.id();
        this.state();
        this.targetUrl();
        this.typename();
        return this;
    }

    public StatusContextResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public StatusContextResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public StatusContextResponseProjection avatarUrl(StatusContextAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public StatusContextResponseProjection avatarUrl(String alias, StatusContextAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public StatusContextResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public StatusContextResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public StatusContextResponseProjection context() {
        return context(null);
    }

    public StatusContextResponseProjection context(String alias) {
        fields.add(new GraphQLResponseField("context").alias(alias));
        return this;
    }

    public StatusContextResponseProjection createdAt() {
        return createdAt(null);
    }

    public StatusContextResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public StatusContextResponseProjection creator(ActorResponseProjection subProjection) {
        return creator(null, subProjection);
    }

    public StatusContextResponseProjection creator(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection));
        return this;
    }

    public StatusContextResponseProjection description() {
        return description(null);
    }

    public StatusContextResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public StatusContextResponseProjection id() {
        return id(null);
    }

    public StatusContextResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public StatusContextResponseProjection state() {
        return state(null);
    }

    public StatusContextResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public StatusContextResponseProjection targetUrl() {
        return targetUrl(null);
    }

    public StatusContextResponseProjection targetUrl(String alias) {
        fields.add(new GraphQLResponseField("targetUrl").alias(alias));
        return this;
    }

    public StatusContextResponseProjection typename() {
        return typename(null);
    }

    public StatusContextResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
