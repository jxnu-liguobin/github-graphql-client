package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for TreeEntry
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TreeEntryResponseProjection extends GraphQLResponseProjection {

    public TreeEntryResponseProjection() {
    }

    @Override
    public TreeEntryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TreeEntryResponseProjection all$(int maxDepth) {
        this.mode();
        this.name();
        if (projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.object", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeEntryResponseProjection.GitObjectResponseProjection.object", projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.object", 0) + 1);
            this.object(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.object", 0)));
        }
        this.oid();
        if (projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeEntryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.type();
        this.typename();
        return this;
    }

    public TreeEntryResponseProjection mode() {
        return mode(null);
    }

    public TreeEntryResponseProjection mode(String alias) {
        fields.add(new GraphQLResponseField("mode").alias(alias));
        return this;
    }

    public TreeEntryResponseProjection name() {
        return name(null);
    }

    public TreeEntryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TreeEntryResponseProjection object(GitObjectResponseProjection subProjection) {
        return object(null, subProjection);
    }

    public TreeEntryResponseProjection object(String alias, GitObjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("object").alias(alias).projection(subProjection));
        return this;
    }

    public TreeEntryResponseProjection oid() {
        return oid(null);
    }

    public TreeEntryResponseProjection oid(String alias) {
        fields.add(new GraphQLResponseField("oid").alias(alias));
        return this;
    }

    public TreeEntryResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public TreeEntryResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public TreeEntryResponseProjection type() {
        return type(null);
    }

    public TreeEntryResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public TreeEntryResponseProjection typename() {
        return typename(null);
    }

    public TreeEntryResponseProjection typename(String alias) {
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
        final TreeEntryResponseProjection that = (TreeEntryResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
