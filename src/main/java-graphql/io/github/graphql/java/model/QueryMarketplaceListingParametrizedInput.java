package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field marketplaceListing in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QueryMarketplaceListingParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String slug;

    public QueryMarketplaceListingParametrizedInput() {
    }

    public QueryMarketplaceListingParametrizedInput(String slug) {
        this.slug = slug;
    }

    public QueryMarketplaceListingParametrizedInput slug(String slug) {
        this.slug = slug;
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
        final QueryMarketplaceListingParametrizedInput that = (QueryMarketplaceListingParametrizedInput) obj;
        return Objects.equals(slug, that.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slug);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        return joiner.toString();
    }

}
