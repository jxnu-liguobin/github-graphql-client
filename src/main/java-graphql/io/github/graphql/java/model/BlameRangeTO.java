package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class BlameRangeTO implements java.io.Serializable {

    private int age;
    @javax.validation.constraints.NotNull
    private CommitTO commit;
    private int endingLine;
    private int startingLine;

    public BlameRangeTO() {
    }

    public BlameRangeTO(int age, CommitTO commit, int endingLine, int startingLine) {
        this.age = age;
        this.commit = commit;
        this.endingLine = endingLine;
        this.startingLine = startingLine;
    }

    public int getAge() {
        return age;
    }

    public CommitTO getCommit() {
        return commit;
    }

    public int getEndingLine() {
        return endingLine;
    }

    public int getStartingLine() {
        return startingLine;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BlameRangeTO that = (BlameRangeTO) obj;
        return Objects.equals(age, that.age)
            && Objects.equals(commit, that.commit)
            && Objects.equals(endingLine, that.endingLine)
            && Objects.equals(startingLine, that.startingLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, commit, endingLine, startingLine);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("age: " + GraphQLRequestSerializer.getEntry(age));
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit));
        }
        joiner.add("endingLine: " + GraphQLRequestSerializer.getEntry(endingLine));
        joiner.add("startingLine: " + GraphQLRequestSerializer.getEntry(startingLine));
        return joiner.toString();
    }

    public static BlameRangeTO.Builder builder() {
        return new BlameRangeTO.Builder();
    }

    public static class Builder {

        private int age;
        private CommitTO commit;
        private int endingLine;
        private int startingLine;

        public Builder() {
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCommit(CommitTO commit) {
            this.commit = commit;
            return this;
        }

        public Builder setEndingLine(int endingLine) {
            this.endingLine = endingLine;
            return this;
        }

        public Builder setStartingLine(int startingLine) {
            this.startingLine = startingLine;
            return this;
        }


        public BlameRangeTO build() {
            return new BlameRangeTO(age, commit, endingLine, startingLine);
        }

    }
}
