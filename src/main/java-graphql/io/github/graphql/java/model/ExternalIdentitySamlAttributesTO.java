package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ExternalIdentitySamlAttributesTO implements java.io.Serializable {

    private String nameId;

    public ExternalIdentitySamlAttributesTO() {
    }

    public ExternalIdentitySamlAttributesTO(String nameId) {
        this.nameId = nameId;
    }

    public String getNameId() {
        return nameId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ExternalIdentitySamlAttributesTO that = (ExternalIdentitySamlAttributesTO) obj;
        return Objects.equals(nameId, that.nameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (nameId != null) {
            joiner.add("nameId: " + GraphQLRequestSerializer.getEntry(nameId));
        }
        return joiner.toString();
    }

    public static ExternalIdentitySamlAttributesTO.Builder builder() {
        return new ExternalIdentitySamlAttributesTO.Builder();
    }

    public static class Builder {

        private String nameId;

        public Builder() {
        }

        public Builder setNameId(String nameId) {
            this.nameId = nameId;
            return this;
        }


        public ExternalIdentitySamlAttributesTO build() {
            return new ExternalIdentitySamlAttributesTO(nameId);
        }

    }
}
