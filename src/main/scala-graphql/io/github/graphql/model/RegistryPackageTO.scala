package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import RegistryPackageTypeTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageTO(
    @javax.validation.constraints.NotNull
    color: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    latestVersion: RegistryPackageVersionTO,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    nameWithOwner: String,
    @javax.validation.constraints.NotNull
    packageType: RegistryPackageTypeTO,
    registryPackageType: String,
    repository: RepositoryTO,
    statistics: RegistryPackageStatisticsTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (color != null) "color: " + GraphQLRequestSerializer.getEntry(color) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (latestVersion != null) "latestVersion: " + GraphQLRequestSerializer.getEntry(latestVersion) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (nameWithOwner != null) "nameWithOwner: " + GraphQLRequestSerializer.getEntry(nameWithOwner) else "",
            if (packageType != null) "packageType: " + GraphQLRequestSerializer.getEntry(packageType) else "",
            if (registryPackageType != null) "registryPackageType: " + GraphQLRequestSerializer.getEntry(registryPackageType) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (statistics != null) "statistics: " + GraphQLRequestSerializer.getEntry(statistics) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RegistryPackageTO {

    def builder(): RegistryPackageTO.Builder = new Builder()

    class Builder {

        private var color: String = _
        private var id: String = _
        private var latestVersion: RegistryPackageVersionTO = _
        private var name: String = _
        private var nameWithOwner: String = _
        private var packageType: RegistryPackageTypeTO = _
        private var registryPackageType: String = _
        private var repository: RepositoryTO = _
        private var statistics: RegistryPackageStatisticsTO = _

        def setColor(color: String): Builder = {
            this.color = color
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setLatestVersion(latestVersion: RegistryPackageVersionTO): Builder = {
            this.latestVersion = latestVersion
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setNameWithOwner(nameWithOwner: String): Builder = {
            this.nameWithOwner = nameWithOwner
            this
        }

        def setPackageType(packageType: RegistryPackageTypeTO): Builder = {
            this.packageType = packageType
            this
        }

        def setRegistryPackageType(registryPackageType: String): Builder = {
            this.registryPackageType = registryPackageType
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setStatistics(statistics: RegistryPackageStatisticsTO): Builder = {
            this.statistics = statistics
            this
        }

        def build(): RegistryPackageTO = new RegistryPackageTO(color, id, latestVersion, name, nameWithOwner, packageType, registryPackageType, repository, statistics)

    }
}
