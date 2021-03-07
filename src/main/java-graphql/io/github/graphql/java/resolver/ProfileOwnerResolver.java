package io.github.graphql.java.resolver;

import io.github.graphql.java.model.*;

/**
 * Resolver for ProfileOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface ProfileOwnerResolver {

    boolean anyPinnableItems(ProfileOwnerTO profileOwnerTO, PinnableItemTypeTO type) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnableItems(ProfileOwnerTO profileOwnerTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

    @javax.validation.constraints.NotNull
    PinnableItemConnectionTO pinnedItems(ProfileOwnerTO profileOwnerTO, String after, String before, Integer first, Integer last, java.util.List<PinnableItemTypeTO> types) throws Exception;

}
