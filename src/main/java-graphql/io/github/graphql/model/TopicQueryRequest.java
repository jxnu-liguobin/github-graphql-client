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
public class TopicQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "topic";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public TopicQueryRequest() {
    }

    public TopicQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setName(String name) {
        this.input.put("name", name);
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

    public static TopicQueryRequest.Builder builder() {
        return new TopicQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String name;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public TopicQueryRequest build() {
            TopicQueryRequest obj = new TopicQueryRequest($alias);
            obj.setName(name);
            return obj;
        }

    }
}
