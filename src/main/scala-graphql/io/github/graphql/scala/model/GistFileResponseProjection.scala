package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GistFile
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GistFileResponseProjection extends GraphQLResponseProjection {

    override def all$(): GistFileResponseProjection = all$(3)

    override def all$(maxDepth: Int): GistFileResponseProjection = {
        this.encodedName()
        this.encoding()
        this.extension()
        this.isImage()
        this.isTruncated()
        if (projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistFileResponseProjection.LanguageResponseProjection.language", projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0) + 1)
            this.language(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistFileResponseProjection.LanguageResponseProjection.language", 0)))
        }
        this.name()
        this.size()
        this.text()
        this.typename()
        this
    }

    def encodedName(): GistFileResponseProjection = {
        encodedName(null.asInstanceOf[String])
    }

    def encodedName(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("encodedName").alias(alias))
        this
    }

    def encoding(): GistFileResponseProjection = {
        encoding(null.asInstanceOf[String])
    }

    def encoding(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("encoding").alias(alias))
        this
    }

    def extension(): GistFileResponseProjection = {
        extension(null.asInstanceOf[String])
    }

    def extension(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("extension").alias(alias))
        this
    }

    def isImage(): GistFileResponseProjection = {
        isImage(null.asInstanceOf[String])
    }

    def isImage(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("isImage").alias(alias))
        this
    }

    def isTruncated(): GistFileResponseProjection = {
        isTruncated(null.asInstanceOf[String])
    }

    def isTruncated(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("isTruncated").alias(alias))
        this
    }

    def language(subProjection: LanguageResponseProjection): GistFileResponseProjection = {
        language(null.asInstanceOf[String], subProjection)
    }

    def language(alias: String, subProjection: LanguageResponseProjection): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("language").alias(alias).projection(subProjection))
        this
    }

    def name(): GistFileResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def size(): GistFileResponseProjection = {
        size(null.asInstanceOf[String])
    }

    def size(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("size").alias(alias))
        this
    }

    def text(): GistFileResponseProjection = {
        text(null.asInstanceOf[String])
    }

    def text(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("text").alias(alias))
        this
    }

    def text(input: GistFileTextParametrizedInput): GistFileResponseProjection = {
        text(null.asInstanceOf[String], input)
    }

    def text(alias: String, input: GistFileTextParametrizedInput ): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("text").alias(alias).parameters(input))
        this
    }

    def typename(): GistFileResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GistFileResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[GistFileResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
