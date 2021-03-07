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
public class MarketplaceCategoryQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "marketplaceCategory";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public MarketplaceCategoryQueryRequest() {
    }

    public MarketplaceCategoryQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setSlug(String slug) {
        this.input.put("slug", slug);
    }

    public void setUseTopicAliases(Boolean useTopicAliases) {
        this.input.put("useTopicAliases", useTopicAliases);
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
        final MarketplaceCategoryQueryRequest that = (MarketplaceCategoryQueryRequest) obj;
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

    public static MarketplaceCategoryQueryRequest.Builder builder() {
        return new MarketplaceCategoryQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String slug;
        private Boolean useTopicAliases;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public Builder setUseTopicAliases(Boolean useTopicAliases) {
            this.useTopicAliases = useTopicAliases;
            return this;
        }


        public MarketplaceCategoryQueryRequest build() {
            MarketplaceCategoryQueryRequest obj = new MarketplaceCategoryQueryRequest($alias);
            obj.setSlug(slug);
            obj.setUseTopicAliases(useTopicAliases);
            return obj;
        }

    }
}
