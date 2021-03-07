package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for TeamMemberEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TeamMemberEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): TeamMemberEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): TeamMemberEdgeResponseProjection = {
        this.cursor()
        this.memberAccessResourcePath()
        this.memberAccessUrl()
        if (projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamMemberEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0) + 1)
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamMemberEdgeResponseProjection.UserResponseProjection.node", 0)))
        }
        this.role()
        this.typename()
        this
    }

    def cursor(): TeamMemberEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): TeamMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def memberAccessResourcePath(): TeamMemberEdgeResponseProjection = {
        memberAccessResourcePath(null.asInstanceOf[String])
    }

    def memberAccessResourcePath(alias: String): TeamMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("memberAccessResourcePath").alias(alias))
        this
    }

    def memberAccessUrl(): TeamMemberEdgeResponseProjection = {
        memberAccessUrl(null.asInstanceOf[String])
    }

    def memberAccessUrl(alias: String): TeamMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("memberAccessUrl").alias(alias))
        this
    }

    def node(subProjection: UserResponseProjection): TeamMemberEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: UserResponseProjection): TeamMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def role(): TeamMemberEdgeResponseProjection = {
        role(null.asInstanceOf[String])
    }

    def role(alias: String): TeamMemberEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("role").alias(alias))
        this
    }

    def typename(): TeamMemberEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TeamMemberEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[TeamMemberEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
