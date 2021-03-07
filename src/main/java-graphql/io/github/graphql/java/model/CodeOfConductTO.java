package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CodeOfConductTO implements java.io.Serializable, NodeTO {

    private String body;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String name;
    private String resourcePath;
    private String url;

    public CodeOfConductTO() {
    }

    public CodeOfConductTO(String body, String id, String key, String name, String resourcePath, String url) {
        this.body = body;
        this.id = id;
        this.key = key;
        this.name = name;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public String getBody() {
        return body;
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CodeOfConductTO that = (CodeOfConductTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(id, that.id)
            && Objects.equals(key, that.key)
            && Objects.equals(name, that.name)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, id, key, name, resourcePath, url);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static CodeOfConductTO.Builder builder() {
        return new CodeOfConductTO.Builder();
    }

    public static class Builder {

        private String body;
        private String id;
        private String key;
        private String name;
        private String resourcePath;
        private String url;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public CodeOfConductTO build() {
            return new CodeOfConductTO(body, id, key, name, resourcePath, url);
        }

    }
}
