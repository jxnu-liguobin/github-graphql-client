package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field organization in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserOrganizationParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String login;

    public UserOrganizationParametrizedInput() {
    }

    public UserOrganizationParametrizedInput(String login) {
        this.login = login;
    }

    public UserOrganizationParametrizedInput login(String login) {
        this.login = login;
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
        final UserOrganizationParametrizedInput that = (UserOrganizationParametrizedInput) obj;
        return Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (login != null) {
            joiner.add("login: " + GraphQLRequestSerializer.getEntry(login));
        }
        return joiner.toString();
    }

}
