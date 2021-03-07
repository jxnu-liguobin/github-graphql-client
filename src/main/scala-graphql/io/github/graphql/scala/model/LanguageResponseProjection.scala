package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Language
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LanguageResponseProjection extends GraphQLResponseProjection {

    override def all$(): LanguageResponseProjection = all$(3)

    override def all$(maxDepth: Int): LanguageResponseProjection = {
        this.color()
        this.id()
        this.name()
        this.typename()
        this
    }

    def color(): LanguageResponseProjection = {
        color(null.asInstanceOf[String])
    }

    def color(alias: String): LanguageResponseProjection = {
        fields.add(new GraphQLResponseField("color").alias(alias))
        this
    }

    def id(): LanguageResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): LanguageResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): LanguageResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): LanguageResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def typename(): LanguageResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LanguageResponseProjection = {
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
        val that = obj.asInstanceOf[LanguageResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
