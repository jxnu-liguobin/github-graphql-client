package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field contributionsCollection in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserContributionsCollectionParametrizedInput implements GraphQLParametrizedInput {

    private String from;
    private String organizationID;
    private String to;

    public UserContributionsCollectionParametrizedInput() {
    }

    public UserContributionsCollectionParametrizedInput(String from, String organizationID, String to) {
        this.from = from;
        this.organizationID = organizationID;
        this.to = to;
    }

    public UserContributionsCollectionParametrizedInput from(String from) {
        this.from = from;
        return this;
    }

    public UserContributionsCollectionParametrizedInput organizationID(String organizationID) {
        this.organizationID = organizationID;
        return this;
    }

    public UserContributionsCollectionParametrizedInput to(String to) {
        this.to = to;
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
        final UserContributionsCollectionParametrizedInput that = (UserContributionsCollectionParametrizedInput) obj;
        return Objects.equals(from, that.from)
            && Objects.equals(organizationID, that.organizationID)
            && Objects.equals(to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, organizationID, to);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (from != null) {
            joiner.add("from: " + GraphQLRequestSerializer.getEntry(from));
        }
        if (organizationID != null) {
            joiner.add("organizationID: " + GraphQLRequestSerializer.getEntry(organizationID));
        }
        if (to != null) {
            joiner.add("to: " + GraphQLRequestSerializer.getEntry(to));
        }
        return joiner.toString();
    }

}
