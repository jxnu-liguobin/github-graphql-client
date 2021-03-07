package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sponsorshipsAsMaintainer in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UserSponsorshipsAsMaintainerParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Boolean includePrivate = false;
    private Integer last;
    private SponsorshipOrderTO orderBy;

    public UserSponsorshipsAsMaintainerParametrizedInput() {
    }

    public UserSponsorshipsAsMaintainerParametrizedInput(String after, String before, Integer first, Boolean includePrivate, Integer last, SponsorshipOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.includePrivate = includePrivate;
        this.last = last;
        this.orderBy = orderBy;
    }

    public UserSponsorshipsAsMaintainerParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserSponsorshipsAsMaintainerParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserSponsorshipsAsMaintainerParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserSponsorshipsAsMaintainerParametrizedInput includePrivate(Boolean includePrivate) {
        this.includePrivate = includePrivate;
        return this;
    }

    public UserSponsorshipsAsMaintainerParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserSponsorshipsAsMaintainerParametrizedInput orderBy(SponsorshipOrderTO orderBy) {
        this.orderBy = orderBy;
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
        if (includePrivate != null) {
            joiner.add("includePrivate: " + GraphQLRequestSerializer.getEntry(includePrivate));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        return joiner.toString();
    }

}
