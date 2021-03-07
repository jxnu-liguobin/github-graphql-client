package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ContentReference
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ContentReferenceResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
