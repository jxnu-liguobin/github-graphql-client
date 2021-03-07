package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MarketplaceCategoriesQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "marketplaceCategories";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public MarketplaceCategoriesQueryRequest() {
    }

    public MarketplaceCategoriesQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setExcludeEmpty(Boolean excludeEmpty) {
        this.input.put("excludeEmpty", excludeEmpty);
    }

    public void setExcludeSubcategories(Boolean excludeSubcategories) {
        this.input.put("excludeSubcategories", excludeSubcategories);
    }

    public void setIncludeCategories(java.util.List<String> includeCategories) {
        this.input.put("includeCategories", includeCategories);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MarketplaceCategoriesQueryRequest that = (MarketplaceCategoriesQueryRequest) obj;
        return Objects.equals(getOperationType(), that.getOperationType()) &&
                   Objects.equals(getOperationName(), that.getOperationName()) &&
                   Objects.equals(input, that.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperationType(), getOperationName(), input);
    }
    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static MarketplaceCategoriesQueryRequest.Builder builder() {
        return new MarketplaceCategoriesQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private Boolean excludeEmpty;
        private Boolean excludeSubcategories;
        private java.util.List<String> includeCategories;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setExcludeEmpty(Boolean excludeEmpty) {
            this.excludeEmpty = excludeEmpty;
            return this;
        }

        public Builder setExcludeSubcategories(Boolean excludeSubcategories) {
            this.excludeSubcategories = excludeSubcategories;
            return this;
        }

        public Builder setIncludeCategories(java.util.List<String> includeCategories) {
            this.includeCategories = includeCategories;
            return this;
        }


        public MarketplaceCategoriesQueryRequest build() {
            MarketplaceCategoriesQueryRequest obj = new MarketplaceCategoriesQueryRequest($alias);
            obj.setExcludeEmpty(excludeEmpty);
            obj.setExcludeSubcategories(excludeSubcategories);
            obj.setIncludeCategories(includeCategories);
            return obj;
        }

    }
}
