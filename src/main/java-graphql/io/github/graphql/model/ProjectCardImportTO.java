package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ProjectCardImportTO implements java.io.Serializable {

    private int number;
    @javax.validation.constraints.NotNull
    private String repository;

    public ProjectCardImportTO() {
    }

    public ProjectCardImportTO(int number, String repository) {
        this.number = number;
        this.repository = repository;
    }

    public int getNumber() {
        return number;
    }

    public String getRepository() {
        return repository;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static ProjectCardImportTO.Builder builder() {
        return new ProjectCardImportTO.Builder();
    }

    public static class Builder {

        private int number;
        private String repository;

        public Builder() {
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = repository;
            return this;
        }


        public ProjectCardImportTO build() {
            return new ProjectCardImportTO(number, repository);
        }

    }
}
