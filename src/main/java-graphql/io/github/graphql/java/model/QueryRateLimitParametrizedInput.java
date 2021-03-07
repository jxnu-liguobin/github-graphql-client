package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field rateLimit in type Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QueryRateLimitParametrizedInput implements GraphQLParametrizedInput {

    private Boolean dryRun = false;

    public QueryRateLimitParametrizedInput() {
    }

    public QueryRateLimitParametrizedInput(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public QueryRateLimitParametrizedInput dryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        final QueryRateLimitParametrizedInput that = (QueryRateLimitParametrizedInput) obj;
        return Objects.equals(dryRun, that.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (dryRun != null) {
            joiner.add("dryRun: " + GraphQLRequestSerializer.getEntry(dryRun));
        }
        return joiner.toString();
    }

}
