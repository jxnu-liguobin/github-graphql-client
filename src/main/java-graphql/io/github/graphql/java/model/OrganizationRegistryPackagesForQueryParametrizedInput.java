package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field registryPackagesForQuery in type Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class OrganizationRegistryPackagesForQueryParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private RegistryPackageTypeTO packageType;
    private String query;

    public OrganizationRegistryPackagesForQueryParametrizedInput() {
    }

    public OrganizationRegistryPackagesForQueryParametrizedInput(String after, String before, Integer first, Integer last, RegistryPackageTypeTO packageType, String query) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.packageType = packageType;
        this.query = query;
    }

    public OrganizationRegistryPackagesForQueryParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public OrganizationRegistryPackagesForQueryParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public OrganizationRegistryPackagesForQueryParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public OrganizationRegistryPackagesForQueryParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public OrganizationRegistryPackagesForQueryParametrizedInput packageType(RegistryPackageTypeTO packageType) {
        this.packageType = packageType;
        return this;
    }

    public OrganizationRegistryPackagesForQueryParametrizedInput query(String query) {
        this.query = query;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final OrganizationRegistryPackagesForQueryParametrizedInput that = (OrganizationRegistryPackagesForQueryParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(packageType, that.packageType)
            && Objects.equals(query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, last, packageType, query);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
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
        if (packageType != null) {
            joiner.add("packageType: " + GraphQLRequestSerializer.getEntry(packageType));
        }
        if (query != null) {
            joiner.add("query: " + GraphQLRequestSerializer.getEntry(query));
        }
        return joiner.toString();
    }

}
