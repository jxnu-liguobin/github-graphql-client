package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field history in type Commit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitHistoryParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private CommitAuthorTO author;
    private String before;
    private Integer first;
    private Integer last;
    private String path;
    private String since;
    private String until;

    public CommitHistoryParametrizedInput() {
    }

    public CommitHistoryParametrizedInput(String after, CommitAuthorTO author, String before, Integer first, Integer last, String path, String since, String until) {
        this.after = after;
        this.author = author;
        this.before = before;
        this.first = first;
        this.last = last;
        this.path = path;
        this.since = since;
        this.until = until;
    }

    public CommitHistoryParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public CommitHistoryParametrizedInput author(CommitAuthorTO author) {
        this.author = author;
        return this;
    }

    public CommitHistoryParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public CommitHistoryParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public CommitHistoryParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public CommitHistoryParametrizedInput path(String path) {
        this.path = path;
        return this;
    }

    public CommitHistoryParametrizedInput since(String since) {
        this.since = since;
        return this;
    }

    public CommitHistoryParametrizedInput until(String until) {
        this.until = until;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        if (since != null) {
            joiner.add("since: " + GraphQLRequestSerializer.getEntry(since));
        }
        if (until != null) {
            joiner.add("until: " + GraphQLRequestSerializer.getEntry(until));
        }
        return joiner.toString();
    }

}
