package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QueryTO implements java.io.Serializable {

    private java.util.List<CodeOfConductTO> codesOfConduct;
    @javax.validation.constraints.NotNull
    private java.util.List<LicenseTO> licenses;
    @javax.validation.constraints.NotNull
    private GitHubMetadataTO meta;
    @javax.validation.constraints.NotNull
    private QueryTO relay;
    @javax.validation.constraints.NotNull
    private UserTO viewer;

    public QueryTO() {
    }

    public QueryTO(java.util.List<CodeOfConductTO> codesOfConduct, java.util.List<LicenseTO> licenses, GitHubMetadataTO meta, QueryTO relay, UserTO viewer) {
        this.codesOfConduct = codesOfConduct;
        this.licenses = licenses;
        this.meta = meta;
        this.relay = relay;
        this.viewer = viewer;
    }

    public java.util.List<CodeOfConductTO> getCodesOfConduct() {
        return codesOfConduct;
    }

    public java.util.List<LicenseTO> getLicenses() {
        return licenses;
    }

    public GitHubMetadataTO getMeta() {
        return meta;
    }

    public QueryTO getRelay() {
        return relay;
    }

    public UserTO getViewer() {
        return viewer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final QueryTO that = (QueryTO) obj;
        return Objects.equals(codesOfConduct, that.codesOfConduct)
            && Objects.equals(licenses, that.licenses)
            && Objects.equals(meta, that.meta)
            && Objects.equals(relay, that.relay)
            && Objects.equals(viewer, that.viewer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codesOfConduct, licenses, meta, relay, viewer);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (codesOfConduct != null) {
            joiner.add("codesOfConduct: " + GraphQLRequestSerializer.getEntry(codesOfConduct));
        }
        if (licenses != null) {
            joiner.add("licenses: " + GraphQLRequestSerializer.getEntry(licenses));
        }
        if (meta != null) {
            joiner.add("meta: " + GraphQLRequestSerializer.getEntry(meta));
        }
        if (relay != null) {
            joiner.add("relay: " + GraphQLRequestSerializer.getEntry(relay));
        }
        if (viewer != null) {
            joiner.add("viewer: " + GraphQLRequestSerializer.getEntry(viewer));
        }
        return joiner.toString();
    }

    public static QueryTO.Builder builder() {
        return new QueryTO.Builder();
    }

    public static class Builder {

        private java.util.List<CodeOfConductTO> codesOfConduct;
        private java.util.List<LicenseTO> licenses;
        private GitHubMetadataTO meta;
        private QueryTO relay;
        private UserTO viewer;

        public Builder() {
        }

        public Builder setCodesOfConduct(java.util.List<CodeOfConductTO> codesOfConduct) {
            this.codesOfConduct = codesOfConduct;
            return this;
        }

        public Builder setLicenses(java.util.List<LicenseTO> licenses) {
            this.licenses = licenses;
            return this;
        }

        public Builder setMeta(GitHubMetadataTO meta) {
            this.meta = meta;
            return this;
        }

        public Builder setRelay(QueryTO relay) {
            this.relay = relay;
            return this;
        }

        public Builder setViewer(UserTO viewer) {
            this.viewer = viewer;
            return this;
        }


        public QueryTO build() {
            return new QueryTO(codesOfConduct, licenses, meta, relay, viewer);
        }

    }
}
