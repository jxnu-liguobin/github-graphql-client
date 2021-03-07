package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field marketplaceCategories in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QueryMarketplaceCategoriesParametrizedInput implements GraphQLParametrizedInput {

    private Boolean excludeEmpty;
    private Boolean excludeSubcategories;
    @javax.validation.constraints.NotNull
    private java.util.List<String> includeCategories;

    public QueryMarketplaceCategoriesParametrizedInput() {
    }

    public QueryMarketplaceCategoriesParametrizedInput(Boolean excludeEmpty, Boolean excludeSubcategories, java.util.List<String> includeCategories) {
        this.excludeEmpty = excludeEmpty;
        this.excludeSubcategories = excludeSubcategories;
        this.includeCategories = includeCategories;
    }

    public QueryMarketplaceCategoriesParametrizedInput excludeEmpty(Boolean excludeEmpty) {
        this.excludeEmpty = excludeEmpty;
        return this;
    }

    public QueryMarketplaceCategoriesParametrizedInput excludeSubcategories(Boolean excludeSubcategories) {
        this.excludeSubcategories = excludeSubcategories;
        return this;
    }

    public QueryMarketplaceCategoriesParametrizedInput includeCategories(java.util.List<String> includeCategories) {
        this.includeCategories = includeCategories;
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
        final QueryMarketplaceCategoriesParametrizedInput that = (QueryMarketplaceCategoriesParametrizedInput) obj;
        return Objects.equals(excludeEmpty, that.excludeEmpty)
            && Objects.equals(excludeSubcategories, that.excludeSubcategories)
            && Objects.equals(includeCategories, that.includeCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeEmpty, excludeSubcategories, includeCategories);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (excludeEmpty != null) {
            joiner.add("excludeEmpty: " + GraphQLRequestSerializer.getEntry(excludeEmpty));
        }
        if (excludeSubcategories != null) {
            joiner.add("excludeSubcategories: " + GraphQLRequestSerializer.getEntry(excludeSubcategories));
        }
        if (includeCategories != null) {
            joiner.add("includeCategories: " + GraphQLRequestSerializer.getEntry(includeCategories));
        }
        return joiner.toString();
    }

}
