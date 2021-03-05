package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistFile
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class GistFileResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GistFileResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GistFileResponseProjection {
        this.encodedName()
        this.encoding()
        this.extension()
        this.isImage()
        this.isTruncated()
        if (projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0) <= maxDepth) {
            projectionDepthOnFields["GistFileResponseProjection.LanguageResponseProjection.language"] = projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0) + 1
            this.language(LanguageResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0)))
        }
        this.name()
        this.size()
        this.text()
        this.typename()
        return this
    }

    fun encodedName(): GistFileResponseProjection = encodedName(null)

    fun encodedName(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("encodedName").alias(alias))
        return this
    }

    fun encoding(): GistFileResponseProjection = encoding(null)

    fun encoding(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("encoding").alias(alias))
        return this
    }

    fun extension(): GistFileResponseProjection = extension(null)

    fun extension(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("extension").alias(alias))
        return this
    }

    fun isImage(): GistFileResponseProjection = isImage(null)

    fun isImage(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("isImage").alias(alias))
        return this
    }

    fun isTruncated(): GistFileResponseProjection = isTruncated(null)

    fun isTruncated(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("isTruncated").alias(alias))
        return this
    }

    fun language(subProjection: LanguageResponseProjection): GistFileResponseProjection = language(null, subProjection)

    fun language(alias: String?, subProjection: LanguageResponseProjection): GistFileResponseProjection {
        fields.add(GraphQLResponseField("language").alias(alias).projection(subProjection))
        return this
    }

    fun name(): GistFileResponseProjection = name(null)

    fun name(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun size(): GistFileResponseProjection = size(null)

    fun size(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("size").alias(alias))
        return this
    }

    fun text(): GistFileResponseProjection = text(null)

    fun text(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("text").alias(alias))
        return this
    }

    fun text(input: GistFileTextParametrizedInput): GistFileResponseProjection = text(null, input)

    fun text(alias: String?, input: GistFileTextParametrizedInput): GistFileResponseProjection {
        fields.add(GraphQLResponseField("text").alias(alias).parameters(input))
        return this
    }

    fun typename(): GistFileResponseProjection = typename(null)

    fun typename(alias: String?): GistFileResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
