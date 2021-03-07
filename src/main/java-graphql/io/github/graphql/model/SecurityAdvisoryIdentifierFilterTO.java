package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SecurityAdvisoryIdentifierFilterTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private SecurityAdvisoryIdentifierTypeTO type;
    @javax.validation.constraints.NotNull
    private String value;

    public SecurityAdvisoryIdentifierFilterTO() {
    }

    public SecurityAdvisoryIdentifierFilterTO(SecurityAdvisoryIdentifierTypeTO type, String value) {
        this.type = type;
        this.value = value;
    }

    public SecurityAdvisoryIdentifierTypeTO getType() {
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

    public static SecurityAdvisoryIdentifierFilterTO.Builder builder() {
        return new SecurityAdvisoryIdentifierFilterTO.Builder();
    }

    public static class Builder {

        private SecurityAdvisoryIdentifierTypeTO type;
        private String value;

        public Builder() {
        }

        public Builder setType(SecurityAdvisoryIdentifierTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public SecurityAdvisoryIdentifierFilterTO build() {
            return new SecurityAdvisoryIdentifierFilterTO(type, value);
        }

    }
}
