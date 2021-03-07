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
public class LicenseQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "license";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public LicenseQueryRequest() {
    }

    public LicenseQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setKey(String key) {
        this.input.put("key", key);
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

    public static LicenseQueryRequest.Builder builder() {
        return new LicenseQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String key;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }


        public LicenseQueryRequest build() {
            LicenseQueryRequest obj = new LicenseQueryRequest($alias);
            obj.setKey(key);
            return obj;
        }

    }
}
