package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field releaseAssets in type Release
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReleaseReleaseAssetsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private String name;

    public ReleaseReleaseAssetsParametrizedInput() {
    }

    public ReleaseReleaseAssetsParametrizedInput(String after, String before, Integer first, Integer last, String name) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.name = name;
    }

    public ReleaseReleaseAssetsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ReleaseReleaseAssetsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ReleaseReleaseAssetsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ReleaseReleaseAssetsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public ReleaseReleaseAssetsParametrizedInput name(String name) {
        this.name = name;
        return this;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

}
