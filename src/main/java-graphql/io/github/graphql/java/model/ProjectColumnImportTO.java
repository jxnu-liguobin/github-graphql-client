package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProjectColumnImportTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String columnName;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectCardImportTO> issues;
    private int position;

    public ProjectColumnImportTO() {
    }

    public ProjectColumnImportTO(String columnName, java.util.List<ProjectCardImportTO> issues, int position) {
        this.columnName = columnName;
        this.issues = issues;
        this.position = position;
    }

    public String getColumnName() {
        return columnName;
    }

    public java.util.List<ProjectCardImportTO> getIssues() {
        return issues;
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
        final ProjectColumnImportTO that = (ProjectColumnImportTO) obj;
        return Objects.equals(columnName, that.columnName)
            && Objects.equals(issues, that.issues)
            && Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, issues, position);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (columnName != null) {
            joiner.add("columnName: " + GraphQLRequestSerializer.getEntry(columnName));
        }
        if (issues != null) {
            joiner.add("issues: " + GraphQLRequestSerializer.getEntry(issues));
        }
        joiner.add("position: " + GraphQLRequestSerializer.getEntry(position));
        return joiner.toString();
    }

    public static ProjectColumnImportTO.Builder builder() {
        return new ProjectColumnImportTO.Builder();
    }

    public static class Builder {

        private String columnName;
        private java.util.List<ProjectCardImportTO> issues;
        private int position;

        public Builder() {
        }

        public Builder setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        public Builder setIssues(java.util.List<ProjectCardImportTO> issues) {
            this.issues = issues;
            return this;
        }

        public Builder setPosition(int position) {
            this.position = position;
            return this;
        }


        public ProjectColumnImportTO build() {
            return new ProjectColumnImportTO(columnName, issues, position);
        }

    }
}
