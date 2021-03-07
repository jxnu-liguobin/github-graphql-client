package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SecurityAdvisoryPackageVersionTO that = (SecurityAdvisoryPackageVersionTO) obj;
        return Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
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
