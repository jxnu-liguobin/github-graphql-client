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
public class AddReactionMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "addReaction";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public AddReactionMutationRequest() {
    }

    public AddReactionMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setInput(AddReactionInputTO input) {
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

    public static AddReactionMutationRequest.Builder builder() {
        return new AddReactionMutationRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private AddReactionInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setInput(AddReactionInputTO input) {
            this.input = input;
            return this;
        }


        public AddReactionMutationRequest build() {
            AddReactionMutationRequest obj = new AddReactionMutationRequest($alias);
            obj.setInput(input);
            return obj;
        }

    }
}
