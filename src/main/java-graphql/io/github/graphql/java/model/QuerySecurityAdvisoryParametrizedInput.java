package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field securityAdvisory in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QuerySecurityAdvisoryParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String ghsaId;

    public QuerySecurityAdvisoryParametrizedInput() {
    }

    public QuerySecurityAdvisoryParametrizedInput(String ghsaId) {
        this.ghsaId = ghsaId;
    }

    public QuerySecurityAdvisoryParametrizedInput ghsaId(String ghsaId) {
        this.ghsaId = ghsaId;
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
        final QuerySecurityAdvisoryParametrizedInput that = (QuerySecurityAdvisoryParametrizedInput) obj;
        return Objects.equals(ghsaId, that.ghsaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ghsaId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (ghsaId != null) {
            joiner.add("ghsaId: " + GraphQLRequestSerializer.getEntry(ghsaId));
        }
        return joiner.toString();
    }

}
