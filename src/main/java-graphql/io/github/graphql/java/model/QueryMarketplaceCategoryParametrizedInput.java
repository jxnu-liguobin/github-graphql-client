package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field marketplaceCategory in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QueryMarketplaceCategoryParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String slug;
    private Boolean useTopicAliases;

    public QueryMarketplaceCategoryParametrizedInput() {
    }

    public QueryMarketplaceCategoryParametrizedInput(String slug, Boolean useTopicAliases) {
        this.slug = slug;
        this.useTopicAliases = useTopicAliases;
    }

    public QueryMarketplaceCategoryParametrizedInput slug(String slug) {
        this.slug = slug;
        return this;
    }

    public QueryMarketplaceCategoryParametrizedInput useTopicAliases(Boolean useTopicAliases) {
        this.useTopicAliases = useTopicAliases;
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
        final QueryMarketplaceCategoryParametrizedInput that = (QueryMarketplaceCategoryParametrizedInput) obj;
        return Objects.equals(slug, that.slug)
            && Objects.equals(useTopicAliases, that.useTopicAliases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slug, useTopicAliases);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        if (useTopicAliases != null) {
            joiner.add("useTopicAliases: " + GraphQLRequestSerializer.getEntry(useTopicAliases));
        }
        return joiner.toString();
    }

}
