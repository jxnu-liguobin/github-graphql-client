package io.github.graphql.java.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface CommentTO {

    ActorTO getAuthor();

    @javax.validation.constraints.NotNull
    CommentAuthorAssociationTO getAuthorAssociation();

    @javax.validation.constraints.NotNull
    String getBody();

    @javax.validation.constraints.NotNull
    String getBodyHTML();

    @javax.validation.constraints.NotNull
    String getBodyText();

    @javax.validation.constraints.NotNull
    String getCreatedAt();

    boolean getCreatedViaEmail();

    ActorTO getEditor();

    @javax.validation.constraints.NotNull
    String getId();

    boolean getIncludesCreatedEdit();

    String getLastEditedAt();

    String getPublishedAt();

    @javax.validation.constraints.NotNull
    String getUpdatedAt();

    boolean getViewerDidAuthor();

}
