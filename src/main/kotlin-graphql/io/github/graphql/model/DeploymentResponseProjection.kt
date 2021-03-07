package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Deployment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DeploymentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeploymentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeploymentResponseProjection {
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.commitOid()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentResponseProjection.ActorResponseProjection.creator"] = projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0) + 1
            this.creator(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.description()
        this.environment()
        this.id()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus"] = projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0) + 1
            this.latestStatus(DeploymentStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0)))
        }
        this.payload()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.state()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0) <= maxDepth) {
            projectionDepthOnFields["DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses"] = projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0) + 1
            this.statuses(DeploymentStatusConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0)))
        }
        this.task()
        this.updatedAt()
        this.typename()
        return this
    }

    fun commit(subProjection: CommitResponseProjection): DeploymentResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun commitOid(): DeploymentResponseProjection = commitOid(null)

    fun commitOid(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("commitOid").alias(alias))
        return this
    }

    fun createdAt(): DeploymentResponseProjection = createdAt(null)

    fun createdAt(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun creator(subProjection: ActorResponseProjection): DeploymentResponseProjection = creator(null, subProjection)

    fun creator(alias: String?, subProjection: ActorResponseProjection): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("creator").alias(alias).projection(subProjection))
        return this
    }

    fun databaseId(): DeploymentResponseProjection = databaseId(null)

    fun databaseId(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun description(): DeploymentResponseProjection = description(null)

    fun description(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun environment(): DeploymentResponseProjection = environment(null)

    fun environment(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("environment").alias(alias))
        return this
    }

    fun id(): DeploymentResponseProjection = id(null)

    fun id(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun latestStatus(subProjection: DeploymentStatusResponseProjection): DeploymentResponseProjection = latestStatus(null, subProjection)

    fun latestStatus(alias: String?, subProjection: DeploymentStatusResponseProjection): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("latestStatus").alias(alias).projection(subProjection))
        return this
    }

    fun payload(): DeploymentResponseProjection = payload(null)

    fun payload(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("payload").alias(alias))
        return this
    }

    fun ref(subProjection: RefResponseProjection): DeploymentResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): DeploymentResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun state(): DeploymentResponseProjection = state(null)

    fun state(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun statuses(subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection = statuses(null, subProjection)

    fun statuses(alias: String?, subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("statuses").alias(alias).projection(subProjection))
        return this
    }

    fun statuses(input: DeploymentStatusesParametrizedInput, subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection = statuses(null, input, subProjection)

    fun statuses(alias: String?, input: DeploymentStatusesParametrizedInput, subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("statuses").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun task(): DeploymentResponseProjection = task(null)

    fun task(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("task").alias(alias))
        return this
    }

    fun updatedAt(): DeploymentResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun typename(): DeploymentResponseProjection = typename(null)

    fun typename(alias: String?): DeploymentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
