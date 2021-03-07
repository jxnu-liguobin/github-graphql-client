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
public class SearchQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "search";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public SearchQueryRequest() {
    }

    public SearchQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setQuery(String query) {
        this.input.put("query", query);
    }

    public void setType(SearchTypeTO type) {
        this.input.put("type", type);
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
        final SearchQueryRequest that = (SearchQueryRequest) obj;
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

    public static SearchQueryRequest.Builder builder() {
        return new SearchQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String after;
        private String before;
        private Integer first;
        private Integer last;
        private String query;
        private SearchTypeTO type;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setType(SearchTypeTO type) {
            this.type = type;
            return this;
        }


        public SearchQueryRequest build() {
            SearchQueryRequest obj = new SearchQueryRequest($alias);
            obj.setAfter(after);
            obj.setBefore(before);
            obj.setFirst(first);
            obj.setLast(last);
            obj.setQuery(query);
            obj.setType(type);
            return obj;
        }

    }
}
