package io.github.graphql.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public interface SubscribableTO {

    @javax.validation.constraints.NotNull
    String getId();

    boolean getViewerCanSubscribe();

    SubscriptionStateTO getViewerSubscription();

}
