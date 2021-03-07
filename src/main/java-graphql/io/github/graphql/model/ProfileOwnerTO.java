package io.github.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public interface ProfileOwnerTO {

    String getEmail();

    @javax.validation.constraints.NotNull
    String getId();

    @javax.validation.constraints.NotNull
    ProfileItemShowcaseTO getItemShowcase();

    String getLocation();

    @javax.validation.constraints.NotNull
    String getLogin();

    String getName();

    int getPinnedItemsRemaining();

    boolean getViewerCanChangePinnedItems();

    String getWebsiteUrl();

}
