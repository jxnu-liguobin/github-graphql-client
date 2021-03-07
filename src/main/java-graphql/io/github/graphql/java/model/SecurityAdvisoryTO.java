package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SecurityAdvisoryTO implements java.io.Serializable, NodeTO {

    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String ghsaId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<SecurityAdvisoryIdentifierTO> identifiers;
    @javax.validation.constraints.NotNull
    private String origin;
    @javax.validation.constraints.NotNull
    private String publishedAt;
    @javax.validation.constraints.NotNull
    private java.util.List<SecurityAdvisoryReferenceTO> references;
    @javax.validation.constraints.NotNull
    private SecurityAdvisorySeverityTO severity;
    @javax.validation.constraints.NotNull
    private String summary;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    private String withdrawnAt;

    public SecurityAdvisoryTO() {
    }

    public SecurityAdvisoryTO(Integer databaseId, String description, String ghsaId, String id, java.util.List<SecurityAdvisoryIdentifierTO> identifiers, String origin, String publishedAt, java.util.List<SecurityAdvisoryReferenceTO> references, SecurityAdvisorySeverityTO severity, String summary, String updatedAt, String withdrawnAt) {
        this.databaseId = databaseId;
        this.description = description;
        this.ghsaId = ghsaId;
        this.id = id;
        this.identifiers = identifiers;
        this.origin = origin;
        this.publishedAt = publishedAt;
        this.references = references;
        this.severity = severity;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.withdrawnAt = withdrawnAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getDescription() {
        return description;
    }

    public String getGhsaId() {
        return ghsaId;
    }

    public String getId() {
        return id;
    }

    public java.util.List<SecurityAdvisoryIdentifierTO> getIdentifiers() {
        return identifiers;
    }

    public String getOrigin() {
        return origin;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public java.util.List<SecurityAdvisoryReferenceTO> getReferences() {
        return references;
    }

    public SecurityAdvisorySeverityTO getSeverity() {
        return severity;
    }

    public String getSummary() {
        return summary;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getWithdrawnAt() {
        return withdrawnAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SecurityAdvisoryTO that = (SecurityAdvisoryTO) obj;
        return Objects.equals(databaseId, that.databaseId)
            && Objects.equals(description, that.description)
            && Objects.equals(ghsaId, that.ghsaId)
            && Objects.equals(id, that.id)
            && Objects.equals(identifiers, that.identifiers)
            && Objects.equals(origin, that.origin)
            && Objects.equals(publishedAt, that.publishedAt)
            && Objects.equals(references, that.references)
            && Objects.equals(severity, that.severity)
            && Objects.equals(summary, that.summary)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(withdrawnAt, that.withdrawnAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseId, description, ghsaId, id, identifiers, origin, publishedAt, references, severity, summary, updatedAt, withdrawnAt);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (ghsaId != null) {
            joiner.add("ghsaId: " + GraphQLRequestSerializer.getEntry(ghsaId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (identifiers != null) {
            joiner.add("identifiers: " + GraphQLRequestSerializer.getEntry(identifiers));
        }
        if (origin != null) {
            joiner.add("origin: " + GraphQLRequestSerializer.getEntry(origin));
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
        }
        if (references != null) {
            joiner.add("references: " + GraphQLRequestSerializer.getEntry(references));
        }
        if (severity != null) {
            joiner.add("severity: " + GraphQLRequestSerializer.getEntry(severity));
        }
        if (summary != null) {
            joiner.add("summary: " + GraphQLRequestSerializer.getEntry(summary));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (withdrawnAt != null) {
            joiner.add("withdrawnAt: " + GraphQLRequestSerializer.getEntry(withdrawnAt));
        }
        return joiner.toString();
    }

    public static SecurityAdvisoryTO.Builder builder() {
        return new SecurityAdvisoryTO.Builder();
    }

    public static class Builder {

        private Integer databaseId;
        private String description;
        private String ghsaId;
        private String id;
        private java.util.List<SecurityAdvisoryIdentifierTO> identifiers;
        private String origin;
        private String publishedAt;
        private java.util.List<SecurityAdvisoryReferenceTO> references;
        private SecurityAdvisorySeverityTO severity;
        private String summary;
        private String updatedAt;
        private String withdrawnAt;

        public Builder() {
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setGhsaId(String ghsaId) {
            this.ghsaId = ghsaId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIdentifiers(java.util.List<SecurityAdvisoryIdentifierTO> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        public Builder setOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Builder setReferences(java.util.List<SecurityAdvisoryReferenceTO> references) {
            this.references = references;
            return this;
        }

        public Builder setSeverity(SecurityAdvisorySeverityTO severity) {
            this.severity = severity;
            return this;
        }

        public Builder setSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setWithdrawnAt(String withdrawnAt) {
            this.withdrawnAt = withdrawnAt;
            return this;
        }


        public SecurityAdvisoryTO build() {
            return new SecurityAdvisoryTO(databaseId, description, ghsaId, id, identifiers, origin, publishedAt, references, severity, summary, updatedAt, withdrawnAt);
        }

    }
}
