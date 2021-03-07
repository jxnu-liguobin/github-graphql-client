package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field team in type Organization
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class OrganizationTeamParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String slug;

    public OrganizationTeamParametrizedInput() {
    }

    public OrganizationTeamParametrizedInput(String slug) {
        this.slug = slug;
    }

    public OrganizationTeamParametrizedInput slug(String slug) {
        this.slug = slug;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        return joiner.toString();
    }

}
