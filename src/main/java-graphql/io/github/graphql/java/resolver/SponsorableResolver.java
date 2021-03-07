package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for Sponsorable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface SponsorableResolver {

    @javax.validation.constraints.NotNull
    SponsorshipConnectionTO sponsorshipsAsMaintainer(SponsorableTO sponsorableTO, String after, String before, Integer first, Boolean includePrivate, Integer last, SponsorshipOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    SponsorshipConnectionTO sponsorshipsAsSponsor(SponsorableTO sponsorableTO, String after, String before, Integer first, Integer last, SponsorshipOrderTO orderBy) throws Exception;

}
