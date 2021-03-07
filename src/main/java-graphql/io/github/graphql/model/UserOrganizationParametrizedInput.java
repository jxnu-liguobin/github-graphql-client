package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field organization in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (login != null) {
            joiner.add("login: " + GraphQLRequestSerializer.getEntry(login));
        }
        return joiner.toString();
    }

}
