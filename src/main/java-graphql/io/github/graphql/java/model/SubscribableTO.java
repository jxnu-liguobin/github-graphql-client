package io.github.graphql.java.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface SubscribableTO {

    @javax.validation.constraints.NotNull
    String getId();

    boolean getViewerCanSubscribe();

    SubscriptionStateTO getViewerSubscription();

}
