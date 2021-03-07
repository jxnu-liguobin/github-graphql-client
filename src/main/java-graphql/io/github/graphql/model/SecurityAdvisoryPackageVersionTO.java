package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class SecurityAdvisoryPackageVersionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String identifier;

    public SecurityAdvisoryPackageVersionTO() {
    }

    public SecurityAdvisoryPackageVersionTO(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (identifier != null) {
            joiner.add("identifier: " + GraphQLRequestSerializer.getEntry(identifier));
        }
        return joiner.toString();
    }

    public static SecurityAdvisoryPackageVersionTO.Builder builder() {
        return new SecurityAdvisoryPackageVersionTO.Builder();
    }

    public static class Builder {

        private String identifier;

        public Builder() {
        }

        public Builder setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }


        public SecurityAdvisoryPackageVersionTO build() {
            return new SecurityAdvisoryPackageVersionTO(identifier);
        }

    }
}
