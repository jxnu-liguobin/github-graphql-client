package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DraftPullRequestReviewCommentTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String path;
    private int position;

    public DraftPullRequestReviewCommentTO() {
    }

    public DraftPullRequestReviewCommentTO(String body, String path, int position) {
        this.body = body;
        this.path = path;
        this.position = position;
    }

    public String getBody() {
        return body;
    }

    public String getPath() {
        return path;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DraftPullRequestReviewCommentTO that = (DraftPullRequestReviewCommentTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(path, that.path)
            && Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, path, position);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        joiner.add("position: " + GraphQLRequestSerializer.getEntry(position));
        return joiner.toString();
    }

    public static DraftPullRequestReviewCommentTO.Builder builder() {
        return new DraftPullRequestReviewCommentTO.Builder();
    }

    public static class Builder {

        private String body;
        private String path;
        private int position;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setPosition(int position) {
            this.position = position;
            return this;
        }


        public DraftPullRequestReviewCommentTO build() {
            return new DraftPullRequestReviewCommentTO(body, path, position);
        }

    }
}
