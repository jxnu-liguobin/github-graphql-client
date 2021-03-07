package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import TeamMemberRoleTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class TeamMemberEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    @javax.validation.constraints.NotNull
    memberAccessResourcePath: String,
    @javax.validation.constraints.NotNull
    memberAccessUrl: String,
    @javax.validation.constraints.NotNull
    node: UserTO,
    @javax.validation.constraints.NotNull
    role: TeamMemberRoleTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (memberAccessResourcePath != null) "memberAccessResourcePath: " + GraphQLRequestSerializer.getEntry(memberAccessResourcePath) else "",
            if (memberAccessUrl != null) "memberAccessUrl: " + GraphQLRequestSerializer.getEntry(memberAccessUrl) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (role != null) "role: " + GraphQLRequestSerializer.getEntry(role) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object TeamMemberEdgeTO {

    def builder(): TeamMemberEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var memberAccessResourcePath: String = _
        private var memberAccessUrl: String = _
        private var node: UserTO = _
        private var role: TeamMemberRoleTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setMemberAccessResourcePath(memberAccessResourcePath: String): Builder = {
            this.memberAccessResourcePath = memberAccessResourcePath
            this
        }

        def setMemberAccessUrl(memberAccessUrl: String): Builder = {
            this.memberAccessUrl = memberAccessUrl
            this
        }

        def setNode(node: UserTO): Builder = {
            this.node = node
            this
        }

        def setRole(role: TeamMemberRoleTO): Builder = {
            this.role = role
            this
        }

        def build(): TeamMemberEdgeTO = new TeamMemberEdgeTO(cursor, memberAccessResourcePath, memberAccessUrl, node, role)

    }
}
