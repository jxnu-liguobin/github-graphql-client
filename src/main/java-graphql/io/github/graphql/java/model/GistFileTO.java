package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GistFileTO implements java.io.Serializable {

    private String encodedName;
    private String encoding;
    private String extension;
    private boolean isImage;
    private boolean isTruncated;
    private LanguageTO language;
    private String name;
    private Integer size;

    public GistFileTO() {
    }

    public GistFileTO(String encodedName, String encoding, String extension, boolean isImage, boolean isTruncated, LanguageTO language, String name, Integer size) {
        this.encodedName = encodedName;
        this.encoding = encoding;
        this.extension = extension;
        this.isImage = isImage;
        this.isTruncated = isTruncated;
        this.language = language;
        this.name = name;
        this.size = size;
    }

    public String getEncodedName() {
        return encodedName;
    }

    public String getEncoding() {
        return encoding;
    }

    public String getExtension() {
        return extension;
    }

    public boolean getIsImage() {
        return isImage;
    }

    public boolean getIsTruncated() {
        return isTruncated;
    }

    public LanguageTO getLanguage() {
        return language;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GistFileTO that = (GistFileTO) obj;
        return Objects.equals(encodedName, that.encodedName)
            && Objects.equals(encoding, that.encoding)
            && Objects.equals(extension, that.extension)
            && Objects.equals(isImage, that.isImage)
            && Objects.equals(isTruncated, that.isTruncated)
            && Objects.equals(language, that.language)
            && Objects.equals(name, that.name)
            && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodedName, encoding, extension, isImage, isTruncated, language, name, size);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (encodedName != null) {
            joiner.add("encodedName: " + GraphQLRequestSerializer.getEntry(encodedName));
        }
        if (encoding != null) {
            joiner.add("encoding: " + GraphQLRequestSerializer.getEntry(encoding));
        }
        if (extension != null) {
            joiner.add("extension: " + GraphQLRequestSerializer.getEntry(extension));
        }
        joiner.add("isImage: " + GraphQLRequestSerializer.getEntry(isImage));
        joiner.add("isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated));
        if (language != null) {
            joiner.add("language: " + GraphQLRequestSerializer.getEntry(language));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        return joiner.toString();
    }

    public static GistFileTO.Builder builder() {
        return new GistFileTO.Builder();
    }

    public static class Builder {

        private String encodedName;
        private String encoding;
        private String extension;
        private boolean isImage;
        private boolean isTruncated;
        private LanguageTO language;
        private String name;
        private Integer size;

        public Builder() {
        }

        public Builder setEncodedName(String encodedName) {
            this.encodedName = encodedName;
            return this;
        }

        public Builder setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setExtension(String extension) {
            this.extension = extension;
            return this;
        }

        public Builder setIsImage(boolean isImage) {
            this.isImage = isImage;
            return this;
        }

        public Builder setIsTruncated(boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        public Builder setLanguage(LanguageTO language) {
            this.language = language;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }


        public GistFileTO build() {
            return new GistFileTO(encodedName, encoding, extension, isImage, isTruncated, language, name, size);
        }

    }
}
