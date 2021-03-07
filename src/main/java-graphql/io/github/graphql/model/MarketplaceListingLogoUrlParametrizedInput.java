package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field logoUrl in type MarketplaceListing
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MarketplaceListingLogoUrlParametrizedInput implements GraphQLParametrizedInput {

    private Integer size = 400;

    public MarketplaceListingLogoUrlParametrizedInput() {
    }

    public MarketplaceListingLogoUrlParametrizedInput(Integer size) {
        this.size = size;
    }

    public MarketplaceListingLogoUrlParametrizedInput size(Integer size) {
        this.size = size;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        return joiner.toString();
    }

}
