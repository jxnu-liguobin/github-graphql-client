package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PageInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PageInfoResponseProjection extends GraphQLResponseProjection {

    public PageInfoResponseProjection() {
    }

    @Override
    public PageInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PageInfoResponseProjection all$(int maxDepth) {
        this.endCursor();
        this.hasNextPage();
        this.hasPreviousPage();
        this.startCursor();
        this.typename();
        return this;
    }

    public PageInfoResponseProjection endCursor() {
        return endCursor(null);
    }

    public PageInfoResponseProjection endCursor(String alias) {
        fields.add(new GraphQLResponseField("endCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection hasNextPage() {
        return hasNextPage(null);
    }

    public PageInfoResponseProjection hasNextPage(String alias) {
        fields.add(new GraphQLResponseField("hasNextPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection hasPreviousPage() {
        return hasPreviousPage(null);
    }

    public PageInfoResponseProjection hasPreviousPage(String alias) {
        fields.add(new GraphQLResponseField("hasPreviousPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection startCursor() {
        return startCursor(null);
    }

    public PageInfoResponseProjection startCursor(String alias) {
        fields.add(new GraphQLResponseField("startCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection typename() {
        return typename(null);
    }

    public PageInfoResponseProjection typename(String alias) {
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
        final PageInfoResponseProjection that = (PageInfoResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
