package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryIdentifierTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String type;
    @javax.validation.constraints.NotNull
    private String value;

    public SecurityAdvisoryIdentifierTO() {
    }

    public SecurityAdvisoryIdentifierTO(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

    public static SecurityAdvisoryIdentifierTO.Builder builder() {
        return new SecurityAdvisoryIdentifierTO.Builder();
    }

    public static class Builder {

        private String type;
        private String value;

        public Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public SecurityAdvisoryIdentifierTO build() {
            return new SecurityAdvisoryIdentifierTO(type, value);
        }

    }
}
