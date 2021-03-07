package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field versionsByMetadatum in type RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageVersionsByMetadatumParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    @javax.validation.constraints.NotNull
    private RegistryPackageMetadatumTO metadatum;

    public RegistryPackageVersionsByMetadatumParametrizedInput() {
    }

    public RegistryPackageVersionsByMetadatumParametrizedInput(String after, String before, Integer first, Integer last, RegistryPackageMetadatumTO metadatum) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.metadatum = metadatum;
    }

    public RegistryPackageVersionsByMetadatumParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public RegistryPackageVersionsByMetadatumParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public RegistryPackageVersionsByMetadatumParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public RegistryPackageVersionsByMetadatumParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public RegistryPackageVersionsByMetadatumParametrizedInput metadatum(RegistryPackageMetadatumTO metadatum) {
        this.metadatum = metadatum;
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
        final RegistryPackageVersionsByMetadatumParametrizedInput that = (RegistryPackageVersionsByMetadatumParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(metadatum, that.metadatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, first, last, metadatum);
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
        if (metadatum != null) {
            joiner.add("metadatum: " + GraphQLRequestSerializer.getEntry(metadatum));
        }
        return joiner.toString();
    }

}
