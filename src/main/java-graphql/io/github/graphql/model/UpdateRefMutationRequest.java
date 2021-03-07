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
public class UpdateRefMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "updateRef";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public UpdateRefMutationRequest() {
    }

    public UpdateRefMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setInput(UpdateRefInputTO input) {
        this.input.put("input", input);
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

    public static UpdateRefMutationRequest.Builder builder() {
        return new UpdateRefMutationRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private UpdateRefInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(UpdateRefInputTO input) {
            this.input = input;
            return this;
        }


        public UpdateRefMutationRequest build() {
            UpdateRefMutationRequest obj = new UpdateRefMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
