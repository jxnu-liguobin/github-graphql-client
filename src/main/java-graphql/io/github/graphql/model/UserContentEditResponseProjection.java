package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserContentEdit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UserContentEditResponseProjection extends GraphQLResponseProjection {

    public UserContentEditResponseProjection() {
    }

    @Override
    public UserContentEditResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserContentEditResponseProjection all$(int maxDepth) {
        this.createdAt();
        this.deletedAt();
        if (projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0) + 1);
            this.deletedBy(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0)));
        }
        this.diff();
        this.editedAt();
        if (projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0)));
        }
        this.id();
        this.updatedAt();
        this.typename();
        return this;
    }

    public UserContentEditResponseProjection createdAt() {
        return createdAt(null);
    }

    public UserContentEditResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UserContentEditResponseProjection deletedAt() {
        return deletedAt(null);
    }

    public UserContentEditResponseProjection deletedAt(String alias) {
        fields.add(new GraphQLResponseField("deletedAt").alias(alias));
        return this;
    }

    public UserContentEditResponseProjection deletedBy(ActorResponseProjection subProjection) {
        return deletedBy(null, subProjection);
    }

    public UserContentEditResponseProjection deletedBy(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deletedBy").alias(alias).projection(subProjection));
        return this;
    }

    public UserContentEditResponseProjection diff() {
        return diff(null);
    }

    public UserContentEditResponseProjection diff(String alias) {
        fields.add(new GraphQLResponseField("diff").alias(alias));
        return this;
    }

    public UserContentEditResponseProjection editedAt() {
        return editedAt(null);
    }

    public UserContentEditResponseProjection editedAt(String alias) {
        fields.add(new GraphQLResponseField("editedAt").alias(alias));
        return this;
    }

    public UserContentEditResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public UserContentEditResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public UserContentEditResponseProjection id() {
        return id(null);
    }

    public UserContentEditResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserContentEditResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public UserContentEditResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public UserContentEditResponseProjection typename() {
        return typename(null);
    }

    public UserContentEditResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
