package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for Sponsorable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface SponsorableResolver {

    @javax.validation.constraints.NotNull
    SponsorshipConnectionTO sponsorshipsAsMaintainer(SponsorableTO sponsorableTO, String after, String before, Integer first, Boolean includePrivate, Integer last, SponsorshipOrderTO orderBy) throws Exception;

    @javax.validation.constraints.NotNull
    SponsorshipConnectionTO sponsorshipsAsSponsor(SponsorableTO sponsorableTO, String after, String before, Integer first, Integer last, SponsorshipOrderTO orderBy) throws Exception;

}
