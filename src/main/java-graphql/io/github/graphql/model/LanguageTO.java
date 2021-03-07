package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LanguageTO implements java.io.Serializable, NodeTO {

    private String color;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;

    public LanguageTO() {
    }

    public LanguageTO(String color, String id, String name) {
        this.color = color;
        this.id = id;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (color != null) {
            joiner.add("color: " + GraphQLRequestSerializer.getEntry(color));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static LanguageTO.Builder builder() {
        return new LanguageTO.Builder();
    }

    public static class Builder {

        private String color;
        private String id;
        private String name;

        public Builder() {
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public LanguageTO build() {
            return new LanguageTO(color, id, name);
        }

    }
}
