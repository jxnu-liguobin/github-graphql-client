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
public class ResourceQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "resource";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public ResourceQueryRequest() {
    }

    public ResourceQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setUrl(String url) {
        this.input.put("url", url);
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

    public static ResourceQueryRequest.Builder builder() {
        return new ResourceQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String url;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public ResourceQueryRequest build() {
            ResourceQueryRequest obj = new ResourceQueryRequest($alias);
            obj.setUrl(url);
            return obj;
        }

    }
}
