package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SecurityAdvisoryReferenceTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String url;

    public SecurityAdvisoryReferenceTO() {
    }

    public SecurityAdvisoryReferenceTO(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static SecurityAdvisoryReferenceTO.Builder builder() {
        return new SecurityAdvisoryReferenceTO.Builder();
    }

    public static class Builder {

        private String url;

        public Builder() {
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public SecurityAdvisoryReferenceTO build() {
            return new SecurityAdvisoryReferenceTO(url);
        }

    }
}
