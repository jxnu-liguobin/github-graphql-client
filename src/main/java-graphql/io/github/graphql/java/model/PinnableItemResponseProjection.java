package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PinnableItem
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PinnableItemResponseProjection extends GraphQLResponseProjection {

    public PinnableItemResponseProjection() {
    }

    @Override
    public PinnableItemResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PinnableItemResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public PinnableItemResponseProjection onGist(GistResponseProjection subProjection) {
        return onGist(null, subProjection);
    }

    public PinnableItemResponseProjection onGist(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection));
        return this;
    }

    public PinnableItemResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public PinnableItemResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public PinnableItemResponseProjection typename() {
        return typename(null);
    }

    public PinnableItemResponseProjection typename(String alias) {
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
        final PinnableItemResponseProjection that = (PinnableItemResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
