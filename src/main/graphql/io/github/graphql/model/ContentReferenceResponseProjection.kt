package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContentReference
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContentReferenceResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContentReferenceResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContentReferenceResponseProjection {
        this.databaseId()
        this.id()
        this.reference()
        this.typename()
        return this
    }

    fun databaseId(): ContentReferenceResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ContentReferenceResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ContentReferenceResponseProjection = id(null)

    fun id(alias: String?): ContentReferenceResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun reference(): ContentReferenceResponseProjection = reference(null)

    fun reference(alias: String?): ContentReferenceResponseProjection {
        fields.add(GraphQLResponseField("reference").alias(alias))
        return this
    }

    fun typename(): ContentReferenceResponseProjection = typename(null)

    fun typename(alias: String?): ContentReferenceResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
