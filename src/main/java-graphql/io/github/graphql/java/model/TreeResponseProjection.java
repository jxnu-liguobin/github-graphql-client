package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Tree
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TreeResponseProjection extends GraphQLResponseProjection {

    public TreeResponseProjection() {
    }

    @Override
    public TreeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TreeResponseProjection all$(int maxDepth) {
        this.abbreviatedOid();
        this.commitResourcePath();
        this.commitUrl();
        if (projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeResponseProjection.TreeEntryResponseProjection.entries", projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0) + 1);
            this.entries(new TreeEntryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0)));
        }
        this.id();
        this.oid();
        if (projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TreeResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public TreeResponseProjection abbreviatedOid() {
        return abbreviatedOid(null);
    }

    public TreeResponseProjection abbreviatedOid(String alias) {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias));
        return this;
    }

    public TreeResponseProjection commitResourcePath() {
        return commitResourcePath(null);
    }

    public TreeResponseProjection commitResourcePath(String alias) {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias));
        return this;
    }

    public TreeResponseProjection commitUrl() {
        return commitUrl(null);
    }

    public TreeResponseProjection commitUrl(String alias) {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias));
        return this;
    }

    public TreeResponseProjection entries(TreeEntryResponseProjection subProjection) {
        return entries(null, subProjection);
    }

    public TreeResponseProjection entries(String alias, TreeEntryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entries").alias(alias).projection(subProjection));
        return this;
    }

    public TreeResponseProjection id() {
        return id(null);
    }

    public TreeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TreeResponseProjection oid() {
        return oid(null);
    }

    public TreeResponseProjection oid(String alias) {
        fields.add(new GraphQLResponseField("oid").alias(alias));
        return this;
    }

    public TreeResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public TreeResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public TreeResponseProjection typename() {
        return typename(null);
    }

    public TreeResponseProjection typename(String alias) {
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
        final TreeResponseProjection that = (TreeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
