package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestChangedFileTO implements java.io.Serializable {

    private int additions;
    private int deletions;
    @javax.validation.constraints.NotNull
    private String path;

    public PullRequestChangedFileTO() {
    }

    public PullRequestChangedFileTO(int additions, int deletions, String path) {
        this.additions = additions;
        this.deletions = deletions;
        this.path = path;
    }

    public int getAdditions() {
        return additions;
    }

    public int getDeletions() {
        return deletions;
    }

    public String getPath() {
        return path;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("additions: " + GraphQLRequestSerializer.getEntry(additions));
        joiner.add("deletions: " + GraphQLRequestSerializer.getEntry(deletions));
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        return joiner.toString();
    }

    public static PullRequestChangedFileTO.Builder builder() {
        return new PullRequestChangedFileTO.Builder();
    }

    public static class Builder {

        private int additions;
        private int deletions;
        private String path;

        public Builder() {
        }

        public Builder setAdditions(int additions) {
            this.additions = additions;
            return this;
        }

        public Builder setDeletions(int deletions) {
            this.deletions = deletions;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }


        public PullRequestChangedFileTO build() {
            return new PullRequestChangedFileTO(additions, deletions, path);
        }

    }
}
