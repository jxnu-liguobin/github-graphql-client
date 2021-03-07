package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MarketplaceListingQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "marketplaceListing";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public MarketplaceListingQueryRequest() {
    }

    public MarketplaceListingQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setSlug(String slug) {
        this.input.put("slug", slug);
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
    public String toString() {
        return Objects.toString(input);
    }

    public static MarketplaceListingQueryRequest.Builder builder() {
        return new MarketplaceListingQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String slug;

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


        public MarketplaceListingQueryRequest build() {
            MarketplaceListingQueryRequest obj = new MarketplaceListingQueryRequest($alias);
            obj.setSlug(slug);
            return obj;
        }

    }
}
