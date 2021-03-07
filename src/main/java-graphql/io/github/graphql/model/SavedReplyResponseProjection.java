package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SavedReply
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SavedReplyResponseProjection extends GraphQLResponseProjection {

    public SavedReplyResponseProjection() {
    }

    @Override
    public SavedReplyResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SavedReplyResponseProjection all$(int maxDepth) {
        this.body();
        this.bodyHTML();
        this.databaseId();
        this.id();
        this.title();
        if (projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyResponseProjection.ActorResponseProjection.user", projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0) + 1);
            this.user(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public SavedReplyResponseProjection body() {
        return body(null);
    }

    public SavedReplyResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public SavedReplyResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public SavedReplyResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public SavedReplyResponseProjection databaseId() {
        return databaseId(null);
    }

    public SavedReplyResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public SavedReplyResponseProjection id() {
        return id(null);
    }

    public SavedReplyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SavedReplyResponseProjection title() {
        return title(null);
    }

    public SavedReplyResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public SavedReplyResponseProjection user(ActorResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public SavedReplyResponseProjection user(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public SavedReplyResponseProjection typename() {
        return typename(null);
    }

    public SavedReplyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
