package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CommitCommentThreadTO implements java.io.Serializable, PullRequestTimelineItemTO, NodeTO, RepositoryNodeTO {

    @javax.validation.constraints.NotNull
    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private String id;
    private String path;
    private Integer position;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;

    public CommitCommentThreadTO() {
    }

    public CommitCommentThreadTO(CommitTO commit, String id, String path, Integer position, RepositoryTO repository) {
        this.commit = commit;
        this.id = id;
        this.path = path;
        this.position = position;
        this.repository = repository;
    }

    public CommitTO getCommit() {
        return commit;
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public Integer getPosition() {
        return position;
    }

    public RepositoryTO getRepository() {
        return repository;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static CommitCommentThreadTO.Builder builder() {
        return new CommitCommentThreadTO.Builder();
    }

    public static class Builder {

        private CommitTO commit;
        private String id;
        private String path;
        private Integer position;
        private RepositoryTO repository;

        public Builder() {
        }

        public Builder setCommit(CommitTO commit) {
            this.commit = commit;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = position;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }


        public CommitCommentThreadTO build() {
            return new CommitCommentThreadTO(commit, id, path, position, repository);
        }

    }
}
