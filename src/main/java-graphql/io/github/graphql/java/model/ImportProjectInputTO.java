package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ImportProjectInputTO implements java.io.Serializable {

    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectColumnImportTO> columnImports;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String ownerName;
    private Boolean Public = false;

    public ImportProjectInputTO() {
    }

    public ImportProjectInputTO(String body, String clientMutationId, java.util.List<ProjectColumnImportTO> columnImports, String name, String ownerName, Boolean Public) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.columnImports = columnImports;
        this.name = name;
        this.ownerName = ownerName;
        this.Public = Public;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public java.util.List<ProjectColumnImportTO> getColumnImports() {
        return columnImports;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Boolean getPublic() {
        return Public;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ImportProjectInputTO that = (ImportProjectInputTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(columnImports, that.columnImports)
            && Objects.equals(name, that.name)
            && Objects.equals(ownerName, that.ownerName)
            && Objects.equals(Public, that.Public);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, clientMutationId, columnImports, name, ownerName, Public);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (columnImports != null) {
            joiner.add("columnImports: " + GraphQLRequestSerializer.getEntry(columnImports));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ownerName != null) {
            joiner.add("ownerName: " + GraphQLRequestSerializer.getEntry(ownerName));
        }
        if (Public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(Public));
        }
        return joiner.toString();
    }

    public static ImportProjectInputTO.Builder builder() {
        return new ImportProjectInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private java.util.List<ProjectColumnImportTO> columnImports;
        private String name;
        private String ownerName;
        private Boolean Public = false;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setColumnImports(java.util.List<ProjectColumnImportTO> columnImports) {
            this.columnImports = columnImports;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder setPublic(Boolean Public) {
            this.Public = Public;
            return this;
        }


        public ImportProjectInputTO build() {
            return new ImportProjectInputTO(body, clientMutationId, columnImports, name, ownerName, Public);
        }

    }
}
