package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Deployment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeploymentResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeploymentResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeploymentResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.commitOid()
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0) + 1)
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.description()
        this.environment()
        this.id()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0) + 1)
            this.latestStatus(new DeploymentStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusResponseProjection.latestStatus", 0)))
        }
        this.payload()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RefResponseProjection.ref", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.state()
        if (projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0) + 1)
            this.statuses(new DeploymentStatusConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeploymentResponseProjection.DeploymentStatusConnectionResponseProjection.statuses", 0)))
        }
        this.task()
        this.updatedAt()
        this.typename()
        this
    }

    def commit(subProjection: CommitResponseProjection): DeploymentResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def commitOid(): DeploymentResponseProjection = {
        commitOid(null.asInstanceOf[String])
    }

    def commitOid(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("commitOid").alias(alias))
        this
    }

    def createdAt(): DeploymentResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def creator(subProjection: ActorResponseProjection): DeploymentResponseProjection = {
        creator(null.asInstanceOf[String], subProjection)
    }

    def creator(alias: String, subProjection: ActorResponseProjection): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection))
        this
    }

    def databaseId(): DeploymentResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def description(): DeploymentResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def environment(): DeploymentResponseProjection = {
        environment(null.asInstanceOf[String])
    }

    def environment(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("environment").alias(alias))
        this
    }

    def id(): DeploymentResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def latestStatus(subProjection: DeploymentStatusResponseProjection): DeploymentResponseProjection = {
        latestStatus(null.asInstanceOf[String], subProjection)
    }

    def latestStatus(alias: String, subProjection: DeploymentStatusResponseProjection): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("latestStatus").alias(alias).projection(subProjection))
        this
    }

    def payload(): DeploymentResponseProjection = {
        payload(null.asInstanceOf[String])
    }

    def payload(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("payload").alias(alias))
        this
    }

    def ref(subProjection: RefResponseProjection): DeploymentResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): DeploymentResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def state(): DeploymentResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def statuses(subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection = {
        statuses(null.asInstanceOf[String], subProjection)
    }

    def statuses(alias: String, subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("statuses").alias(alias).projection(subProjection))
        this
    }

    def statuses(input: DeploymentStatusesParametrizedInput,subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection = {
        statuses(null.asInstanceOf[String], input, subProjection)
    }

    def statuses(alias: String, input: DeploymentStatusesParametrizedInput , subProjection: DeploymentStatusConnectionResponseProjection): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("statuses").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def task(): DeploymentResponseProjection = {
        task(null.asInstanceOf[String])
    }

    def task(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("task").alias(alias))
        this
    }

    def updatedAt(): DeploymentResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def typename(): DeploymentResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeploymentResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
