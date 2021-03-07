package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field files in type Gist
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class GistFilesParametrizedInput implements GraphQLParametrizedInput {

    private Integer limit = 10;
    private String oid;

    public GistFilesParametrizedInput() {
    }

    public GistFilesParametrizedInput(Integer limit, String oid) {
        this.limit = limit;
        this.oid = oid;
    }

    public GistFilesParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public GistFilesParametrizedInput oid(String oid) {
        this.oid = oid;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        return joiner.toString();
    }

}
