package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LicenseRuleTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String label;

    public LicenseRuleTO() {
    }

    public LicenseRuleTO(String description, String key, String label) {
        this.description = description;
        this.key = key;
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final LicenseRuleTO that = (LicenseRuleTO) obj;
        return Objects.equals(description, that.description)
            && Objects.equals(key, that.key)
            && Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, key, label);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (label != null) {
            joiner.add("label: " + GraphQLRequestSerializer.getEntry(label));
        }
        return joiner.toString();
    }

    public static LicenseRuleTO.Builder builder() {
        return new LicenseRuleTO.Builder();
    }

    public static class Builder {

        private String description;
        private String key;
        private String label;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }


        public LicenseRuleTO build() {
            return new LicenseRuleTO(description, key, label);
        }

    }
}
