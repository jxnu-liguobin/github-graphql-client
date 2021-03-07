package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContentReference
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContentReferenceResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContentReferenceResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContentReferenceResponseProjection = {
        this.databaseId()
        this.id()
        this.reference()
        this.typename()
        this
    }

    def databaseId(): ContentReferenceResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ContentReferenceResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ContentReferenceResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ContentReferenceResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def reference(): ContentReferenceResponseProjection = {
        reference(null.asInstanceOf[String])
    }

    def reference(alias: String): ContentReferenceResponseProjection = {
        fields.add(new GraphQLResponseField("reference").alias(alias))
        this
    }

    def typename(): ContentReferenceResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContentReferenceResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
