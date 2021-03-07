package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TextMatchTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String fragment;
    @javax.validation.constraints.NotNull
    private java.util.List<TextMatchHighlightTO> highlights;
    @javax.validation.constraints.NotNull
    private String property;

    public TextMatchTO() {
    }

    public TextMatchTO(String fragment, java.util.List<TextMatchHighlightTO> highlights, String property) {
        this.fragment = fragment;
        this.highlights = highlights;
        this.property = property;
    }

    public String getFragment() {
        return fragment;
    }

    public java.util.List<TextMatchHighlightTO> getHighlights() {
        return highlights;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TextMatchTO that = (TextMatchTO) obj;
        return Objects.equals(fragment, that.fragment)
            && Objects.equals(highlights, that.highlights)
            && Objects.equals(property, that.property);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fragment, highlights, property);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fragment != null) {
            joiner.add("fragment: " + GraphQLRequestSerializer.getEntry(fragment));
        }
        if (highlights != null) {
            joiner.add("highlights: " + GraphQLRequestSerializer.getEntry(highlights));
        }
        if (property != null) {
            joiner.add("property: " + GraphQLRequestSerializer.getEntry(property));
        }
        return joiner.toString();
    }

    public static TextMatchTO.Builder builder() {
        return new TextMatchTO.Builder();
    }

    public static class Builder {

        private String fragment;
        private java.util.List<TextMatchHighlightTO> highlights;
        private String property;

        public Builder() {
        }

        public Builder setFragment(String fragment) {
            this.fragment = fragment;
            return this;
        }

        public Builder setHighlights(java.util.List<TextMatchHighlightTO> highlights) {
            this.highlights = highlights;
            return this;
        }

        public Builder setProperty(String property) {
            this.property = property;
            return this;
        }


        public TextMatchTO build() {
            return new TextMatchTO(fragment, highlights, property);
        }

    }
}
