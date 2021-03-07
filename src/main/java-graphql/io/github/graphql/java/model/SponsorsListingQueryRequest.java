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
public class SponsorsListingQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "sponsorsListing";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public SponsorsListingQueryRequest() {
    }

    public SponsorsListingQueryRequest(String alias) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SponsorsListingQueryRequest that = (SponsorsListingQueryRequest) obj;
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

    public static SponsorsListingQueryRequest.Builder builder() {
        return new SponsorsListingQueryRequest.Builder();
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


        public SponsorsListingQueryRequest build() {
            SponsorsListingQueryRequest obj = new SponsorsListingQueryRequest($alias);
            obj.setSlug(slug);
            return obj;
        }

    }
}
