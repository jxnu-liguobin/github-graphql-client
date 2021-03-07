package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
